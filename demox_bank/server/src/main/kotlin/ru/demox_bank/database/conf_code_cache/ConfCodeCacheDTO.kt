package com.bank_test_backend.database.conf_code_cache

import kotlinx.serialization.Serializable

@Serializable
class ConfCodeCacheDTO(
    val id: Long? = null,
    val userId: Long,
    val code: Long
)
