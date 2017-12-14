package unicauca.movil.planetas

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add.*

import unicauca.movil.planetas.databinding.ActivityAddBinding
import unicauca.movil.planetas.db.AppDB
import unicauca.movil.planetas.db.DestinoDao
import unicauca.movil.planetas.models.Destino
import unicauca.movil.planetas.util.text
import kotlin.concurrent.thread

class AddActivity : AppCompatActivity() {

    lateinit var binding: ActivityAddBinding
    val dao: DestinoDao = AppDB.db.destinoDao()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add)
        binding.handler = this
    }

    fun save() {
        val name = name.text()
        val precio = precio.text()
        val visitors = visitors.text()
        val img = img.text()
        val sinopsis = sinopsis.text()
        val destino = Destino(name,  visitors.toFloat(),precio.toFloat(),img, sinopsis)

        thread{
            dao.insert(destino)
            runOnUiThread {
                finish()
            }
        }
    }
}
