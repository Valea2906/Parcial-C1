package eci.edu.dosw.parcial.Parcial_C1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import java.util.Scanner;

@SpringBootApplication
public class ParcialC1Application {

	public static void main(String[] args) {
		SpringApplication.run(ParcialC1Application.class, args);

		Scanner sc = new Scanner(System.in);

		System.out.println("=== ECI Notification System ===");


		System.out.print("Ingrese su nombre: ");
		String usuario = sc.nextLine();


		System.out.println("Seleccione el canal de notificación:");
		System.out.println("1. EMAIL");
		System.out.println("2. SMS");
		System.out.println("3. MOVIL");
		int opcion = sc.nextInt();

		Canal canalElegido;
		switch (opcion) {
			case 1 -> canalElegido = Canal.EMAIL;
			case 2 -> canalElegido = Canal.SMS;
			case 3 -> canalElegido = Canal.MOVIL;
			default -> {
				System.out.println("Opción inválida, se usará EMAIL por defecto.");
				canalElegido = Canal.EMAIL;
			}
		}

		String asunto = "Alerta de Envío";
		String cuerpo = "Su paquete ha sido despachado y llegará en 3 días.";
		int criticidad = 5;

		MensajeNot mensaje = new MensajeNot(usuario, asunto, cuerpo, criticidad);
		Notificacion notificacion = EcciNotificacion.crearNotificacion(canalElegido);

		System.out.println("\n--- Enviando notificación ---");
		notificacion.send(mensaje);
		System.exit(0);
	}
}
