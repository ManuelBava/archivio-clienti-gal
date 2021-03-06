/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivioClientiGal.dto;

import it.sirfin.archivioClientiGal.model.Cliente;
import java.util.List;

/**
 *
 * @author Federico
 */
public class ListaClientiDto {

    private List<Cliente> listaClienti;

    public ListaClientiDto() {
    }

    public ListaClientiDto(List<Cliente> listaClienti) {
        this.listaClienti = listaClienti;
    }

    public List<Cliente> getListaClienti() {
        return listaClienti;
    }

    public void setListaClienti(List<Cliente> listaClienti) {
        this.listaClienti = listaClienti;
    }

    @Override
    public String toString() {
        return "ListaContatti{" + "listaClienti=" + listaClienti + '}';
    }

}
