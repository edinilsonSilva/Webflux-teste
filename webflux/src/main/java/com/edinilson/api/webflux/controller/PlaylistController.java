package com.edinilson.api.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edinilson.api.webflux.documents.Playlist;
import com.edinilson.api.webflux.service.PlaylistService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//@RestController
@RequestMapping("/playlist")
public class PlaylistController {

	@Autowired
	PlaylistService service;

	@GetMapping
	public Flux<Playlist> getPlaylist() {
		return service.findAll();
	}

	@GetMapping("/{id}")
	public Mono<Playlist> getPlaylist(@PathVariable String id) {
		return service.findById(id);
	}

	@PostMapping
	public Mono<Playlist> save(@RequestBody Playlist playlist) {
		return service.save(playlist);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable String id) {
		return new ResponseEntity<Object>( service.delete(id), HttpStatus.OK);
	}
}
