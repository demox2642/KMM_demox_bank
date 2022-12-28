package com.bank_test_backend.database.conf_code_cache

import kotlinx.serialization.Serializable

@Serializable
class ConfirmCodeDTO(
    val code: Long
)
