package unicauca.movil.planetas

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add.*

import unicauca.movil.planetas.databinding.ActivityAddBinding
import unicauca.movil.planetas.db.AppDB
import unicauca.movil.planetas.db.PlanetaDao
import unicauca.movil.planetas.models.Planeta
import unicauca.movil.planetas.util.text
import kotlin.concurrent.thread

class AddActivity : AppCompatActivity() {

    lateinit var binding: ActivityAddBinding
    val dao:PlanetaDao = AppDB.db.planetaDao()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add)
        binding.handler = this
    }

    fun save() {
        val name = name.text()
        val gravity = gravity.text()
        val planeta = Planeta(name, gravity.toFloat())

        thread{
            dao.insert(planeta)
            runOnUiThread {
                finish()
            }
        }
    }
}
