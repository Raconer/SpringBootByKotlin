package com.by.kotlin.content.controller

import com.by.kotlin.common.dto.CommonRes
import com.by.kotlin.content.service.ContentService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/content"])
class ContentController(
    private val contentService: ContentService
) {
    @GetMapping
    fun getContent(): ResponseEntity<out Any> {
        val contentList = this.contentService.getContentList()
        return CommonRes.Def(contentList)
    }
}