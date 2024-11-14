package com.fisi.vetmobile.data.model

data class Mascota(
    val idMascota: Int,
    val idUsuario: Int,
    val nombre: String,
    val especie: Int,
    val raza: String,
    val edad: Int,
    val peso: Double,
    val genero: String
)
