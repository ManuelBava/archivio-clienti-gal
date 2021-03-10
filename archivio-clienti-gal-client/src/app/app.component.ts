import { Component } from '@angular/core';
import { Cliente } from './cliente';
import { ClienteDto } from './cliente-dto';
import { ListaClientiDto } from './lista-clienti-dto';
import { HttpClient } from '@angular/common/http';
import { CriterioRicercaDto } from './criterio-ricerca-dto';
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
    this.aggiorna();
  }

  aggiorna() {
    this.http.get<ListaClientiDto>(this.url + "aggiorna")
      .subscribe(r => this.clienti = r.listaClienti);
  }
  aggiungi() {
    let dto = new ClienteDto();
    dto.cliente = this.cliente;
    //Servizio rest
    let os = this.http.post<ListaClientiDto>(this.url + "inserisci", dto).subscribe(v => this.clienti = v.listaClienti);
    //ripulisco i campi
    this.cliente = new Cliente();
  }
  ricerca() {
    let dto = new CriterioRicercaDto();
    dto.stringaDaCercare = this.ricercaCliente;
    //preparo servizio rest
    this.http.post<ListaClientiDto>(this.url + "cerca", dto)
      .subscribe(r => this.clienti = r.listaClienti);
  }
  seleziona() {

  }
  rimuovi(c: Cliente) {
    let dto = new ClienteDto();
    dto.cliente = c;
    this.http.post<ListaClientiDto>(this.url + "cancella", dto)
      .subscribe(r => this.clienti = r.listaClienti);

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
