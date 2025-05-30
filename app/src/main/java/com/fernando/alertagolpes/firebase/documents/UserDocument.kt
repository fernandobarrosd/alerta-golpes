package com.fernando.alertagolpes.firebase.documents

import com.google.firebase.firestore.DocumentId

data class UserDocument(
    @DocumentId
    val id: String = "",
    val name: String = "",
    val email: String = "",
    val password: String = "",
    val photoURL: String = ""
)