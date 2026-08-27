import java.util.Scanner;
public class App {
    public static void main(String[] args) {

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
    

    }
}
    