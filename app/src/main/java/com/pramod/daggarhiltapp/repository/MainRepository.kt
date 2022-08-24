package com.pramod.daggarhiltapp.repository

import com.pramod.daggarhiltapp.model.Post

import com.pramod.daggarhiltapp.network.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
class MainRepository
    @Inject
    constructor(private val apiService: ApiService){

    fun getPost() : Flow<List<Post>> = flow {
        emit(apiService.getPost())
    }.flowOn(Dispatchers.IO)
}