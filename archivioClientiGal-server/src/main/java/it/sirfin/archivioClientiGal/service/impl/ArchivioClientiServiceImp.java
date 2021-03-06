
package it.sirfin.archivioClientiGal.service.impl;

import it.sirfin.archivioClientiGal.model.Cliente;
import it.sirfin.archivioClientiGal.repository.ClienteRepository;
import it.sirfin.archivioClientiGal.service.ArchivioClientiService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArchivioClientiServiceImp implements ArchivioClientiService {

    @Override
    public List<Cliente> aggiornaListaClienti() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> inserisciCliente(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> cancellaCliente(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> cercaCliente(String stringa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
