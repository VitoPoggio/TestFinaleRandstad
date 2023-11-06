# TestFinaleRandstad

Descrizione: Creare un'applicazione Spring Boot per gestire l'inventario e gli ordini di una ferramenta.

Task:
   0.Setup del Progetto:
Inizializza un nuovo progetto Spring Boot con le dipendenze Spring Web, Spring Data JPA e un database in memoria come H2.
 Struttura definita:
         Creare un sistema completoi testabile anche solo su una linearità modulare
Definizione del Modello:
Crea l'entità Prodotto con campi come id, nome, prezzo e quantità.
Crea l'entità Cliente con campi come id, nome e contatti.
Crea l'entità Ordine che collega i clienti ai prodotti che vogliono acquistare.
Creazione dei Repository:
Crea un repository JPA per ogni entità per gestire le operazioni CRUD.
Implementazione della Logica di Business:
Sviluppa i servizi che usano i repository per eseguire operazioni come aggiungere prodotti all'inventario, registrare un nuovo cliente e processare un ordine.

# Implementati

Creata struttura progetto, model Cliente, Ordine, Prodotto con relativi Repository, Service e ServiceImpl
Create query personalizzate per recuperare lista di articoli presenti in uno specifico Ordine, query per modifica quantità prodotti disponibili
Inizati Controller Cliente, Prodotto, Ordine

# Da implementare

Completare controller Ordine
Interfaccia grafica con possibilità di utilizzare un carrello.