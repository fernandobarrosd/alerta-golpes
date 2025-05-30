package com.fernando.alertagolpes.persistence.repositories

import com.fernando.alertagolpes.firebase.documents.UserDocument
import com.fernando.alertagolpes.firebase.usersCollection
import com.fernando.alertagolpes.mappers.toFirestoreDocument
import com.fernando.alertagolpes.models.User
import com.fernando.alertagolpes.models.password.RawPassword
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.toObject
import kotlinx.coroutines.tasks.await
import java.util.UUID
import javax.inject.Inject

class UserRepository @Inject constructor(private val firestore: FirebaseFirestore) {
    suspend fun saveUser(user: User) {
        val userDocument = user.toFirestoreDocument()
        firestore.usersCollection().add(userDocument).await()
    }

    suspend fun findUserById(userID: String) : User? {
        val userDocument = firestore.usersCollection().document(userID).get().await()
            .toObject<UserDocument>()

        if (userDocument == null) return null

        return User(
            id = UUID.fromString(userDocument.id),
            name = userDocument.name,
            email = userDocument.email,
            photoURL = userDocument.photoURL,
            password = RawPassword(userDocument.password)
        )
    }
}