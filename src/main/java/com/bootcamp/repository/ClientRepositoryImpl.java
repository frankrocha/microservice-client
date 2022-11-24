package com.bootcamp.repository;

import org.springframework.stereotype.Repository;

import com.bootcamp.entity.Client;

import reactor.core.publisher.Mono;

@Repository
public class ClientRepositoryImpl  implements ClientRepository{

	@Override
	public Mono<Client> save(Client client) {
		return Mono.just(client);
	}

}
