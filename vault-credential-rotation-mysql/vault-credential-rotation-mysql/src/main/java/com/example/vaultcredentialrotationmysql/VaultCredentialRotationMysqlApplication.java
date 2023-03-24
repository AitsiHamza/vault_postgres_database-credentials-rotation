package com.example.vaultcredentialrotationmysql;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class VaultCredentialRotationMysqlApplication {
	@Autowired private AccountRepository accountRepository;
	@PostMapping("/save")
	public ResponseEntity<Account> save(){
		Account account = accountRepository.save(new Account());
		System.out.println(account);
		return new ResponseEntity<>(account, HttpStatus.ACCEPTED);
	}
	@GetMapping("/all")
	public ResponseEntity<List<Account>> getAll(){
		return new ResponseEntity<>(accountRepository.findAll(),HttpStatus.ACCEPTED);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id){
		accountRepository.deleteById(id);
	}

	public static void main(String[] args) {
		SpringApplication.run(VaultCredentialRotationMysqlApplication.class, args);
	}

}
