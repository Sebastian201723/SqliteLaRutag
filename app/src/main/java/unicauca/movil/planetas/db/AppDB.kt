package unicauca.movil.planetas.db

import android.arch.persistence.room.Room
import android.content.Context

/**
 * Created by darfe on 22/11/2017.
 */
object AppDB{
    lateinit var db:Database

    fun init(context:Context){
        db = Room.databaseBuilder(context, Database::class.java, "planetas")
                .build()
    }
}