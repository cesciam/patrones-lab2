package com.cenfochat.chat.Entidades;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public class Mensaje {
    private String mensaje;
    private int permiso;
    private Usuario receptor;
    private Usuario emisor;

    /**
     * El permiso se encarga de decidir si es para un solo usuario
     * o para todos. En caso de que el permiso tengo un valor de 1,
     * es para todos, si tiene un 2, es para un usuario en específico
     * Y dependiendo de esto, usa un constructor o el otro
     * @param mensaje Mensaje que envia
     * @param receptor Usuario que recibe el mensaje
     * @param emisor Usuario que emite el emite
     */
    public Mensaje(String mensaje, Usuario emisor, Usuario receptor) {
        this.mensaje = mensaje;
        this.receptor = receptor;
        this.emisor = emisor;
        this.permiso = 1;
    }

    public Mensaje(String mensaje, Usuario emisor) {
        this.mensaje = mensaje;
        this.emisor = emisor;
        this.permiso = 2;
    }

    public Mensaje(String mensaje, int permiso, Usuario receptor, Usuario emisor) {
        this.mensaje = mensaje;
        this.permiso = permiso;
        this.receptor = receptor;
        this.emisor = emisor;
    }

    public Mensaje() {
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getPermiso() {
        return permiso;
    }

    public void setPermiso(int permiso) {
        this.permiso = permiso;
    }

    @Override
    public String toString() {
        return  emisor.getNombre() + " => " + (receptor !=null ? receptor.getNombre() : "Todos") +
                "\n" + mensaje+"\n";

    }

    public Usuario getReceptor() {
        return receptor;
    }

    public Usuario getEmisor() {
        return emisor;
    }
}
