package com.api.encurtador.model;

import java.time.Instant;

public class LinkResponse {
	
	private Long id;
	
	private String urlLong;
	
	private String urlEncurtada;
	
	private Instant urlCreationTimeStamp;

	public LinkResponse(Long id, String urlLong, String urlEncurtada, Instant urlCreationTimeStamp) {
		super();
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
