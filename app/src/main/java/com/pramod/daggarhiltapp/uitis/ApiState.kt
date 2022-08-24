package com.pramod.daggarhiltapp.uitis

import com.pramod.daggarhiltapp.model.Post

sealed class ApiState {
    object Loading:ApiState()
    object Empty: ApiState()
    class Success(val respose:List<Post>):ApiState()
    class Failure(val error: Throwable):ApiState()
}