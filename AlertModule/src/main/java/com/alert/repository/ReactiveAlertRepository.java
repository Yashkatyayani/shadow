package com.alert.repository;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.alert.model.Alert;
import com.alert.utils.AlertGenerator;

import reactor.core.publisher.Flux;

@Repository
public class ReactiveAlertRepository implements AlertRepository {

    @Override
    public Flux<Alert> findAll() {
    
        //simulate data streaming every 1 second.
        return Flux.interval(Duration.ofSeconds(1))
                .onBackpressureDrop()
                .map(this::generateAlert)
                .flatMapIterable(x -> x);
                
    }

    private List<Alert> generateAlert(long interval) {

        Alert obj = new Alert(
            AlertGenerator.randomName(), 
            AlertGenerator.randomMessage(), 
            AlertGenerator.getCurrentTimeStamp());
        return Arrays.asList(obj);

    }

}
