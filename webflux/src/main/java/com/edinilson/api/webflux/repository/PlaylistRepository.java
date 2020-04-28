package com.edinilson.api.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.edinilson.api.webflux.documents.Playlist;

@Repository
public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String>{

}
