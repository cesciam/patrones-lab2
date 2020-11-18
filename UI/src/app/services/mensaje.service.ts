import { Mensaje } from './../model/Mensaje';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MensajeService {

  baseURL: string;
  constructor(private http: HttpClient ) {
      this.baseURL = 'http://localhost:8080/cenfochat/';
  }

  getMensajesUsuario(id: number): Observable<Mensaje[]>{
    return this.http.get<Mensaje[]>(this.baseURL + 'mensaje/'+ id);
  }

  enviarMsj(msj: Mensaje): Observable<void>{
    return this.http.post<void>(this.baseURL + 'mensaje', msj);
  }
}
