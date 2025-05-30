package com.fernando.alertagolpes.firebase

import com.google.firebase.firestore.FirebaseFirestore

fun FirebaseFirestore.usersCollection() = collection("users")