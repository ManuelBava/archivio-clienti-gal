/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivioClientiGal.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Federico
 */

@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue
    private Long codice;
    
    @Column
    private String ragione;
    
    @Column
    private String indirizzo;

    public Cliente() {
    }

    public Cliente(String ragione_sociale, String indirizzo) {
        this.ragione = ragione_sociale;
        this.indirizzo = indirizzo;
    }

    public Long getCodice() {
        return codice;
    }

    public void setCodice(Long codice) {
        this.codice = codice;
    }

    public String getRagione() {
        return ragione;
    }

    public void setRagione(String ragione) {
        this.ragione = ragione;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codice=" + codice + ", ragione_sociale=" + ragione + ", indirizzo=" + indirizzo + '}';
    }

}
