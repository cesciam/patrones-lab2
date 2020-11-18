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

    public ArrayList<Mensaje> getMensajesTodos() {
        ArrayList<Mensaje> mensajeTodos;
        if(mensajes.size()>0){
            mensajeTodos = new ArrayList<>();
            for (Mensaje msjUsr: mensajes) {
                if(msjUsr.getPermiso() == 2){
                    mensajeTodos.add(msjUsr);
                }
            }

            return mensajeTodos;
        }
        return  null;
    }

    public ArrayList<Mensaje> mensajePorUsuario(int id){
        ArrayList<Mensaje>  mensajesUsr;
        if(mensajes.size()>0){
            mensajesUsr = new ArrayList<>();
            for (Mensaje msjUsr: mensajes) {
                if(msjUsr.getReceptor()!= null){
                    if(msjUsr.getReceptor().getId() == id){
                        mensajesUsr.add(msjUsr);
                    }
                }else{
                    mensajesUsr.add(msjUsr);
                }
            }

            return mensajesUsr;
        }

        return  null;
    }
}
