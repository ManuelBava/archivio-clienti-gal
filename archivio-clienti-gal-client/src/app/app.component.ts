import { Component } from '@angular/core';
import { Cliente } from './cliente';
import { ClienteDto } from './cliente-dto';
import { ListaClientiDto } from './lista-clienti-dto';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  cliente = new Cliente();
  ricercaCliente = "";
  clienti: Cliente[] = [];
  url = "http://localhost:8080/";
  constructor(private http: HttpClient) {
  }

  aggiorna() {

  }
  aggiungi() {
    let dto = new ClienteDto();
    dto.cliente = this.cliente;
    //Servizio rest
    let os = this.http.post<ListaClientiDto>( this.url  + "inserisci", dto ).subscribe(v=> this.clienti = v.listaCliente );
    //ripulisco i campi
    this.cliente = new Cliente();
  }
  ricerca() {

  }
  seleziona() {

  }
  rimuovi() {

  }
  modifica() {

  }
  conferma() {

  }
  annulla() {

  }
  resetDb() {

  }
}
