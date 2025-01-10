package com.api.encurtador.controller;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.encurtador.model.Link;
import com.api.encurtador.model.LinkResponse;
import com.api.encurtador.service.LinkService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class LinkController {
	
	@Autowired
	private LinkService linkService;
	
	@PostMapping("/encurtar")
	public ResponseEntity<LinkResponse> gerarUrlEncurtada(@RequestBody Map<String, String> request) {
		
		String urlOriginal = request.get("urlOriginal");
		Link link = linkService.encurtarUrl(urlOriginal);
		
		String urlDeRedirecionamento = "http://localhost:8080/r/" + link.getUrlEncurtada();
		
		LinkResponse linkResponse = new LinkResponse(link.getId(), link.getUrlLong(), urlDeRedirecionamento, link.getUrlCreationTimeStamp());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(linkResponse);
	}
	
	@GetMapping("/r/{urlEncurtada}")
	public void redirecionarLink(@PathVariable String urlEncurtada, HttpServletResponse response) throws IOException {
		Link link = linkService.getUrlOriginal(urlEncurtada);
		
		if (link != null) {
			response.sendRedirect(link.getUrlLong());
		} else {
			response.sendError(HttpServletResponse.SC_NOT_FOUND);
		}
	}
}
