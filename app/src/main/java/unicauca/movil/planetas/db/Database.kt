package unicauca.movil.planetas.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import unicauca.movil.planetas.models.Planeta

/**
 * Created by darfe on 22/11/2017.
 */
@Database(entities = arrayOf(Planeta::class),version = 1)
abstract class Database : RoomDatabase(){

    abstract fun planetaDao():PlanetaDao


}