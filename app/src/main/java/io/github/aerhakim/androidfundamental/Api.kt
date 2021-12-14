package io.github.aerhakim.androidfundamental

import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("pcs.php")
    fun getBuku(): Call<Array<BukuModel>>

}