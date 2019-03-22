package com.thinkenterprise.domain.route.graphql.performance;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import org.dataloader.BatchLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.thinkenterprise.domain.route.jpa.model.Flight;
import com.thinkenterprise.domain.route.jpa.repository.FlightRepository;

@Component
public class FlightBatchLoader implements BatchLoader<Long, Flight>{
	
	@Autowired
	private FlightRepository flightRepository;
	
	public FlightBatchLoader(FlightRepository flightRepository) {
		super();
		this.flightRepository = flightRepository;
	}

	@Override
	public CompletionStage<List<Flight>> load(List<Long> keys) {
		return CompletableFuture.supplyAsync(() -> flightRepository.findAllById(keys));  						
	}
}
