package unicauca.movil.planetas.db

import android.arch.persistence.room.Room
import android.content.Context


object AppDB{
    lateinit var db:Database

    fun init(context:Context){
        db = Room.databaseBuilder(context, Database::class.java, "destinos")
                .build()
    }
}