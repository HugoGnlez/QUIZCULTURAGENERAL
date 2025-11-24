import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] preguntas = {"¿Cuál es el nombre del río más largo del mundo?", "¿Qué planeta está más cerca del Sol?",
                "¿En qué continente se encuentra Egipto?", "¿Quién pintó la Mona Lisa?", "¿Cuál es el idioma oficial de Brasil?",
                "¿En qué país nació Pablo Picasso?", "¿Qué moneda se usa en la mayoría de los países de la UE?",
                "¿Cuál es el océano más grande del mundo?", "¿Qué instrumento musical tiene teclas blancas y negras?",
                "¿Qué tipo de animal es la ballena azul?", "¿Cuántos planetas hay en el sistema solar?", "¿Quién escribió Don Quijote de la Mancha?",
                "¿Cuál es el país más grande del mundo?", "¿Qué órgano del cuerpo humano bombea la sangre?", "¿En qué año llegó el ser humano a la Luna?",
                "¿Cuál es la capital de Japón?", "¿Qué gas respiramos para vivir?", "¿Quién fue el primer presidente de los Estados Unidos?",
                "¿Qué estación del año sigue al invierno?", "¿En qué país se encuentran las pirámides de Giza?"}; //Preguntas

        String[] respuestas = {"Rio Nilo", "Mercurio", "Africa", "Leonardo da Vinci", "Portugues", "España", "Euro",
                "Oceano Pacifico", "Piano", "Mamifero", "Ocho", "Miguel de Cervantes", "Rusia", "Corazon", "1969",
                "Tokio", "Oxigeno", "George Washington", "Primavera", "Egipto"}; //Respuestas

        System.out.println("¡BIENVENIDO, PONGAMOS A PRUEBA TU CONOCIMIENTO!");
        System.out.println("Instrucciones: 1. Se responde con una sola palabra (en el caso de nombres de personas, deben ser completos /" +
                " 2. Todas las respuestas deben empezar con una mayúscula");

        int preguntaHecha = 0;
        int aciertos = 0;

        boolean seguirJugando = true; //Inicia el bucle para que una vez se acabe el juego, tener la opcion de continuar jugando
        while (seguirJugando) {
            while (preguntaHecha < 10) {

            Random rand = new Random(); //Genera numeros aleatorios
            int numero = rand.nextInt(19); //Saca un numero entre el 0-20 ya que he puesto 20 preguntas empezando
            // a contar por el 0.
            System.out.println(preguntas[numero]);

            String respuesta = sc.nextLine();

               if (respuesta.equals(respuestas[numero])) {
                   System.out.println("¡Correcto!");
                   aciertos+= 1;
               } else {
                   System.out.println("Incorrecto :( La respuesta correcta es: " + respuestas[numero]);
               }
               preguntaHecha += 1;
            }

            System.out.println("Has hecho " + aciertos + " aciertos");
            System.out.println("Quieres seguir jugando? ");
            String jugar = sc.nextLine();
                if (jugar.equals("Si")) {
                    preguntaHecha = 0;
                } else {
                    seguirJugando = false;
                }
        }
        sc.close();
    }
}

