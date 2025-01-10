package com.api.encurtador.model;

import java.time.Instant;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "links")
public class Link {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String urlLong;
	
	private String urlEncurtada;
	
	@CreationTimestamp
	private Instant urlCreationTimeStamp;

	
	public Link() {
		
	}

	public Link(Long id, String urlLong, String urlEncurtada, Instant urlCreationTimeStamp) {
		this.id = id;
		this.urlLong = urlLong;
		this.urlEncurtada = urlEncurtada;
		this.urlCreationTimeStamp = urlCreationTimeStamp;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrlLong() {
		return urlLong;
	}

	public void setUrlLong(String urlLong) {
		this.urlLong = urlLong;
	}

	public String getUrlEncurtada() {
		return urlEncurtada;
	}

	public void setUrlEncurtada(String urlEncurtada) {
		this.urlEncurtada = urlEncurtada;
	}

	public Instant getUrlCreationTimeStamp() {
		return urlCreationTimeStamp;
	}

	public void setUrlCreationTimeStamp(Instant urlCreationTimeStamp) {
		this.urlCreationTimeStamp = urlCreationTimeStamp;
	}
}
