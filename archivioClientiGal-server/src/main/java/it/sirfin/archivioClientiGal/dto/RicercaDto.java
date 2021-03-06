/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivioClientiGal.dto;

/**
 *
 * @author Federico
 */
public class RicercaDto {

    private String stringaDaCercare;

    public RicercaDto() {
    }

    public RicercaDto(String stringaDaCercare) {
        this.stringaDaCercare = stringaDaCercare;
    }

    public String getStringaDaCercare() {
        return stringaDaCercare;
    }

    public void setStringaDaCercare(String stringaDaCercare) {
        this.stringaDaCercare = stringaDaCercare;
    }

    @Override
    public String toString() {
        return "RicercaDto{" + '}';
    }
}
