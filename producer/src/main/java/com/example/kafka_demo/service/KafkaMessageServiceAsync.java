package com.example.kafka_demo.service;

public interface KafkaMessageServiceAsync {
    void sendKafkaEventAsync(Object value);
}
