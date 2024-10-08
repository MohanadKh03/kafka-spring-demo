package com.example.kafka_demo.service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public interface KafkaMessageServiceSync {
    void sendKafkaEventSync(Object value) throws ExecutionException, InterruptedException, TimeoutException;
}
