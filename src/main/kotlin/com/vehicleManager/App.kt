package com.vehicleManager

import com.vehicleManager.di.components.DaggerVehicleAppComponent

fun main() {

    var component = DaggerVehicleAppComponent.builder().build()
    var httpServer = component.server()
    httpServer.start()

}



