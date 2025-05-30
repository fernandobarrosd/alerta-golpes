package com.fernando.alertagolpes.models.password

import org.mindrot.jbcrypt.BCrypt

class BcryptHashPassword(rawPassword: String) : Password {
    private val hashedPassword: String

    init {
        this.hashedPassword = hashPassword(rawPassword)
    }

    // Aqui vai o algorítmo para criptografar a senha
    private fun hashPassword(rawPassword: String) : String {
        val salt = BCrypt.gensalt(12)
        return BCrypt.hashpw(rawPassword, salt)
    }

    override fun getValue(): String {
        return hashedPassword
    }
}