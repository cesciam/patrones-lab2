import { Usuario } from './model/usuario';
import { Component } from '@angular/core';
import { UsuarioService } from './services/usuario.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'UI';
  usuarios: Usuario[];

  constructor(private service: UsuarioService){

  }

  ngOnInit() {
    this.getUsuarios();
    if(typeof(this.usuarios) == undefined){
      if(this.usuarios.length < 0) {
        let profesor: Usuario = {
          id: 1,
          nombre: 'Profesor'
        };

        let alumno1: Usuario = {
          id: 2,
          nombre: 'Alumno 1'
        };

        let alumno2: Usuario = {
          id: 3,
          nombre: 'Alumno 2'
        };

        this.addUsuario(profesor);
        this.addUsuario(alumno1);
        this.addUsuario(alumno2);
      }
    }


  }

  addUsuario(usuario: Usuario): void{
    this.service.postUsuario(usuario).subscribe(
      (data: any) => console.log(data),
      (err: any) => console.log(err)
    );
  }

  getUsuarios():void{
    this.service.getUsuariosActivos().subscribe(
      (data: Usuario[]) => this.usuarios = data,
      (err: any) => console.log(err)
    );

    alert("Hola")
    console.log(this.usuarios);
  }

}
