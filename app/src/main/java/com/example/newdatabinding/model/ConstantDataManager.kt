package com.example.newdatabinding.model

import io.reactivex.Single

interface ConstantDataManager {
    fun getNationalities(): Single<List<NationalityEntity>>
    fun getPhoneCodes(): Single<List<PhoneCodeEntity>>
}