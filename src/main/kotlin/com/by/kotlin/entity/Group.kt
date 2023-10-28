package com.by.kotlin.entity

import jakarta.persistence.*

@Entity
@Table(name = "group")
data class Group(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null,
    @Column(nullable = false)
    var name:String? = null
)
