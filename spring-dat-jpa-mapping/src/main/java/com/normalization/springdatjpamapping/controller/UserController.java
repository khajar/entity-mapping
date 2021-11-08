package com.normalization.springdatjpamapping.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.webjars.NotFoundException;
import com.normalization.springdatjpamapping.entity.User;
import com.normalization.springdatjpamapping.repository.AddressRepository;
import com.normalization.springdatjpamapping.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userrepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@GetMapping("/findUsers")
	public List<User> findAllUsers()
	{
		return userrepository.findAll();
	}
	
	
	@PostMapping("/saveUser")
	public ResponseEntity<String> saveUser(@RequestBody List<User> userData)
	{
		userrepository.saveAll(userData);
		return ResponseEntity.ok("Data saved");
	}
	
	@PutMapping("updateUser/{id}")
	public User updateAddress(@PathVariable int id,@Valid @RequestBody User update)
	{
		return userrepository.findById(id)
				.map(user -> {
					user.setName(update.getName());
					user.setAge(update.getAge());
					user.setAddress(update.getAddress());
					return userrepository.save(user);
				}).orElseThrow(() -> new NotFoundException("not found"));
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public void deleteUser(@PathVariable int id)
	{
		userrepository.deleteById(id);
	}

	@DeleteMapping("/deleteAddress/{id}")
	public void deleteAddress(@PathVariable int id)
	{
		addressRepository.deleteById(id);
	}
}
