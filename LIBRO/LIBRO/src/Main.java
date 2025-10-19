import javax.swing.*;
import java.util.Scanner;

/*Cree una clase llamada Libro que una biblioteca podría utilizar para gestionar su inventario.
Un Libro debe incluir cinco variables de instancia: código ISBN (tipo String), título (tipo String),
autor (tipo String), número de páginas (tipo int) y precio (tipo double).
Su clase debe tener un constructor que inicialice las cinco variables de instancia.
Proporcione un método establecer y un método obtener para cada variable de instancia.
Si el número de páginas no es positivo, debe establecerse en 0. Si el precio no es positivo,
debe establecerse en 0.0. Proporcione un método llamado aplicarDescuento(double porcentaje)
que reduzca el precio del libro según el porcentaje proporcionado (por ejemplo, 15 para un 15% de descuento).
Si el porcentaje no está entre 0 y 100, no debe aplicar ningún descuento.
Escriba una aplicación de prueba llamada PruebaLibro que demuestre las capacidades de la clase Libro, incluyendo
la aplicación de descuentos.*/
public class Main {
    public static void main(String[] args) {
        Libro lib1 = new Libro();
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("====SISTEMA DE GESTION DE LIBROS====");
            System.out.println("1. Ingresar libro");
            System.out.println("2. Aplicar descuento");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    String titulo = JOptionPane.showInputDialog(null,
                            "Ingrese el título del libro");
                    lib1.setTitulo(titulo);
                    String autor= JOptionPane.showInputDialog(null,
                            "Ingrese el nombre del autor del libro");
                    lib1.setAutor(autor);
                    String isbn = JOptionPane.showInputDialog(null,
                            "Ingrese el ISBN del libro");
                    lib1.setISBN(isbn);
                    int nropag = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Ingrese el número de páginas (nro. entero)"));
                    lib1.setNroPaginas(nropag);
                    double precio = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Ingrese el precio del libro"));
                    lib1.setPrecio(precio);
                    break;
                case 2:
                    //variable de parámetro
                    double porcentaje = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Ingrese el descuento"));
                    if (porcentaje > 0 || porcentaje <= 100){
                        double descuento =  lib1.aplicarDescuento(porcentaje);
                        double total = lib1.getPrecio() - descuento;
                        JOptionPane.showMessageDialog(null,
                                "Descuento realizado con éxito" + "\n" +
                                        "Libro: " + lib1.getTitulo() + "\n" +
                                        "Autor: " + lib1.getAutor() + "\n" +
                                        "Precio sin descuento: $" + lib1.getPrecio() + "\n" +
                                        "Precio final: $" + total);
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida, intente de nuevo");
                    break;
            }

        }while (opcion != 3);
    }
}