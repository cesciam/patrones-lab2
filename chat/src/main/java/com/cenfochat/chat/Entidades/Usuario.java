package com.cenfochat.chat.Entidades;

import com.cenfochat.chat.Interfaces.IMediador;
import com.cenfochat.chat.Interfaces.IUsuarioCenfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public class Usuario implements IUsuarioCenfo {
    protected int id;
    protected String nombre;

    public Usuario() {
    }

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\''+
                '}';
    }
}
