import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
Cree una clase llamada CuentaBancaria que un banco podría utilizar para gestionar las cuentas de sus clientes.
Una CuentaBancaria debe incluir cuatro variables de instancia: número de cuenta (tipo String), nombre del titular
(tipo String), saldo actual (tipo double) y tipo de cuenta (tipo String - puede ser "Ahorro" o "Corriente").
Su clase debe tener un constructor que inicialice las cuatro variables de instancia.
Proporcione un método establecer y un método obtener para cada variable de instancia.
Además, proporcione dos métodos:

depositar(double monto): que añada el monto al saldo. Si el monto no es positivo,
no debe realizar ninguna operación.
retirar(double monto): que reste el monto del saldo. Si el monto es mayor al saldo o no es positivo,
no debe realizar ninguna operación.
obtenerSaldo(): que devuelva el saldo actual.

Escriba una aplicación de prueba llamada PruebaCuentaBancaria que demuestre las capacidades de la
clase CuentaBancaria, realizando varios depósitos y retiros.
**/
public class Main {
    public static void main(String[] args) {
        /**Declaración de objetos*/
        CuentaBancaria cuenta1 = new CuentaBancaria();
        Scanner sc = new Scanner(System.in);

        /**Obtención de datos*/
        int opcion =0;
        do {
            System.out.println("====Banco Digital====");
            System.out.println("Bienvenido, escoja una de las siguientes opciones:");
            System.out.println("1. Ingresar datos del cliente");
            System.out.println("2. Depósitos");
            System.out.println("3. Retiros");
            System.out.println("4. Salir");
            System.out.print(">> ");
            opcion= sc.nextInt();
            System.out.println();
            switch (opcion){
                case 1:
                    cuenta1.obenerDatosdeCliente();
                    break;

                case 2:
                    double cantidadDeposito = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Por favor ingrese el monto a depositar:"));
                    cuenta1.deposito(cantidadDeposito);
                    JOptionPane.showMessageDialog(null, "Monto depositado con éxito:" + "\n" +
                            "Nuevo saldo: " + cuenta1.getSaldoCuenta() + "$");
                    break;

                case 3:
                    Double cantRetiros = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Ingrese el monto a retirar"));
                    cuenta1.retirarMonto(cantRetiros);
                    JOptionPane.showMessageDialog(null, "Monto retirado con éxito:" + "\n" +
                            "Nuevo Saldo: " + cuenta1.getSaldoCuenta() + "$");
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Error, opción inválida");
            }
        }while(opcion != 4);


    }
}