package com.example.newdatabinding.interact

import com.example.newdatabinding.model.DriverProfileEntity
import io.reactivex.Single

interface AuthenticationInteract {

    fun login(callingCode: String, phoneNumber: String, password: String): Single<DriverProfileEntity>
    fun getDriverProfile(): Single<DriverProfileEntity>

}