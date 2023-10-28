package com.by.kotlin.entity

import jakarta.persistence.*

@Entity
@Table(name = " contents")
data class Contents(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null,
    @OneToOne
    @JoinColumn(name = "parent_id" )
    var parent:Group? = null,
    @Column(nullable = false)
    var text:String? = null
)