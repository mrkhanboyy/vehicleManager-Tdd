package com.vehicleManager.service

import com.mongodb.internal.connection.tlschannel.util.Util.assertTrue
import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.whenever
import com.vehicleManager.di.component.DaggerVehicleAppTestComponent
import com.vehicleManager.exception.vehicleExceptions.InvalidVehicleDataException
import com.vehicleManager.exception.vehicleExceptions.VehicleException
import com.vehicleManager.exception.vehicleExceptions.VehicleNotFoundException
import com.vehicleManager.helper.TestData
import com.vehicleManager.models.Vehicle
import com.vehicleManager.repository.VehicleRepository
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock

class VehicleServiceShould {

    private var component = DaggerVehicleAppTestComponent.builder().build()
    private lateinit var  vehicleService: VehicleService
    private lateinit var vehicleRepository: VehicleRepository
    private val uuid:String = "1a1c5fe5-3ee0-453d-8425-5fec44961029"

    @Before
    fun before(){
        vehicleService = component.vehicleService()
        vehicleRepository = mock(VehicleRepository::class.java)
        whenever(vehicleRepository.getVehicleById(any())).thenReturn(TestData.getVehicle())
        whenever(vehicleRepository.createNewVehicle(any())).thenReturn(TestData.getVehicle())

    }

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


        var vehicleReturnedFromRepo = vehicleRepository.createNewVehicle(vehicle)
        assertTrue(vehicle.getUuid() == vehicleReturnedFromRepo.getUuid())
        if (vehicleReturnedFromRepo != null) {
            assertTrue(vehicle.getUuid() == vehicleReturnedFromRepo.getUuid())
        }

    }

    @Test
    fun throw_vehicle_exception_on_invalid_or_null_data(){
        var vehicle =TestData.getVehicle()

        assertThrows(VehicleException::class.java) {
            vehicle.setRegistrationNumber("")
            vehicleService.createNewVehicle(vehicle)
        }

        vehicle = TestData.getVehicle()
        assertThrows(InvalidVehicleDataException::class.java){
            vehicle.setChassisType("")
            vehicleService.createNewVehicle(vehicle)
        }
    }

    @Test
    fun get_vehicle_by_uuid(){

        var vehicleFromRepository = vehicleRepository.getVehicleById(uuid)
        assertNotNull(vehicleFromRepository)
        var vehicle = TestData.getVehicle()
        assertTrue(vehicle.getUuid().equals(vehicleFromRepository?.getUuid()))
        println("vehicle uuid : ${vehicle.getUuid()}")

    }









}