package com.osorio.junior.poketinder.api

import com.osorio.junior.poketinder.PokemonListResponse
import retrofit2.Response
import retrofit2.http.GET

interface PokemonApi {
    @GET("/api/v2/pokemon")
    suspend fun getPokemons(): Response<PokemonListResponse>
}