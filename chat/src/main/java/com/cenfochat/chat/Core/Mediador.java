package com.cenfochat.chat.Core;

import com.cenfochat.chat.Entidades.Mensaje;
import com.cenfochat.chat.Interfaces.IMediador;
import com.cenfochat.chat.Interfaces.IUsuarioCenfo;

import java.util.ArrayList;

public class Mediador implements IMediador {
    private  ChatRoom chat;
    ArrayList<IUsuarioCenfo> usuariosActivos;

    public Mediador() {
        chat = new ChatRoom();
        usuariosActivos = new ArrayList<>();
    }

    @Override
    public boolean enviarMensaje(Mensaje msj) {
       //Verificar existencia del usuario
            this.chat.addMensaje(msj);
            return true;

    }

    @Override
    public ArrayList<Mensaje> obtenerMensajes() {
        return this.chat.getMensajesTodos();
    }

    @Override
    public ArrayList<Mensaje> obtenerMensajePorUsuario(int id) {
        return this.chat.mensajePorUsuario(id);
    }

    @Override
    public void nuevo_Usuario(IUsuarioCenfo usuario) {
        usuariosActivos.add(usuario);
    }

    @Override
    public ArrayList<IUsuarioCenfo> obtenerUsuariosActivos() {
        return usuariosActivos;
    }


    public ChatRoom getChat() {
        return chat;
    }

    public void setChat(ChatRoom chat) {
        this.chat = chat;
    }

    public ArrayList<IUsuarioCenfo> getUsuariosActivos() {
        return usuariosActivos;
    }

    public void setUsuariosActivos(ArrayList<IUsuarioCenfo> usuariosActivos) {
        this.usuariosActivos = usuariosActivos;
    }
}
