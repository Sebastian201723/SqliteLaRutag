package unicauca.movil.planetas

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import unicauca.movil.planetas.adapters.PlanetaAdapter
import unicauca.movil.planetas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val adapter: PlanetaAdapter = PlanetaAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.handler = this
        list.adapter = adapter
    }

    fun goToAdd(){
        startActivity<AddActivity>()
    }

}
