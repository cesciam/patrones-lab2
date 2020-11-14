package com.cenfochat.chat.Interfaces;

import com.cenfochat.chat.Entidades.Mensaje;
import com.cenfochat.chat.Entidades.Usuario;

import java.util.ArrayList;

public  interface IMediador {
    public boolean enviarMensaje(Mensaje msj);

    public ArrayList<Mensaje> obtenerMensajes();
    public ArrayList<Mensaje> obtenerMensajePorUsuario(int id);
    public void nuevo_Usuario(IUsuarioCenfo usuario);
    public ArrayList<IUsuarioCenfo> obtenerUsuariosActivos();
}
