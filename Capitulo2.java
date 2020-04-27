import java.util.Scanner;

/* 
 * Programa para sumar dos enteros 
 * 
 * 
 * By Nicolas Gimenez 
 * */

public class CapituloDos{
	
	// el metodo main empieza la ejecucion de la aplicacion java
	public static void main(String[] args) {
		
		System.out.print("Mi primer programa en Java");
	
		int numero1;
		int numero2;
		int suma; // variable para suma de numero1 y numero2
		
		// creo objeto Scanner para obtener la entrada del teclado
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nEscriba el primer numero entero: "); // indicador para mostrar por consola al usuario
		numero1 = entrada.nextInt(); //lee el primer numero del usuario
		
		System.out.print("\nEscriba el segundo numero entero: ");
		numero2 = entrada.nextInt();
		
		
		suma = numero1 + numero2;
		
		
		System.out.printf("\nLa suma de los dos enteros es de %d", suma);	
		
		
		
	}//cierre de metodo main
	
}//cierre de clase CapituloDos
