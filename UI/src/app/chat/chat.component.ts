import { MensajeService } from './../services/mensaje.service';
import { Component, Input, OnInit } from '@angular/core';
import { Mensaje } from '../model/Mensaje';

@Component({
  selector: 'app-chat',
  templateUrl: './chat.component.html',
  styleUrls: ['./chat.component.css']
})
export class ChatComponent implements OnInit {
  @Input ()
  id: any;

  mensajes: Mensaje[]
  constructor(private service: MensajeService) { }

  ngOnInit(): void {
    this.service.getMensajesUsuario(this.id).subscribe(
      (data: any) => this.mensajes = data,
      (err: any) => console.log(err)

    );

  }

}
