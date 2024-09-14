import java.util.Random;
import java.util.Scanner;

public class desafioBanco {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = "Tony Stark";
        String tipoCuenta ="Corriente";
        int opcion = 0;
        double saldo = 1599.99;

        System.out.println("************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo disponible: " + saldo + "$");
        System.out.println("************************************");


            while (opcion != 4) {
            // Menú de opciones
            System.out.println("Por favor seleccione una opción:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");

            // Leer la opción seleccionada
            opcion = teclado.nextInt();

                // Procesar la opción seleccionada
                switch (opcion) {
                    case 1:
                        System.out.println("Tu saldo es: " + saldo + "$");
                        break;
                    case 2:
                        System.out.print("Ingrese la cantidad a depositar: ");
                        double deposito = teclado.nextDouble();
                        saldo += deposito;
                        System.out.println("Depósito realizado. Tu nuevo saldo es: " + saldo + "$");
                        break;
                    case 3:
                        System.out.print("Ingrese la cantidad a retirar: ");
                        double retiro = teclado.nextDouble();
                        if (retiro > saldo) {
                            System.out.println("Fondos insuficientes.");
                        } else {
                            saldo -= retiro;
                            System.out.println("Retiro realizado. Tu nuevo saldo es: " + saldo + "$");
                        }
                        break;
                    case 4:
                        System.out.println("Gracias por usar nuestros servicios. ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Intenta de nuevo.");
                        break;
                }
            }
        }
    }
