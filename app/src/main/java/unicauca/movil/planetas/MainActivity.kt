package unicauca.movil.planetas

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.async
import org.jetbrains.anko.coroutines.experimental.bg
import org.jetbrains.anko.startActivity
import unicauca.movil.planetas.adapters.PlanetaAdapter
import unicauca.movil.planetas.databinding.ActivityMainBinding
import unicauca.movil.planetas.db.AppDB
import unicauca.movil.planetas.db.PlanetaDao
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val adapter: PlanetaAdapter = PlanetaAdapter()
    val dao:PlanetaDao = AppDB.db.planetaDao()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.handler = this
        list.adapter = adapter
    }

    override fun onResume() {
        super.onResume()
        async(UI){
            adapter.data = bg { dao.all() }.await()
        }

    }

    fun goToAdd(){
        startActivity<AddActivity>()
    }

}
