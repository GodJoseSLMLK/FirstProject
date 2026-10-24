
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    Punto p1 = new Punto();
    System.out.println(p1.getX());
    System.out.println(p1.getY());
    System.out.println(p1.modulo());
p1.setX(2);
p1.setY(3);
System.out.println(p1.getX());
System.out.println(p1.getY());
p1.modulo();
System.out.println(p1.modulo());
Punto p2 = new Punto(2,3);
System.out.println(p2.getX());
System.out.println(p2.getY());
System.out.println(p2.modulo());

PuntoTiempo pt1 = new PuntoTiempo();
System.out.println(pt1.getX());
System.out.println(pt1.getY());
System.out.println(pt1.getT());
System.out.println(pt1.velocidad());
System.out.println(pt1.modulo());

PuntoTiempo pt2 = new PuntoTiempo(1, 2, 3);
System.out.println(pt2.getX());
System.out.println(pt2.getY());
System.out.println(pt2.getT());
System.out.println(pt2.velocidad());
System.out.println(pt2.modulo());
        //mayor de edad
        /*
            Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
        sc.close(); */



        //calificacion de una nota
        /*
              Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la nota: ");
        double nota = sc.nextDouble();
        if (nota >= 9) {
            System.out.println("Calificación: Excelente");
        } else if (nota >= 7) {
            System.out.println("Calificación: Bien");
        } else if (nota >= 6) {
            System.out.println("Calificación: Aprobado");
        } else {
            System.out.println("Calificación: Reprobado");
        }
        sc.close();   */


        //promedio de n notas
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántas notas quieres ingresar? ");
        double cantidad = sc.nextDouble();
        double suma = 0;
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingresa la nota " + i + ": ");
            double nota = sc.nextDouble();
            suma += nota;
        }
        double promedio = suma / cantidad;
        System.out.println("El promedio de las notas es: " + promedio);
        sc.close(); */



        //promedio de n numeros
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos números quieres promediar? ");
        int cantidad = sc.nextInt();
        double suma = 0;
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            double num = sc.nextDouble();
            suma += num;
        }
        double promedio = suma / cantidad;
        System.out.println("El promedio es: " + promedio);
        sc.close();*/

      // area de un cuadrado
    /* 
         Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el valor de un lado del cuadrado: ");
        double lado = sc.nextDouble();
        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
        sc.close();*/


        //area de un circulo
       /*  Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el radio del círculo: ");
        double radio = sc.nextDouble();
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
        sc.close();*/


        //area de un rectangulo
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la base:");
        double base = sc.nextDouble();
        System.out.print("Ingresa la altura:");
        double altura = sc.nextDouble();
        double area = base * altura;
        System.out.println("El área es: " + area);
        sc.close();

        //nombre y edad
       /*  Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años.");
        sc.close();*/


        //dia de la semana
       /* Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 7 para obtener el nombre del día de la semana: ");
        int dia = sc.nextInt();
        String nombreDia;
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Día inválido";
        }
        System.out.println("El día " + dia + " corresponde a: " + nombreDia); */


        //calculadora
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero 1: ");
        double a = sc.nextDouble();
        System.out.print("operacion(+,-,*,/): ");
        char op = sc.next().charAt(0);
        System.out.print("Numero 2: ");
        double b = sc.nextDouble();
        double resultado;
        switch (op) {
            case '+':
                resultado = a + b;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = a - b;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = a * b;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: indeterminada.");
                }
                break;
            default:
                System.out.println("Operación inválida.");
        }
     */

        //bucle for
        /*
    for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración: " + i);
        }
        

        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Iteración: " + i);
        }
     */

        //module
        /*
    for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Iteración: " + i);
            }
        }
         */

        //tabla de multiplicar
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("de que numero quieres la tabla: ");
        int numero = sc.nextInt();
        System.out.println("\nTabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
            sc.close(); */
        

    // ciclos anidados

    // imprimir un cuadrado de asteriscos
    /*
    for (int fila = 1; fila <= 4; fila++) {
        for (int col = 1; col <= 4; col++) {
            System.out.print("* ");
        }
        System.out.println();
    }  */

    //brak and continue
    /*
    for (int i = 1; i <= 10; i++) {
        if (i == 5)  break;
            System.out.println("i");
        } */

          /*  for (int i = 1; i <= 10; i++) {
               if (i % 2 == 0) continue;
             System.out.println(i);
         } */

            
    // while 
   /* int contador = 1;
    while (contador <= 5) {
        System.out.println("vuelta numero " + contador);
        contador++;
    } */


    // ingreasar edad 
   /* Scanner sc = new Scanner(System.in);
    int edad = -1;
    while (edad < 0 || edad > 120) {
        System.out.print("Ingresa tu edad (0-120): ");
        edad = sc.nextInt();
        if (edad < 0 || edad > 120) {
            System.out.println("Edad inválida. Intenta de nuevo.");
        }
    }
    System.out.println("Edad registrada: " + edad);
    sc.close(); */


    // do while
    /*
    Scanner sc = new Scanner(System.in);
    int opcion;

    do {
        System.out.println("\n=== Menú ===");
        System.out.println("1. saludo");
        System.out.println("2. despedirce");
        System.out.println("3. Salir a beber");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("¡Hola!");
                break;
            case 2:
                System.out.println("¡Chao!");
                break;
            case 3:
                System.out.println("¡Vamos a beber!");
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
    
        }
    } while (opcion != 0);
    sc.close(); */

    // arreglo (array) de enteros llamados notas 
    /*
    int[] notas = new int[5];
    notas[0] = 85;
    notas[1] = 90;
    notas[2] = 78;
    notas[3] = 92;
    notas[4] = 88;

    // declarar y asignar en la misma línea
    int[] edades = { 18, 20, 22, 19, 21 };

    /*acceder a un elemento del arreglo
    System.out.println(notas[0]); 

    // mostrar al usuario desde la posición 1 hasta la 5 las notas que se encuentran en el arreglo para que sea mas entendible para el usuario
   //(int i = 0; i < notas.length; i++) {
    //    System.out.println("Nota " + (i + 1) + ": " + notas[i]);

        for (int i = 0; i < edades.length; i++) {
        System.out.println("Edad " + (i + 1) + ": " + edades[i]);
   }  */
   

        /*
    Scanner sc = new Scanner(System.in);
    System.out.print("Cuantos estudiantes hay?: ");
    int n = sc.nextInt();
    double[] notas = new double[n];
    */
    


    
        }
    
}