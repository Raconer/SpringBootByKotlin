package com.by.kotlin.service

import com.by.kotlin.repository.GroupRepository
import org.springframework.stereotype.Service

@Service
class MainService (
    private val groupRepository: GroupRepository
) {

    fun get():String{
        this.groupRepository.findAll()
        return "Main Service"
    }

}