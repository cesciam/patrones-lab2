package com.cenfochat.chat;

import com.cenfochat.chat.Entidades.Mensaje;
import com.cenfochat.chat.Entidades.Usuario;
import com.cenfochat.chat.Gestores.GestorMensajes;
import com.cenfochat.chat.Interfaces.IUsuarioCenfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class ChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatApplication.class, args);
	}


}


