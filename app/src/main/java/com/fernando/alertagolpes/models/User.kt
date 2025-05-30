package com.fernando.alertagolpes.models

import com.fernando.alertagolpes.models.password.Password
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

    private val _password: Password
    val password: String
        get() = _password.getValue()

    private val _photoURL: String
    val photoURL: String
        get() = _photoURL

    constructor(name: String, email: String, password: Password, photoURL: String) {
        this._id = UUID.randomUUID()
        this._name = name
        this._email = email
        this._password = password
        this._photoURL = photoURL
    }

    constructor(id: UUID, name: String, email: String, password: Password, photoURL: String) {
        this._id = id
        this._name = name
        this._email = email
        this._password = password
        this._photoURL = photoURL
    }

    override fun toString(): String {
        return "User(id=$id, name=$name, email=$email, password=$password, photoURL=$photoURL)"
    }
}