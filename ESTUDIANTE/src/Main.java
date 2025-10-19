import javax.swing.*;
import java.util.Scanner;

/*
Cree una clase llamada Estudiante que incluya cuatro variables de instancia: nombre completo (tipo String),
número de matrícula (tipo String), carrera (tipo String) y promedio acumulado (tipo double).
Su clase debe tener un constructor que inicialice las cuatro variables de instancia.
Proporcione un método establecer y un método obtener para cada variable de instancia.
Si el promedio no está entre 0.0 y 10.0, debe establecerse en 0.0.
Además, proporcione un método llamado obtenerEstadoAcademico() que devuelva un String indicando:

"Excelente" si el promedio es >= 9.0
"Sobresaliente" si el promedio es >= 8.0 y < 9.0
"Bueno" si el promedio es >= 7.0 y < 8.0
"Regular" si el promedio es >= 6.0 y < 7.0
"Reprobado" si el promedio es < 6.0

Escriba una aplicación de prueba llamada PruebaEstudiante que cree tres objetos Estudiante con
diferentes promedios y muestre su estado académico.
 */
public class Main {
    public static void main(String[] args) {

        /**Declaración de objetos*/
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();
        Scanner sc = new Scanner(System.in);

        int opcion=0;
        do {
            opcion =Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido al sistema de datos" + "\n" +
                    "Escoja una opción del menu:" + "\n" + "1. Ingresar datos de los alumnos" + "\n" +
                    "2. Ver estado académico" + "\n" + "3. salir"));

            switch (opcion){
                case 1:
                    estudiante1.datosEstudiantes();
                    estudiante2.datosEstudiantes();
                    estudiante3.datosEstudiantes();
                    break;
                case 2:
                    estudiante1.obtenerEstadoAcademico();
                    estudiante2.obtenerEstadoAcademico();
                    estudiante3.obtenerEstadoAcademico();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida, intente de nuevo.");
                    break;
            }
        }while (opcion != 3);


    }
}