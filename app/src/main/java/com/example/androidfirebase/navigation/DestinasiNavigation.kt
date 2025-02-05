package com.example.androidfirebase.navigation

interface DestinasiNavigation {
    val route: String
    val titleRes: String
}

object DestinasiHome : DestinasiNavigation {
    override val route: String = "home"
    override val titleRes: String = "Home"
}
object DestinasiInsert : DestinasiNavigation {
    override val route: String = "insert"
    override val titleRes: String = "Insert"
}
