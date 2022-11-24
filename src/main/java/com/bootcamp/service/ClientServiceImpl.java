package com.bootcamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.entity.Client;
import com.bootcamp.repository.ClientRepository;

import reactor.core.publisher.Mono;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public Mono<Client> saveClient(Client client) {
		
		return clientRepository.save(client);
	}

}
