package com.bootcamp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Client {

	private Long codCliente;
	private String nombre;
	private String tipo;
	private String celular;

	
}
