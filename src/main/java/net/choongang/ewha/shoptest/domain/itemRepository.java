package net.choongang.ewha.shoptest.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface itemRepository extends JpaRepository<Item, Long> {
	
	List<Item> findByProductName(String productName);
	
}
