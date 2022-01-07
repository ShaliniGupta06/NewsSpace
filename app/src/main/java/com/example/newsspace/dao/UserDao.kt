package com.example.newsspace.dao

import com.example.newsspace.models.User
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class UserDao {

    private val db=FirebaseFirestore.getInstance()
    private val userCollection = db.collection("users")

    fun addUser(user: User?){
        user?.let{
            GlobalScope.launch(Dispatchers.IO){
                userCollection.add(user)
            }
        }
    }
}