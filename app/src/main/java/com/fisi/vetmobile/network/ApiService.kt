
package com.fisi.vetmobile.network


import com.fisi.vetmobile.data.model.LoginRequest
import com.fisi.vetmobile.data.model.LoginResponse
import com.fisi.vetmobile.data.model.Mascota
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiService {
    @POST("login")
    suspend fun login(@Body loginRequest: LoginRequest): LoginResponse

    @GET("mascotas")
    suspend fun getMascotas(@Header("Authorization") token: String): List<Mascota>

    @POST("mascotas")
    suspend fun registerMascota(@Header("Authorization") token: String, @Body mascota: Mascota): Mascota
}
