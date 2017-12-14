package unicauca.movil.planetas.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import unicauca.movil.planetas.models.Destino

/**
 * Created by darfe on 22/11/2017.
 */
@Database(entities = arrayOf(Destino::class),version = 1)
abstract class Database : RoomDatabase(){

    abstract fun destinoDao(): DestinoDao

}