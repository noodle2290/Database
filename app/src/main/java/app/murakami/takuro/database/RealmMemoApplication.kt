package app.murakami.takuro.database

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration
import java.nio.file.Files.delete

class RealmMemoApplication : Application(){
    override fun onCreate() {
        super.onCreate()

        Realm.init(this)
        val realmConfig = RealmConfiguration.Builder()
            .deleteRealmIfMigrationNeeded()
            .build()
        Realm.setDefaultConfiguration(realmConfig)
    }


}