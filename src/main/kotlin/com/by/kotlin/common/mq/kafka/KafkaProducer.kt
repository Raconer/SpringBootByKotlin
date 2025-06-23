package com.by.kotlin.common.mq.kafka

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class KafkaProducer (
    private val kafkaTemplate: KafkaTemplate<String, String>
){

    var MSG_REQ_CNT = 0

    fun sendMessage(message: String) {
        val future = this.kafkaTemplate.send("kafka-topic", message)
        future.whenComplete { result, ex ->
            if (ex != null) {
                println("❌ 전송 실패: ${ex.message}")
            } else {
                println("\uD83D\uDCE4 전송 성공[${MSG_REQ_CNT++}]: ${result?.producerRecord}")
            }
        }
    }
}