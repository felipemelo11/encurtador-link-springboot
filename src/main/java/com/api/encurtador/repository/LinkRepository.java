package com.api.encurtador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.encurtador.model.Link;

public interface LinkRepository extends JpaRepository<Link, Long> {
	
	Link findByUrlEncurtada(String urlEncurtada);
	
}
