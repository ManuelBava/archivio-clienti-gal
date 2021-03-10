package it.sirfin.archivioClientiGal.service.impl;

import it.sirfin.archivioClientiGal.dto.ClienteDto;
import it.sirfin.archivioClientiGal.dto.ListaClientiDto;
import it.sirfin.archivioClientiGal.model.Cliente;
import it.sirfin.archivioClientiGal.repository.ClienteRepository;
import it.sirfin.archivioClientiGal.service.ArchivioClientiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArchivioClientiServiceImpl implements ArchivioClientiService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public ListaClientiDto aggiornaListaClienti() {
        return new ListaClientiDto(clienteRepository.findAll());
    }

    @Override
    public ListaClientiDto inserisciCliente(Cliente c) {
        clienteRepository.save(c);
        return aggiornaListaClienti();
    }

    @Override
    public ListaClientiDto cancellaCliente(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListaClientiDto cercaCliente(String stringa) {
        return new ListaClientiDto(clienteRepository.findByCodiceContainsOrRagioneSocialeContainsOrIndirizzoContains(stringa, stringa, stringa));
    }

    @Override
    public ListaClientiDto selezionaCliente(Cliente c, Cliente s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
