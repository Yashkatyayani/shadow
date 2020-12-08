package com.alert.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import com.alert.model.Alert;
import com.alert.repository.AlertRepository;

import reactor.core.publisher.Flux;

public class AlertController {

	@Autowired
    private AlertRepository alertRepository;

    @GetMapping(path = "/comment/stream", 
        produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Alert> feed() {
        return this.alertRepository.findAll();
    }
}
