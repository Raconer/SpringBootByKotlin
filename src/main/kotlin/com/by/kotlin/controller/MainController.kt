package com.by.kotlin.controller

import com.by.kotlin.service.MainService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController(
    private val mainService: MainService
) {
    @GetMapping
    fun get():String{
        return this.mainService.get()
    }
}