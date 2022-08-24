package com.pramod.daggarhiltapp.network

import com.pramod.daggarhiltapp.model.Post
import com.pramod.daggarhiltapp.uitis.Constants
import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.features.*
import io.ktor.client.features.get
import io.ktor.client.features.json.*
import io.ktor.client.request.*
import javax.inject.Inject

class ApiService @Inject constructor() {
    private val client = HttpClient(Android){
        install(DefaultRequest){
            headers.append("Contents-Type","application/json")
        }

        install(JsonFeature){
            serializer = GsonSerializer()
        }
        engine {
            connectTimeout = 100_00
            socketTimeout = 100_00
        }
    }
     suspend fun getPost():List<Post>{
         return client.get{
             url  (Constants.BASE_URL)
         }











     }
}

