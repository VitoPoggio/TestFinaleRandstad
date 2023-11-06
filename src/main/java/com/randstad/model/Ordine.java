package com.randstad.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

/**
 * Entity per il Ordine. Contiene collegamento a Cliente e un set per tabella intermedia OrdineProdotto
 */
@Entity
@Data
public class Ordine {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idOrdine;
	@Column(nullable = false)
	private double totale;
	@Column(nullable = false)
	private Date date;
	@ManyToOne
	@JoinColumn(name = "id_cliente", nullable = false)
	private Cliente cliente;

	@OneToMany(mappedBy = "ordine", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<OrdineProdotto> op = new HashSet<OrdineProdotto>();
} 
