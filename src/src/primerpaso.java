
import java.util.Scanner;

/*
  Esta clase contiene un programa simple en Java que solicita el nombre del usuario
  y muestra un mensaje personalizado en la consola.
 */
public class primerpaso{

    public static void main(String[] args) {
        String nombre = obtenerNombre();
        // Obtener el nombre del usuario
        imprimirMensaje(nombre);
        // Imprimir mensaje personalizado
    }

    /*
     * Solicita al usuario que introduzca su nombre mediante la consola.
     * retorna El nombre ingresado por el usuario.
     */
    public static String obtenerNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        return scanner.nextLine();
    }

    /*
     * Imprime un mensaje personalizado con el nombre proporcionado.
     * @ nombre El nombre del usuario.
     */
    public static void imprimirMensaje(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Concluí la aula 01 y ahora estoy sumergiéndome en Java!");
    }
}
