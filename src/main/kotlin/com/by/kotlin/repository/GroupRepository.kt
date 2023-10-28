package com.by.kotlin.repository

import com.by.kotlin.entity.Group
import org.springframework.data.jpa.repository.JpaRepository

interface GroupRepository : JpaRepository<Group, Long>{
}