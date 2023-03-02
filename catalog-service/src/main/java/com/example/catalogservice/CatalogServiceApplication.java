package com.example.catalogservice;

import com.example.catalogservice.jpa.CatalogEntity;
import com.example.catalogservice.jpa.CatalogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RequiredArgsConstructor
public class CatalogServiceApplication {
	private final CatalogRepository catalogRepository;
	public static void main(String[] args) {
		SpringApplication.run(CatalogServiceApplication.class, args);
	}

//	@PostConstruct
//	public void createData(){
//		CatalogEntity catalogEntity1 = new CatalogEntity();
//		catalogEntity1.setProductId("CATALOG-001");
//		catalogEntity1.setProductName("berlin");
//		catalogEntity1.setStock(100);
//		catalogEntity1.setUnitPrice(1500);
//		CatalogEntity catalogEntity2 = new CatalogEntity();
//		catalogEntity2.setProductId("CATALOG-002");
//		catalogEntity2.setProductName("tokyo");
//		catalogEntity2.setStock(110);
//		catalogEntity2.setUnitPrice(1000);
//		CatalogEntity catalogEntity3 = new CatalogEntity();
//		catalogEntity3.setProductId("CATALOG-003");
//		catalogEntity3.setProductName("stockholm");
//		catalogEntity3.setStock(120);
//		catalogEntity3.setUnitPrice(2000);
//
//		catalogRepository.save(catalogEntity1);
//		catalogRepository.save(catalogEntity2);
//		catalogRepository.save(catalogEntity3);
//	}
}
