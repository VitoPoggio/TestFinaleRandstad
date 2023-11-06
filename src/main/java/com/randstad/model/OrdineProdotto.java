package com.randstad.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

/**
 * Entity per il OrdineProdotto. Contiene riferimento a Ordine e Prodotto in quanto è la tabella intermedia
 */
@Entity
@Data
public class OrdineProdotto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable=false)
	private int qta;
	
	@ManyToOne
	@JoinColumn(name = "id_Ordine", nullable = false)
	private Ordine ordine;
	
	@ManyToOne
	@JoinColumn(name = "id_Prodotto", nullable = false)
	private Prodotto prodotto;
}
