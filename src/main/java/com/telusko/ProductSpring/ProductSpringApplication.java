package com.telusko.ProductSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

@SpringBootApplication
public class ProductSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductSpringApplication.class, args);

		ProductService service =context.getBean(ProductService.class);
		System.out.println("\n============================================================================================\n");

		System.out.println("==============================================");
        System.out.println("\t\t     MENU\n==============================================\n1.Search by Text\n2.Search by Name\n3.Search by Place\n4.Products out of warranty\n5.All Items ");
        System.out.println("Enter your choice:");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        do {
	        String txt1;
			switch(ch)
	        {
	        case 1:
	        	System.out.println("Enter the text to be searched:");
	        	String txt=sc.next();
	        	System.out.println("List of all Items which has "+txt+" :");
	        	System.out.println("============================================================================================");
	        	//List<Product> prods = 
	        	Stream<Product> name= service.getProductWithText(txt);
	        	name.forEach(items -> System.out.println(items));
//	        	for(Product p : prods){
//	                System.out.println(p);
//	            }
	        	break;
	        case 2:
	        	System.out.println("Enter the name to be searched:");
	        	String txt11=sc.next();
	        	System.out.println("List of all Items which has "+txt11+" in name :");
	        	System.out.println("============================================================================================");
	        	//List<Product> prods = 
	        	Stream<Product> name1= service.getProductWithName(txt11);
	        	name1.forEach(items -> System.out.println(items));
//	        	for(Product p : prods){
//	                System.out.println(p);
//	            }
	        	break;
	        case 3:
	        	System.out.println("Enter the place to be searched:");
	        	txt11=sc.next();
	        	System.out.println("List of all Items which are in "+txt11+" : ");
	        	System.out.println("============================================================================================");
	        	//List<Product> prod = 
	        	Stream<Product> place= service.getProductWithPlace(txt11);
	        	place.forEach(items -> System.out.println(items));
//	        	for(Product p : prod){
//	                System.out.println(p);
//	            }
	        	break;
	        case 4:
	        	System.out.println("List of Items which are out of Warranty :");
	        	System.out.println("============================================================================================");
	        	List<Product> prod1 = service.getProductOutOfWarranty();
	        	for(Product p : prod1){
	                System.out.println(p);
	            }
//	        	Stream<Product> warranty= prod1.stream();
//	        	warranty.forEach(items -> System.out.println(items));
	        	break;
	        case 5:
              	 List<Product> products = service.getAllProducts();
              	System.out.println("List of all Items :");
              	System.out.println("============================================================================================");
	        	Stream<Product> data= products.stream();
	        	data.forEach(items -> System.out.println(items));
	        	
	        	
		         break;
	        default:
	        	System.out.println("Enter the valid options");
	           
	        }
	        System.out.println("\n==============================================");
	        System.out.println("\t\t     MENU\n==============================================\n1.Search by Text\n2.Search by Name\n3.Search by Place\n4.Products out of warranty\n5.All Items ");
	        System.out.println("Enter your choice:");
	        ch=sc.nextInt();
	        
        }while(ch<6);
    	System.out.println("\n============================================================================================\n");

	}

}