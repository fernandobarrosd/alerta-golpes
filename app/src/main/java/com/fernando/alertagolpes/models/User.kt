package com.fernando.alertagolpes.models

import java.util.UUID

class User {
    private val _id: UUID
    val id: String
        get() = _id.toString()

    private val _name: String
    val name: String
        get() = _name

    private val _email: String
    val email: String
        get() = _email

    private val _password: String
    val password: String
        get() = _password

    private val _photoURL: String
    val photoURL: String
        get() = _photoURL

    constructor(name: String, email: String, password: String, photoURL: String) {
        this._id = UUID.randomUUID()
        this._name = name
        this._email = email
        this._password = password
        this._photoURL = photoURL
    }

    constructor(id: UUID, name: String, email: String, password: String, photoURL: String) {
        this._id = id
        this._name = name
        this._email = email
        this._password = password
        this._photoURL = photoURL
    }
}