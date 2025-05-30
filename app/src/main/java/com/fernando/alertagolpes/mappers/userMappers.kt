package com.fernando.alertagolpes.mappers

import com.fernando.alertagolpes.firebase.documents.UserDocument
import com.fernando.alertagolpes.models.User

fun User.toFirestoreDocument() : UserDocument {
    return UserDocument(
        id = id,
        name = name,
        email = email,
        password = password,
        photoURL = photoURL
    )
}