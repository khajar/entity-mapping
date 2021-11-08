package com.normalization.springdatjpamapping.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.normalization.springdatjpamapping.DTO.OrderRequest;
import com.normalization.springdatjpamapping.entity.Customer;
import com.normalization.springdatjpamapping.entity.Product;
import com.normalization.springdatjpamapping.repository.CustomerRepository;
import com.normalization.springdatjpamapping.repository.ProductRepository;


@RestController
public class OrderController {
	
	@Autowired
	private CustomerRepository customerrepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest orderrequest)
	{
		return customerrepository.save(orderrequest.getCustomer());
	}

	@GetMapping("/findOrders")
	public List<Customer> findAllOrders()
	{
		return customerrepository.findAll();
	}
	
	@PutMapping("/updateCustomer/{id}")
	public Customer updateCustomer(@PathVariable int id,@RequestBody Customer updateCustomer)
	{	
		Customer customer = new Customer();
		
		customer.setId(id);
		customer.setEmail(updateCustomer.getEmail());
		customer.setName(updateCustomer.getName());
		return customerrepository.save(customer);
	}
	
	@PutMapping("/updateProduct/{id}")
	public Product updateProduct(@PathVariable int id,@RequestBody Product updateProduct)
	{
		Product product = new Product();
		product.setPid(id);
		product.setProductName(updateProduct.getProductName());
		product.setPrice(updateProduct.getPrice());
		return productRepository.save(product);
	}
	
	@DeleteMapping("deleteproduct/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable int id)
	{
		try {
			productRepository.deleteById(id);
		 return new ResponseEntity<>(id, HttpStatus.OK);
		}
		catch(Exception e)
		{
			 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("deletecustomer/{id}")
	public ResponseEntity<?> deleteCustomer(@PathVariable int id)
	{
		try {
			customerrepository.deleteById(id);
		 return new ResponseEntity<>(id, HttpStatus.OK);
		}
		catch(Exception e)
		{
			 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
