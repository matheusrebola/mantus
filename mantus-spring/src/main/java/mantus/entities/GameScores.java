package br.org.diversao.mantus.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record GameScores(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		Integer scocre,
		LocalDateTime recordedAt,
		Users user,
		Games game) {

}
