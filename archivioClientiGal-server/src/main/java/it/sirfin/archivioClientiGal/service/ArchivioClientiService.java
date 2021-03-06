/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivioClientiGal.service;

import it.sirfin.archivioClientiGal.dto.ListaClientiDto;
import it.sirfin.archivioClientiGal.model.Cliente;
import java.util.List;

/**
 *
 * @author Federico
 */
public interface ArchivioClientiService {
    ListaClientiDto aggiornaListaClienti ();
    ListaClientiDto inserisciCliente (Cliente c);
    ListaClientiDto cancellaCliente (Cliente c);
    ListaClientiDto cercaCliente (String stringa);
    ListaClientiDto selezionaCliente (Cliente c, Cliente s);
}
