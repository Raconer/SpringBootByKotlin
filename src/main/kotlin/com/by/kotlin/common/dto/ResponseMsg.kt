package com.by.kotlin.common.dto

import java.time.LocalDate

data class ResponseMsg(
    val code: Int,
    val message: String,
    val date: LocalDate = LocalDate.now(),
    var result: Any? = null
)