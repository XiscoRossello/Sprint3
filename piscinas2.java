package sprint3;
import java.util.Scanner;

public class piscinas2 {
    public static void main(String[] args) {
        // Creamos todas la variables
        final float lado = 300.3f;
        // int lado3;
        float ancho1=150.5f;
        float ancho2=80.5f;
        // int ancho3;
        float profundo1=20.5f;
        float profundo2=35.5f;
        // int profundo3;
        int area1;
        int area2;
        // int area3;
        int vol1;
        int vol2;
        // int vol3;
        //Calculamos el area de las piscinas
        area1 = Math.round(lado * ancho1);
        area2 = Math.round(lado * ancho2);
        System.out.println("El area de la piscina 1 es " + area1 + " m2");
        System.out.println("El area de la piscina 2 es " + area2 + " m2");
        //Calculamos el volumen
        vol1 = Math.round(area1 * profundo1);
        vol2 = Math.round(area2 * profundo2);
        // Generamos la entrada para modificaciones por el usuario
        System.out.println("El volumen de la piscina 1 es " + vol1 + " m3");
        System.out.println("El volumen de la piscina 2 es " + vol2 + " m3");
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Inserte el nuevo ancho de piscina 1");
        ancho1 = scanner.nextFloat();

        System.out.println("Inserte el nuevo ancho de piscina 2");
        ancho2 = scanner.nextFloat();  
       
        System.out.println("Inserte la nueva profundidad de piscina 1");
        profundo1 = scanner.nextFloat();
  
        System.out.println("Inserte la nueva profundidad de piscina 2");
        profundo2 = scanner.nextFloat();
        area1 = Math.round(lado * ancho1);
        area2 = Math.round(lado * ancho2);
        System.out.println("El area de la nueva piscina 1 es " + area1 + " m2");
        System.out.println("El area de la nueva piscina 2 es " + area2 + " m2");
        //Calculamos el volumens
        vol1 = Math.round(area1 * profundo1);
        vol2 = Math.round(area2 * profundo2);
        System.out.println("El volumen de la nueva piscina 1 es " + vol1 + " m2");
        System.out.println("El volumen de la nueva piscina 2 es " + vol2 + " m2");
        scanner.close();
    }
}


