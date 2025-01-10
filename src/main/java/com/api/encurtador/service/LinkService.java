package com.api.encurtador.service;

import java.time.Instant;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.encurtador.model.Link;
import com.api.encurtador.repository.LinkRepository;

@Service
public class LinkService {
	
	@Autowired
	private LinkRepository linkRepository;

	@SuppressWarnings("deprecation")
	public String gerarUrlAleatoria() {
		return RandomStringUtils.randomAlphanumeric(5, 10);
	}
	
	public Link encurtarUrl(String urlOriginal) {
		Link link = new Link();
	
		link.setUrlLong(urlOriginal);
		link.setUrlEncurtada(gerarUrlAleatoria());	
		link.setUrlCreationTimeStamp(Instant.now());
		
		return linkRepository.save(link);
	}
	
	public Link getUrlOriginal(String urlEncurtada) {
		
		try {
			return linkRepository.findByUrlEncurtada(urlEncurtada);
		
		} catch(Exception e) {
		
			throw new RuntimeException("URL não existe no banco de dados ", e);
		}
	}	
}
