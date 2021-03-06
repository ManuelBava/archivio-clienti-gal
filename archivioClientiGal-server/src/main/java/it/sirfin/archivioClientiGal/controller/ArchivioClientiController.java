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

    @RequestMapping("/aggiorna")
    @ResponseBody
    public ListaClientiDto aggiornaListaClienti() {
        return archivioClientiService.aggiornaListaClienti();
    }

    @RequestMapping("/inserisci")
    @ResponseBody
    public ListaClientiDto inserisciCliente(@RequestBody ClienteDto c) {
        return archivioClientiService.inserisciCliente(c.getCliente());
    }

    
    @RequestMapping("/cancella")
    @ResponseBody
    public ListaClientiDto cancellaCliente(@RequestBody Cliente c) {
        return archivioClientiService.cancellaCliente(c);
    }

    
    @RequestMapping("/cerca")
    @ResponseBody
    public ListaClientiDto cercaCliente(@RequestBody String stringa) {
        return archivioClientiService.cercaCliente(stringa);
    }

    @RequestMapping("/seleziona")
    @ResponseBody
    public ListaClientiDto selezionaCliente(@RequestBody Cliente c, @RequestBody Cliente s) {
        return archivioClientiService.selezionaCliente(c, s);
    }

    
}

