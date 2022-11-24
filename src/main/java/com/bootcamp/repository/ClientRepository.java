package com.bootcamp.repository;

import com.bootcamp.entity.Client;

import reactor.core.publisher.Mono;


public interface ClientRepository {

	Mono<Client> save(Client client);
	
	
}
