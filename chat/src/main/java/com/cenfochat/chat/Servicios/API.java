package com.cenfochat.chat.Servicios;

import com.cenfochat.chat.Core.Mediador;
import com.cenfochat.chat.Entidades.Mensaje;
import com.cenfochat.chat.Entidades.Usuario;
import com.cenfochat.chat.Gestores.GestorMensajes;
import com.cenfochat.chat.Interfaces.IMediador;
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
}
