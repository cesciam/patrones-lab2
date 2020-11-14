package com.cenfochat.chat.Gestores;

import com.cenfochat.chat.Core.Mediador;
import com.cenfochat.chat.Entidades.Mensaje;
import com.cenfochat.chat.Entidades.Usuario;
import com.cenfochat.chat.Interfaces.IMediador;
import com.cenfochat.chat.Interfaces.IUsuarioCenfo;

import java.util.ArrayList;

public class GestorMensajes {
    private IMediador mediador;

    public GestorMensajes() {
        this.mediador = new Mediador();
    }

    public boolean addMensaje(Mensaje mensaje){
       return (this.mediador.enviarMensaje(mensaje)) ? true: false;
    }

    public ArrayList<Mensaje> getMensajes(){
        return this.mediador.obtenerMensajes();
    }

    public ArrayList<Mensaje> getMensajesUsr(int id){
        return  this.mediador.obtenerMensajePorUsuario(id);
    }

    public void addUsario(IUsuarioCenfo usuario){
        this.mediador.nuevo_Usuario(usuario);
    }

    public IMediador getMediador() {
        return mediador;
    }

    public ArrayList<IUsuarioCenfo> obtenerUsuariosActivos(){
        return  this.mediador.obtenerUsuariosActivos();
    }
}
