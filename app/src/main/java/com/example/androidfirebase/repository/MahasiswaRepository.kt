package com.example.androidfirebase.repository

import com.example.androidfirebase.model.Mahasiswa
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.tasks.await

interface MahasiswaRepository {
    suspend fun  getMhs(): Flow<List<Mahasiswa>>

    suspend fun insertMhs(mahasiswa: Mahasiswa)

    suspend fun updateMhs(nim: String,mahasiswa: Mahasiswa)

    suspend fun deleteMhs( mahasiswa: Mahasiswa)

    suspend fun getMhsbyNim(nim: String):Flow<Mahasiswa>
}
