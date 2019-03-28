package com.example.newdatabinding.model

import android.support.annotation.Keep

@Keep
class DriverProfileEntity(
    val driverId: Int,
    val userId: String,
    val companyId: Int,
    val userName: String,
    val fullName: String,
    val phoneNumber: String,
    val nric: String,
    val dateOfBirth: String,
    val nationality: String,
    val profileImageUrl: String,
    val primeMoverNo: String,
    val primeMoverModel: String? = "",
    val primeMoverPayload: String,
    val primeMoverDateAssigned: String,
    var isOnShift: Boolean,
    val status: Boolean

)

@Keep
class DriverProfileResponseEntity(
    val driverInfo: DriverProfileEntity
)