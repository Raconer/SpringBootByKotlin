package com.by.kotlin.mq.controller

import com.by.kotlin.common.dto.CommonRes
import com.by.kotlin.common.mq.kafka.KafkaProducer
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/mq")
class MqController(
    private val producer: KafkaProducer,
) {

    @PostMapping("/send/kafka")
    fun sendKafka(@RequestParam message:String): ResponseEntity<out Any> {
        val content = this.producer.sendMessage(message)
        return CommonRes.Def(content)
    }

}