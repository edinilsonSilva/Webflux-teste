package com.edinilson.api.webflux.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document
@Data
@AllArgsConstructor
public class Playlist {

	private String id;
	private String nome;
}
