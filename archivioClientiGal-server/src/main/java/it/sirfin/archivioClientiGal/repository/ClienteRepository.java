/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivioClientiGal.repository;

import it.sirfin.archivioClientiGal.model.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Federico
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    //List<Cliente> findByCodiceOrRagioneOrIndirizzo(String s, String c, String v);
}
