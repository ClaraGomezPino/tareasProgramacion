public class Ejercicio312 {
	public static void main(String[] args) {
		String linea;
		
		System.out.print("Por favor, introduce la nota que has obtenido en tu primer examen: ");
		linea = System.console().readLine();
		double nota1;
		nota1 = Integer.parseInt( linea );
		
    System.out.print("¿Con qué nota desearías acabar el trimestre? Introdúcela: ");
		linea = System.console().readLine();
		double notaTr;
		notaTr = Integer.parseInt( linea );
    
    double nota2;
    nota2 = (notaTr - 0.4 * nota1)  / 0.6 ;
		
		System.out.println("¿Así que deseas sacar un " + notaTr + " en la evaluación trimestral?");
		System.out.println("Teniendo un " + nota1 + " en tu primer examen " + " necesitarás sacar un " + nota2 + " en el próximo examen.");

	}
}

