package unicauca.movil.planetas.db

import android.arch.persistence.room.*
import unicauca.movil.planetas.models.Destino

@Dao
interface DestinoDao {

    @Insert
    fun insert(destino: Destino)

    @Update
    fun update(destino: Destino)

    @Delete
    fun delete(destino: Destino)

    @Query("SELECT * FROM destino WHERE id = :id")
    fun destinoById(id:Long): Destino

    @Query("SELECT * FROM destino")
    fun all():List<Destino>
}