import javax.swing.*;

public class Estudiante {
    /**Declaración de atributos de la clase*/
    private String nombreCompleto;
    private String numeroMatricula;
    private Double promedioAcumulado;

    /**Constructores, vacío y con atributos*/
    public Estudiante() {
        setPromedioAcumulado(promedioAcumulado);
    }

    public Estudiante(String nombreCompleto, String numeroMatricula, Double promedioAcumulado) {
        this.nombreCompleto = nombreCompleto;
        this.numeroMatricula = numeroMatricula;
        this.promedioAcumulado = promedioAcumulado;
    }

    /**Get & Set*/
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public Double getPromedioAcumulado() {
        return promedioAcumulado;
    }

    public void setPromedioAcumulado(Double promedioAcumulado) {
        this.promedioAcumulado = promedioAcumulado;
    }

    /**Métodos de programador*/
    public void datosEstudiantes(){
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del alumno:");
        this.setNombreCompleto(nombre);

        String matricula = JOptionPane.showInputDialog(null,
                "Ingrese el número de matrícula del alumno " + this.nombreCompleto);
        this.setNumeroMatricula(matricula);

        Double promedio = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Ingrese el promedio del alumno " + this.nombreCompleto));
        this.setPromedioAcumulado(promedio);
    }
    
    public void obtenerEstadoAcademico(){
        double estado=this.getPromedioAcumulado();
        if (estado>= 9.0){
            JOptionPane.showMessageDialog(null, 
                    "Estado académico de: " + this.getNombreCompleto() + "\n" + 
                    "Promedio acumulado: " + this.getPromedioAcumulado() + "/10" + "\n" +
                    "Estado: Excelente");
        }
        if ((estado>=8.0) && (estado < 9.0)) {
            JOptionPane.showMessageDialog(null,
                    "Estado académico de: " + this.getNombreCompleto() + "\n" +
                            "Promedio acumulado: " + this.getPromedioAcumulado() + "/10" + "\n" +
                            "Estado: Sobresaliente");
        }
        if ((estado>=7.0) && (estado < 8.0)) {
            JOptionPane.showMessageDialog(null,
                    "Estado académico de: " + this.getNombreCompleto() + "\n" +
                            "Promedio acumulado: " + this.getPromedioAcumulado() + "/10" + "\n" +
                            "Estado: Bueno");
        }
        if ((estado>=6.0) && (estado < 7.0)) {
            JOptionPane.showMessageDialog(null,
                    "Estado académico de: " + this.getNombreCompleto() + "\n" +
                            "Promedio acumulado: " + this.getPromedioAcumulado() + "/10" + "\n" +
                            "Estado: Regular");
        }
        if (estado < 6.0) {
            JOptionPane.showMessageDialog(null,
                    "Estado académico de: " + this.getNombreCompleto() + "\n" +
                            "Promedio acumulado: " + this.getPromedioAcumulado() + "/10" + "\n" +
                            "Estado: Reprobado");
        }
    }
}
