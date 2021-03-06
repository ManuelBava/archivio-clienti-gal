package it.sirfin.archivioClientiGal.controller;

import it.sirfin.archivioClientiGal.dto.ListaClientiDto;
import it.sirfin.archivioClientiGal.dto.RicercaDto;
import it.sirfin.archivioClientiGal.dto.ClienteDto;
import it.sirfin.archivioClientiGal.model.Cliente;
import it.sirfin.archivioClientiGal.service.ArchivioClientiService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Federico
 */

@CrossOrigin("*")
@RestController
public class ArchivioClientiController {
    @Autowired
    ArchivioClientiService archivioClientiService;

    public List<Cliente> aggiornaListaClienti() {
        return archivioClientiService.aggiornaListaClienti();
    }

    public List<Cliente> inserisciCliente(Cliente c) {
        return archivioClientiService.inserisciCliente(c);
    }

    public List<Cliente> cancellaCliente(Cliente c) {
        return archivioClientiService.cancellaCliente(c);
    }

    public List<Cliente> cercaCliente(String stringa) {
        return archivioClientiService.cercaCliente(stringa);
    }

    
}

