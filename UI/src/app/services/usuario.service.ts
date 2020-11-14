import { Injectable } from '@angular/core';
import { Usuario } from './../model/usuario';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  baseURL: string;
  constructor(private http: HttpClient ) {
      this.baseURL = 'http://localhost:8080/cenfochat/';
  }

  getUsuariosActivos(): Observable<Usuario[]>{
    return this.http.get<Usuario[]>(this.baseURL + "usuario");
  }

  postUsuario(usuario: Usuario): Observable<any>{
    return this.http.post<any>(this.baseURL + "usuario", usuario);
  }
}
