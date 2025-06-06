package com.by.kotlin.common.dto

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

class CommonRes {
    companion object{
        fun Basic(httpStatus: HttpStatus?): ResponseEntity<Any> {
            return ResponseEntity.status(httpStatus!!).build()
        }

        fun Def(result: Any?): ResponseEntity<out Any> {
            val status = HttpStatus.OK
            return ResponseEntity.ok(ResponseMsg(code = status.value(), message = status.name, result = result))
        }

        fun Except(httpStatus: HttpStatus?, result: Any?): ResponseEntity<Any> {
            return ResponseEntity.status(httpStatus!!).body(result)
        }
    }
}