import { HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { Cliente } from './cliente';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  cliente = new Cliente();
  ricercaCliente = "";
  clienti: Cliente[] = [];

  constructor(private http: HttpClientModule) {
  }

  aggiorna() {

  }
  aggiungi() {

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
