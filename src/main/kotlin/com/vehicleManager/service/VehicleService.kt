package com.vehicleManager.service

import com.vehicleManager.exception.vehicleExceptions.InvalidVehicleDataException
import com.vehicleManager.exception.vehicleExceptions.VehicleException
import com.vehicleManager.exception.vehicleExceptions.VehicleNotFoundException
import com.vehicleManager.models.Vehicle
import com.vehicleManager.repository.VehicleRepository
import javax.inject.Inject

class VehicleService @Inject constructor(private val vehicleRepo: VehicleRepository) {


    @Throws(VehicleException::class)
    fun createNewVehicle(vehicle: Vehicle): Vehicle? {
        validateVehicelData(vehicle)
        return vehicleRepo.createNewVehicle(vehicle)
    }


    private fun validateVehicelData(vehicle: Vehicle){

        if(vehicle == null){
            throw VehicleNotFoundException("Vehcle cannot be null")
        }else if(vehicle.getRegistrationNumber().equals(null) || vehicle.getRegistrationNumber().equals("")){
            throw InvalidVehicleDataException("Registration Number Cannot be null or Blank")
        }else if(vehicle.getChassisType().equals(null) || vehicle.getChassisType().equals("")){
            throw InvalidVehicleDataException("Chassis Type Cannot be null or Blank")
        }

    }

    @Throws(VehicleNotFoundException::class)
    fun getVehicleById(id: String): Vehicle? {
        return vehicleRepo.getVehicleById(id)
    }


}
