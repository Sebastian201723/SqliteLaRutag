package unicauca.movil.planetas.db

import android.arch.persistence.room.*
import unicauca.movil.planetas.models.Planeta

@Dao
interface PlanetaDao{

    @Insert
    fun insert(planeta:Planeta)

    @Update
    fun update(planeta: Planeta)

    @Delete
    fun delete(planeta: Planeta)

    @Query("SELECT * FROM planeta WHERE id = :id")
    fun planetaById(id:Long):Planeta

    @Query("SELECT * FROM planeta")
    fun all():List<Planeta>

}