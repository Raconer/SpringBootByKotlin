package com.by.kotlin.content.service

import com.by.kotlin.content.entity.Content
import com.by.kotlin.content.repository.ContentRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import kotlin.jvm.optionals.getOrNull

@Service
class ContentService(
    private val contentRepository: ContentRepository
) {

    @Transactional(readOnly = true)
    fun getContentList(): List<Content> {
        return this.contentRepository.findAll()
    }

    @Transactional(readOnly = true)
    fun getContent(id: Long): Content? {
        return this.contentRepository.findById(id).getOrNull()
    }
}