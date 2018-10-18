public class Ejercicio412 {

    
  public static void main(String[] Strings) {


      String linea;
    
      System.out.println("¿Cuál de estas dos maneras de almacenar datos permite números decimales?");
      System.out.println("1. Float    2. Int");

      linea = System.console().readLine();
      int r1 = Integer.parseInt( linea );
      
      System.out.println("¿Qué nos permite esta línea de código?: System.out.print()");
      System.out.println("1.Introducir texto capaz de ser leído al ejecutarse     2. Leer la información introducida por el usuario desde su teclado");

      linea = System.console().readLine();
      int r2 = Integer.parseInt( linea );

      System.out.println("¿Qué comando compila el código de java en la consola de comandos de Linux?");
      System.out.println("1. java    2. javac");

      linea = System.console().readLine();
      int r3 = Integer.parseInt( linea );
      
      System.out.println("¿De cuántos espacios se compone una indentación?");
      System.out.println("1. Tres    2. Dos");

      linea = System.console().readLine();
      int r4 = Integer.parseInt( linea );
      
      System.out.println("¿Cuál de estos dos programas es un IDE?");
      System.out.println("1. Geany    2. MySQL");

      linea = System.console().readLine();
      int r5 = Integer.parseInt( linea );
     
      System.out.println("switch (m) {, ¿qué significado posee la letra entre paŕentesis?");
      System.out.println("1. Mover    2. Variable que apunta a cada caso");

      linea = System.console().readLine();
      int r6 = Integer.parseInt( linea );
      
      System.out.println("¿Qué nos permitiría ejecutar siempre una línea de código si todas las condiciones previas son falsas?");
      System.out.println("1. else     2. else if");

      linea = System.console().readLine();
      int r7 = Integer.parseInt( linea );      
      
      System.out.println("¿En qué formato se guarda el código compilado hasta ahora?");
      System.out.println("1. .exe    2. .class");

      linea = System.console().readLine();
      int r8 = Integer.parseInt( linea );      
      
      System.out.println("¿Qué ocurrirá si compilamos código con una public class de distinto nombre al del archivo?");
      System.out.println("1. Se compilará sin problema    2. Fallará");

      linea = System.console().readLine();
      int r9 = Integer.parseInt( linea );                              
      
      System.out.println("¿Qué operador lógico emplearíamos para requerir que dos condiciones numéricas adyacentes sean válidas?");
      System.out.println("1. ||    2. &&");

      linea = System.console().readLine();
      int r10 = Integer.parseInt( linea );            
      
      
      int punt1 = Math.abs(r1 - 2) + Math.abs(r2 - 2) + Math.abs(r5 - 2) + Math.abs(r7 - 2) + Math.abs(r8 - 2);
      int punt2 = (r3 - 1) + (r4 - 1) + (r6 - 1) + (r9 - 1) + (r10 - 1);
      
      int puntT = punt1 + punt2;
      

      
      System.out.print("Has obtenido " + puntT + " puntos.");
           
           
         
    }
}      
     
