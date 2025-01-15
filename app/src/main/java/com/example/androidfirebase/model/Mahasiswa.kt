package com.example.androidfirebase.model

data class Mahasiswa(
    val nim : String,
    val nama : String,
    val alamat : String,
    val jeniskelamin : String,
    val kelas : String,
    val angkatan : String,
    val judulskripsi : String,
    val dospem1: String,
    val dospem2: String,
) {
    constructor(

    ) : this("", "", "", "", "", "", "", "", "")
}