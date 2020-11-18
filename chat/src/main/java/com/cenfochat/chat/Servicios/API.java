package com.cenfochat.chat.Servicios;

import com.cenfochat.chat.Core.Mediador;
import com.cenfochat.chat.Entidades.Mensaje;
import com.cenfochat.chat.Entidades.Usuario;
import com.cenfochat.chat.Gestores.GestorMensajes;
import com.cenfochat.chat.Interfaces.IMediador;
import com.cenfochat.chat.Interfaces.IUsuarioCenfo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*")
public class API {
    private GestorMensajes gestor = new GestorMensajes();;


    @PostMapping("/cenfochat/mensaje")
    void nuevoMensaje(@RequestBody Mensaje mensaje){
        this.gestor.addMensaje(mensaje);
    }

    @GetMapping("/cenfochat/mensaje")
    ArrayList<Mensaje> obtenerMensajes(){
        return this.gestor.getMensajes();
    }

    @GetMapping("/cenfochat/usuario")
    ArrayList<IUsuarioCenfo> obtenerUsuarios(){
        if(this.gestor.obtenerUsuariosActivos().size() == 0){
            Usuario profesor = new Usuario(1, "Profesor");
            Usuario alumno1 = new Usuario(2, "Alumno1");
            Usuario alumno2 = new Usuario(3, "Alumno2");
            this.gestor.addUsario(profesor);
            this.gestor.addUsario(alumno1);
            this.gestor.addUsario(alumno2);
        }

        return  this.gestor.obtenerUsuariosActivos();
    }

    @PostMapping("/cenfochat/usuario")
    void nuevoUsuario(@RequestBody Usuario usuarioCenfo){
        this.gestor.addUsario(usuarioCenfo);
    }

    @GetMapping("/cenfochat/mensaje/{id}")
    public ArrayList<Mensaje> obtenerMensajePorUsuario(@PathVariable int id){
        return this.gestor.obtenerMensajePorUsuario(id);
    }
}
