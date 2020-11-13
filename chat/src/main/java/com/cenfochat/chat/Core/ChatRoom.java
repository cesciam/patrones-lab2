package com.cenfochat.chat.Core;

import com.cenfochat.chat.Entidades.Mensaje;

import java.util.ArrayList;

public class ChatRoom {
    private ArrayList<Mensaje> mensajes;

    public ChatRoom() {
        mensajes = new ArrayList<>();
    }

    public void addMensaje(Mensaje mensaje){
        mensajes.add(mensaje);
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public ArrayList<Mensaje> mensajePorUsuario(int id){
        ArrayList<Mensaje> mensajesXUsu = new ArrayList<>();
        for (Mensaje mensaje: mensajes) {
            if(mensaje.getId_usuario() == id ){
                mensajesXUsu.add(mensaje);
            }

        }

        if(mensajes.size() > 0){
            return mensajesXUsu;
        }
        return null;
    }
}
