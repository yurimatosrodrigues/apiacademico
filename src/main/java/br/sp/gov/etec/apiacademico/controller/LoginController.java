package br.sp.gov.etec.apiacademico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.sp.gov.etec.apiacademico.dto.LoginDto;
import br.sp.gov.etec.apiacademico.entity.LoginEntity;
import br.sp.gov.etec.apiacademico.repository.LoginRepository;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
		
	@Autowired
	LoginRepository repository; 
	
	@GetMapping(value = "/consultar_login")
	public ResponseEntity<?> findAllLogin(){		
		List<LoginEntity> listalogins = repository.findAll();
		return ResponseEntity.ok(listalogins);
	}
	
	@PostMapping(path  = "/adicionar_login", consumes ="application/json", produces = "application/json")
	public ResponseEntity<?> AddLogin(@RequestBody LoginDto dto){		
		LoginEntity entity = new LoginEntity(dto.getNome(), dto.getPassword(), dto.getTipoLogin(), dto.getUsername());
		LoginEntity response = repository.save(entity);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping(value = "{id}")
	public ResponseEntity<LoginEntity> findById(@PathVariable Long id){		
		LoginEntity obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
	
	@PutMapping(path  = "/atualizar_login", consumes ="application/json", produces = "application/json")
	public ResponseEntity<?> updateLogin(@RequestBody LoginEntity entity){	
		LoginEntity response = repository.save(entity);
		return ResponseEntity.ok(response);
	}
	
	@DeleteMapping(path  = "/deletar_login", consumes ="application/json", produces = "application/json")
	public ResponseEntity<?> deleteLogin(@RequestBody LoginEntity entity){	
		repository.delete(entity);
		return ResponseEntity.ok("Login excluído com sucesso!");
	}
	
}
