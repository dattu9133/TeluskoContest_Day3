package com.telusko.ProductSpring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDB extends JpaRepository<Product, Integer> {

}
//package com.telusko.ProductSpring;
//
//import java.util.List;
//
//
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface ProductDB extends JpaRepository<Product, Integer> {
//
//		List<Product> findByName(String s);
//
//	    List<Product> findByPlaceContainingIgnoreCase(String place);
//
//	    List<Product> findByWarrantyLessThan(int currentYr);
//
//	    List<Product> findByNameContainingIgnoreCaseOrTypeContainingIgnoreCaseOrPlaceContainingIgnoreCase(String text1, String text2, String text3);
//	}
//
//}