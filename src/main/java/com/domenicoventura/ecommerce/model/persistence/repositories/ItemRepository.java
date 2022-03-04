package com.domenicoventura.ecommerce.model.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domenicoventura.ecommerce.model.persistence.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
	public List<Item> findByName(String name);

}
