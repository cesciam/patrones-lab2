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

	static void imprimirArrayList(ArrayList<Mensaje> mensajes){
		if(!(mensajes == null)){
			for (Mensaje mensajeLista:
					mensajes) {
				System.out.println(mensajeLista.toString());

			}
		}else {
			System.out.println("La lista se encuentra vacia");
		}
	}

	static void imprimirArrayListuSU(ArrayList<IUsuarioCenfo> mensajes){
		if(!(mensajes == null)){
			for (IUsuarioCenfo mensajeLista:
					mensajes) {
				System.out.println(mensajeLista.toString());

			}
		}else {
			System.out.println("La lista se encuentra vacia");
		}
	}
}


