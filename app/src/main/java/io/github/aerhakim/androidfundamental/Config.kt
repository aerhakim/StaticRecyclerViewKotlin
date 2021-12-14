package io.github.aerhakim.androidfundamental

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Config {
    private const val BASE_URL = "https://testfintech.000webhostapp.com/"
    val instances:Api by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        retrofit.create(Api::class.java)
    }
}