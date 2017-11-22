package unicauca.movil.planetas.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.Ignore
import android.arch.persistence.room.PrimaryKey

@Entity
class Planeta(var nombre: String, var gravedad: Float) {
    @PrimaryKey(autoGenerate = true)
    var id: Long? = null

    @Ignore
    constructor():this("",0f)
}
