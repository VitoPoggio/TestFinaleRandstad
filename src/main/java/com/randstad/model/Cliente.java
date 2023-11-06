package com.randstad.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

/**
 * Entity per il Cliente. Contiene un set di Ordini
 */
@Entity
@Data
public class Cliente {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idCliente;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cognome;
	@Column(nullable = false, length = 10)
	private String numeroTelefono;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = false)
	private String password;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Ordine> ordini = new HashSet<Ordine>();
}

