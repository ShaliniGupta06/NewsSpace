package com.example.newsspace.models

data class User(
    var uId: String = "",
    var userName: String? = null,
    var userPic: String? = null ,
    var userEmail: String? =null,
    var canPost: Boolean = false
)
