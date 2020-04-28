package com.edinilson.api.webflux.service;

import com.edinilson.api.webflux.documents.Playlist;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PlaylistService {

	Flux<Playlist> findAll();
	
	Mono<Playlist> findById(String id);
	
	Mono<Playlist> save(Playlist playlist);
	
	Mono<?> delete(String id);
}
