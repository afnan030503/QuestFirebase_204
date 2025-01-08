package com.example.androidfirebase.di

import com.example.androidfirebase.repository.MahasiswaRepository
import com.example.androidfirebase.repository.NetworkMahasiswaRepository
import com.google.firebase.firestore.FirebaseFirestore

interface AppContainer {
    val mahasiswaRepository: MahasiswaRepository
}

class MahasiswaContainer: AppContainer{
    private val firebase: FirebaseFirestore = FirebaseFirestore.getInstance()//sejajar atau sama dengan bash url

    override val mahasiswaRepository: MahasiswaRepository by lazy{
        NetworkMahasiswaRepository(firebase)    }

}