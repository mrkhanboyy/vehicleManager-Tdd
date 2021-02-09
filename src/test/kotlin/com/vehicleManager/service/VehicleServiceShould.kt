package com.vehicleManager.service

import com.mongodb.internal.connection.tlschannel.util.Util.assertTrue
import com.vehicleManager.di.component.DaggerVehicleAppTestComponent
import com.vehicleManager.exception.vehicleExceptions.InvalidVehicleDataException
import com.vehicleManager.exception.vehicleExceptions.VehicleException
import com.vehicleManager.exception.vehicleExceptions.VehicleNotFoundException
import com.vehicleManager.helper.TestData
import org.junit.Assert.*
import org.junit.Test

class VehicleServiceShould {

    var component = DaggerVehicleAppTestComponent.builder().build()
    private var vehicleService = VehicleService(component.vehicleRepository())
    


    @Test
    fun createNewVehicleTest(){

        var vehicle =  TestData.getVehicle()
//        check for not null object
        assertNotNull(vehicle)
//        check registrationNumber and chassisType for null and blank safety
        assertNotNull(vehicle.getRegistrationNumber())
        assertFalse(vehicle.getRegistrationNumber().equals(""))
        assertNotNull(vehicle.getChassisType())
        assertFalse(vehicle.getChassisType().equals(""))

        var vehicleReturnedFromRepo = TestData.getVehicle()
        assertTrue(vehicle.getUuid() == vehicleReturnedFromRepo.getUuid())


    }

//    @Test
//    fun throws_vehicle_exception_on_invalid_or_null_data(){
//        var vehicle =TestData.getVehicle()

//        assertThrows(VehicleException::class.java) {
//            vehicle.setRegistrationNumber("")
//            vehicleService.validateVehicelData(vehicle)
//
//        }
//
//        assertThrows(VehicleNotFoundException::class.java){
//            vehicleService.validateVehicelData(null)
//        }
//
//
//        vehicle = TestData.getVehicle()
//        assertThrows(InvalidVehicleDataException::class.java){
//            vehicle.setChassisType("")
//            vehicleService.validateVehicelData(vehicle)
//        }
//
//    }









}