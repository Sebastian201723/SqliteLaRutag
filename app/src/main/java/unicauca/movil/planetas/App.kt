package unicauca.movil.planetas

import android.app.Application
import unicauca.movil.planetas.db.AppDB

/**
 * Created by darfe on 22/11/2017.
 */
class App:Application(){

    override fun onCreate() {
        super.onCreate()
        AppDB.init(this)
    }

}