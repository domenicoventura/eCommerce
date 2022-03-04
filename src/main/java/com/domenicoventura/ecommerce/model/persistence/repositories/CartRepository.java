package com.domenicoventura.ecommerce.model.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domenicoventura.ecommerce.model.persistence.Cart;
import com.domenicoventura.ecommerce.model.persistence.User;

public interface CartRepository extends JpaRepository<Cart, Long> {
	Cart findByUser(User user);
}
