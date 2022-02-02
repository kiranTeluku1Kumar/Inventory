package com.business.inventory.ctrls;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.business.inventory.models.Product;

@RestController
public class ProductController {
	List<Product> productList = new ArrayList<>();
	
	//HTTP method GET, POST, PUT and DELETE
	
	@GetMapping("/product")
	public List<Product> getAllProducts()
	{
		return productList;
	}
	
	@PostMapping("/product")
	public Product saveProduct(@RequestBody Product product)
	{
		 productList.add(product);
		 return product;
	}
}
