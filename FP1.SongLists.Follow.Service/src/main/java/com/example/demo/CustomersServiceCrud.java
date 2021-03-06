package com.example.demo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomersServiceCrud extends ReactiveMongoRepository<Customer, String>{

	public Mono<Customer> findByCustomerEmail(String customerEmail);
	
	public Flux<Customer> findAllBySongsListsSongsListId (String SongsListId);
	

}
