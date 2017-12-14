package unicauca.movil.planetas.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.Ignore
import android.arch.persistence.room.PrimaryKey

@Entity
class Destino(var nombre: String, var visitantes: Float, var precio: Float, var imagen:String, var sinopsis:String  ) {
    @PrimaryKey(autoGenerate = true)
    var id: Long? = null

    @Ignore
    constructor():this("",0f,0f,"","")
}
