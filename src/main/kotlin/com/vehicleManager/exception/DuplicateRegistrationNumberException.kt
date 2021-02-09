package com.vehicleManager.exception

import com.vehicleManager.exception.vehicleExceptions.VehicleException

class DuplicateRegistrationNumberException constructor(message: String): VehicleException(message) {

}
