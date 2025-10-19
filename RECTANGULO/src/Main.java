import javax.swing.*;

/*
Cree una clase llamada Rectangulo que incluya dos variables de instancia:
longitud (tipo double) y ancho (tipo double). Su clase debe tener un constructor que inicialice
las dos variables de instancia con el valor 1.0 por defecto.
Proporcione un método establecer y un método obtener para cada variable de instancia.
Los métodos establecer deben verificar que la longitud y el ancho sean mayores que 0.0 y
menores que 20.0. Si no lo son, deben establecerse en 1.0.
Proporcione métodos que calculen:

calcularPerimetro(): que devuelva el perímetro del rectángulo (2 × longitud + 2 × ancho)
calcularArea(): que devuelva el área del rectángulo (longitud × ancho)
esCuadrado(): que devuelva true si el rectángulo es un cuadrado (longitud == ancho)

Escriba una aplicación de prueba llamada PruebaRectangulo que demuestre las capacidades de la clase Rectangulo.
 */
public class Main {
    public static void main(String[] args) {
        Rectangulo rec1 = new Rectangulo();

        JOptionPane.showMessageDialog(null, "Calculadora de cuadrados/rectángulos");
        double lado = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Ingrese el largo de la figura"));
        rec1.setLargo(lado);
        double ancho = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Ingrese el ancho de la figura"));
        rec1.setAncho(ancho);
        double area = rec1.calcularArea();
        double peri = rec1.calcularPerimetro();
        int figura = rec1.esCuadrado();
        if (figura == 1){
            JOptionPane.showMessageDialog(null,
                    "Características:" + "\n" +
                    "Figura: cuadrado" + "\n" +
                    "Área: " + area + "\n" +
                    "Perímetro: " + peri);
        }else {
            JOptionPane.showMessageDialog(null,
                    "Características:" + "\n" +
                            "Figura: rectángulo" + "\n" +
                            "Área: " + area + "\n" +
                            "Perímetro: " + peri);
        }
    }
}