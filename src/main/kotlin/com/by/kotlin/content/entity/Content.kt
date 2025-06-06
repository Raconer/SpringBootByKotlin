package com.by.kotlin.content.entity

import com.by.kotlin.common.entity.CommonEntity
import jakarta.persistence.*

@Entity
@Table(name = "content")
data class Content(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long? = null,
    val title:String,
    val content:String? = null,
):CommonEntity()