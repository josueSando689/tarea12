package tarea12;

import java.util.Arrays;
import java.util.List;

public class PromedioLista {
	 public static void main(String[] args) {
	        List<Integer> numeros = Arrays.asList(6, 5, 8, 4, 7);

	        double promedio = calcularPromedio(numeros);
	        System.out.println("La lista de numeros es " + numeros);
	        System.out.println("El promedio es: " + promedio);
	    }

	    public static double calcularPromedio(List<Integer> numeros) {
	        int suma = numeros.stream()
	                .mapToInt(Integer::intValue)
	                .sum();

	        return (double) suma / numeros.size();
	    }
}
