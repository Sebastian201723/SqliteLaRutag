package unicauca.movil.planetas.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import unicauca.movil.planetas.models.Destino

@Database(entities = arrayOf(Destino::class),version = 1)
abstract class Database : RoomDatabase(){

    abstract fun destinoDao(): DestinoDao

}