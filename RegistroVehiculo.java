import java.util.Scanner; // traigo la librería para capturar lo que escriba el usuario

public class RegistroVehiculo {
    public static void main(String[] args) {
        // preparo el scanner para leer los datos
        Scanner ingreso = new Scanner(System.in);
        
        // variables de texto y números según la tarea
        String marca_v, modelo_v, tipo_bencina;
        int cilindrada_n, cant_pasajeros;

        // pidiendo los datos al usuario
        System.out.print("Marca: ");
        marca_v = ingreso.nextLine(); // guardo marca

        System.out.print("Modelo: ");
        modelo_v = ingreso.nextLine(); // guardo modelo

        System.out.print("Cilindrada: ");
        cilindrada_n = ingreso.nextInt(); // guardo numero de cilindrada
        ingreso.nextLine(); // limpio el salto de linea para que no falle

        System.out.print("Combustible: ");
        tipo_bencina = ingreso.nextLine(); // guardo el tipo de combustible

        System.out.print("Capacidad pasajeros: ");
        cant_pasajeros = ingreso.nextInt(); // guardo la cantidad de gente

        // imprimo los resultados como pide el ejemplo
        System.out.println("\n--- RESULTADO DEL REGISTRO ---");
        System.out.println("La marca que ha ingresado es: " + marca_v);
        System.out.println("El modelo que ha ingresado es: " + modelo_v);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada_n);
        System.out.println("El tipo de combustible es: " + tipo_bencina);
        System.out.println("Tiene una capacidad de " + cant_pasajeros + " pasajeros.");
        
        ingreso.close(); // cierro el scanner
    }
}