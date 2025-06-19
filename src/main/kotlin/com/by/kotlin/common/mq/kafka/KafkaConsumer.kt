package com.by.kotlin.common.mq.kafka

import com.by.kotlin.common.Contants
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.support.Acknowledgment
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Service

@Service
class KafkaConsumer {

    @KafkaListener(
        topics = ["kafka-topic"],
        groupId = "kafka-group-id"
    )
    fun listen(@Payload message: String, acknowledgment: Acknowledgment) {
        try {
            println("\uD83D\uDCE5 수신 메시지: $message")
            acknowledgment.acknowledge()
        } catch (e: Exception) {
            println("❌ 예외 발생: ${e.message}")
        }
    }
}