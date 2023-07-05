package tarea12;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LambdaLista {
private Scanner scanner;
private List <String> escribirNombre;
private List <Integer> escribirEdad;

public LambdaLista() {
	scanner = new Scanner(System.in);
	escribirNombre = new ArrayList<>();
	escribirEdad = new ArrayList<>();
  }

public void metodoPersona() {
	 for (int i=0; i<5; i++) {
	 System.out.println("Escribe el nombre de la persona");
     String texto = scanner.nextLine();
     escribirNombre.add(texto);
     System.out.println("Escribe la edad de la persona");
     int texto1 = scanner.nextInt();
     escribirEdad.add(texto1);
     
     scanner.nextLine(); 
	 }
   }

public void filtrarMayoresDe30() {
	System.out.println("Las personas que tienen mas de teinta son:");
     escribirNombre
        .stream()
        .filter(nombre -> escribirEdad.get(escribirNombre.indexOf(nombre)) > 30)
        .forEach(System.out::println);
}
}

