import { Usuario } from './usuario';

export class Mensaje {
  mensaje: string;
  emisor: Usuario;
  permiso: number;
  receptor: Usuario;
}
