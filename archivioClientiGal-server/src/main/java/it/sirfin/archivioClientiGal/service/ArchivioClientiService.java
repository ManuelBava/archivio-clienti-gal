/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivioClientiGal.service;

import it.sirfin.archivioClientiGal.model.Cliente;
import java.util.List;

/**
 *
 * @author Federico
 */
public interface ArchivioClientiService {
    List <Cliente> aggiornaListaClienti ();
    List <Cliente> inserisciCliente (Cliente c);
    List <Cliente> cancellaCliente (Cliente c);
    List <Cliente> cercaCliente (String stringa);
}
