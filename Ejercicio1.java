import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            Scanner entradaString = new Scanner(System.in);
            Scanner entradaChar = new Scanner(System.in); 

            String nombre ="";
            int edad=0;
            int dni=0;
            char letra =' ';
String apellidos = "";
            System.out.println("Introduce tu edad");
            try {
                edad = entrada.nextInt();
            }catch(InputMismatchException ex){
                ex.printStackTrace();
                System.out.println(ex.getMessage());
            }finally {
                System.out.println("El valor es "+ edad);
            }

            System.out.println("Intruduce tu nombre");
            try{
            nombre  = entradaString.nextLine();
            }catch(InputMismatchException ex) {
                ex.printStackTrace();
                System.out.println(ex.getMessage());
            }finally {
                System.out.println("El valor es: "+ nombre);
            }

            System.out.println("Introduce tus apellidos");
            try {
                apellidos = entradaString.nextLine();
            }catch (InputMismatchException ex){
                ex.printStackTrace();
                System.out.println(ex.getMessage());
            }finally {
                System.out.println("El valor es: "+ apellidos);
            }

            System.out.println("Introduce el número de tu DNI");
            try {
                dni = entrada.nextInt();
            }catch(InputMismatchException ex){
                ex.printStackTrace();
                System.out.println(ex.getMessage());
            }finally {
                System.out.println("El valor es "+ dni);
            }

            System.out.println("Introduce la letra de tu DNI");
            try{
                letra = entradaChar.next().charAt(0);
            }catch (InputMismatchException ex){
                ex.printStackTrace();
                System.out.println(ex.getMessage());
            }finally {
                System.out.println("El valor es "+ letra);
            }

            System.out.println("Tienes "+edad+" años" + " Tu nombres es: "+nombre+" "+apellidos+" tu DNI es: "+dni + letra);

        }
}