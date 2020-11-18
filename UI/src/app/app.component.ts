import { MensajeService } from './services/mensaje.service';
import { Observable } from 'rxjs';
import { Usuario } from './model/usuario';
import { Component } from '@angular/core';
import { UsuarioService } from './services/usuario.service';
import { Mensaje } from './model/Mensaje';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'UI';
  usuarios: Usuario[];

  constructor(private service: UsuarioService, private serviceMsj: MensajeService){
    this.addUsuarios();
  }

  quien;
  para;
  mensaje;
  ngOnInit() {

  }

  getUsuarios():void{
    this.service.getUsuariosActivos().subscribe(
      (data: Usuario[]) =>  {
        this.usuarios = data;
        console.log(data);

      },
      (err: any) => console.log(err)
    );
  }

  getUsuarios2(): Promise<Usuario[]>{
    return new Promise(resolve=>{
      this.service.getUsuariosActivos().subscribe(
        (data: Usuario[]) => {
          this.usuarios = data;

        },
        (error: any) => resolve(null)
      )
    });
  }

  async addUsuarios(): Promise<void>{
      var usuarios =  await this.getUsuarios2();
      this.usuarios = usuarios;
  }


  enviarMensaje(): void{
    let permiso
    if(this.para == -1){
      permiso = 1

    }else{
      permiso = 2;
    }

    if(this.quien == null || this.para == null || this.mensaje == null){
      alert('Debe llenar y seleccionar los espacios correspondientes.');
      this.para = null;
      return;
    }

    if(this.quien === this.para){
      alert('No puede enviar mensajes al mismo usuario.');
      this.para = null;
      return;
    }
    else{
      let msj: Mensaje = {
        receptor: this.para == -1 ? null : this.para,
        emisor: this.quien,
        mensaje: this.mensaje,
        permiso: permiso
      };
      console.log(msj);

      this.serviceMsj.enviarMsj(msj).subscribe(
        (data: any) => alert('Se ha enviado el mensaje de manera correcta.'),
        (err: any) => console.log(err)
      );
      window.location.reload();
    }



  }

}
