package com.by.kotlin.content.repository

import com.by.kotlin.content.entity.Content
import org.springframework.data.jpa.repository.JpaRepository

interface ContentRepository : JpaRepository<Content, Long> {
}