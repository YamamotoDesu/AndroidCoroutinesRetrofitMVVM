package com.devtides.androidcoroutinesretrofit.model

import retrofit2.Response
import retrofit2.http.GET

interface CountriesApi {

    @GET(value = "DevTides/countries/master/countriesV2.json")
    suspend fun getCountries(): Response<List<Country>>

}