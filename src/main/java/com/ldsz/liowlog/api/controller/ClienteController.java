package com.ldsz.liowlog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ldsz.liowlog.api.domain.model.Cliente;

@RestController
public class ClienteController {
	
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Pedro");
		cliente1.setEmail("pedrofux@fux.com");
		cliente1.setTelefone("99555-2222");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Alana");
		cliente2.setEmail("alanamachado@machado.com");
		cliente2.setTelefone("98451-3232");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
