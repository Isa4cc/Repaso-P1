import javax.swing.*;

public class Rectangulo {
    private Double largo;
    private Double ancho;

    public Rectangulo() {
    }
    public Rectangulo(Double largo, Double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        if(largo > 0.0 && largo < 20.0){
            this.largo = largo;
        }else {
            this.largo = 1.0;
        }
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        if(ancho > 0.0 && ancho < 20.0){
            this.ancho = ancho;
        }else {
            this.ancho = 1.0;
        }
    }

    public double calcularPerimetro(){
        return (2 * this.largo) + (2 * this.ancho);
    }

    public double calcularArea(){
        return (this.largo * this.ancho);
    }

    public int esCuadrado(){
        if (ancho.equals(largo)){
            return 1;
        }else {
            return 0;
        }
    }
}
