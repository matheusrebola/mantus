package br.org.diversao.mantus.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record GameType(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String typeName) {

}
