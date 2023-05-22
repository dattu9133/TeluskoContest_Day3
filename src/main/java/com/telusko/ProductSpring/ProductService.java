package com.telusko.ProductSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ProductService {

    @Autowired
    ProductDB db;


    public List<Product> getAllProducts(){

        return db.findAll();
    }


	public Stream<Product> getProductWithPlace(String txt1) {
		return  db.findAll().stream().filter(p -> p.getPlace().toLowerCase().contains(txt1.toLowerCase()));
	}


	public List<Product> getProductOutOfWarranty() {
		LocalDate currentDate = LocalDate.now();
        int year = currentDate.getYear();
		return db.findAll().stream().filter(p -> p.getWarranty() < year).collect(Collectors.toList());
	}


	public Stream<Product> getProductWithText(String txt) {
		return db.findAll().stream().filter(p -> p.getName().toLowerCase().contains(txt.toLowerCase())||p.getPlace().toLowerCase().contains(txt.toLowerCase())||p.getType().toLowerCase().contains(txt.toLowerCase()));
	}


	public Stream<Product> getProductWithName(String txt1) {
		return db.findAll().stream().filter(p -> p.getName().toLowerCase().contains(txt1.toLowerCase()));
	}



}