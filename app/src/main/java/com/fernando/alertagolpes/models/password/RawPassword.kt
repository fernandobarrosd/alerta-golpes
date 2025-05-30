package com.fernando.alertagolpes.models.password

class RawPassword(private val password: String) : Password {
    override fun getValue(): String {
        return password
    }
}