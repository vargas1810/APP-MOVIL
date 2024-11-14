package com.fisi.vetmobile.data.repository

import com.fisi.vetmobile.data.model.LoginRequest
import com.fisi.vetmobile.data.model.Mascota
import com.fisi.vetmobile.network.RetrofitInstance

class Repository {
    private val api = RetrofitInstance.apiService

    suspend fun login(username: String, password: String) = api.login(LoginRequest(username, password))

    suspend fun getMascotas(token: String) = api.getMascotas(token)

    suspend fun registerMascota(token: String, mascota: Mascota) = api.registerMascota(token, mascota)
}
