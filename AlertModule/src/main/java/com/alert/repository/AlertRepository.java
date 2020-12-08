package com.alert.repository;

import com.alert.model.Alert;
import reactor.core.publisher.Flux;

public interface AlertRepository {

	Flux<Alert> findAll();
}
