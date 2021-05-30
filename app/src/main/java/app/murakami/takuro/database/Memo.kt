package app.murakami.takuro.database

import io.realm.Realm
import io.realm.RealmObject

open class Memo (
    open var title: String = "",
    open var content: String = ""
    ):RealmObject()