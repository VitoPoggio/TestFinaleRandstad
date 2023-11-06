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
 * Entity per il Prodotto. Contiene set per tabella intermedia OrdineProdotto
 */
@Entity
@Data
public class Prodotto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idProdotto;
	@Column(nullable = false)
	private String marca;
	@Column(nullable = false)
	private String modello;
	@Column(nullable = false)
	private double prezzo;
	@Column(columnDefinition = "default 1")
	private int quantita;

	@OneToMany(mappedBy = "prodotto", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<OrdineProdotto> op = new HashSet<OrdineProdotto>();
}
