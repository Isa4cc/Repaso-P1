import javax.swing.*;

public class CuentaBancaria {
    /**Declaración de atributos de la clase*/
    private String numeroCuenta;
    private String nombreTitular;
    private Double saldoCuenta;
    private String tipodeCuenta;

    /**Declaración de constructores*/
    public CuentaBancaria() {
        this.saldoCuenta = 0.0;
    }

    public CuentaBancaria(String numeroCuenta, String nombreTitular, Double saldoCuenta, String tipodeCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldoCuenta = saldoCuenta;
        this.tipodeCuenta = tipodeCuenta;
    }

    /**Generación de los métodos get & set de Java*/
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public Double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(Double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public String getTipodeCuenta() {
        return tipodeCuenta;
    }

    public void setTipodeCuenta(String tipodeCuenta) {
        this.tipodeCuenta = tipodeCuenta;
    }

    /**Desarrollo de métodos propios del programador*/

    //Obtener los datos
    public void obenerDatosdeCliente(){
        this.setNombreTitular(JOptionPane.showInputDialog(null, "Ingrese el nombre del titular:"));
        this.setNumeroCuenta(JOptionPane.showInputDialog(null, "Ingrese el número de la cuenta:"));
        this.setTipodeCuenta(JOptionPane.showInputDialog(null, "Ingrese el tipo de cuenta (Ahorros/Corriente):"));
        this.setSaldoCuenta(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el saldo de la cuenta")));
    }

    /*depositar(double monto): que añada el monto al saldo. Si el monto no es positivo,
    no debe realizar ninguna operación.*/
    public double deposito(double cantidad){
        if (cantidad <= 0){
            return 0;
        }else{
            double nuevoSaldo = this.saldoCuenta + cantidad;
            this.setSaldoCuenta(nuevoSaldo);
            return cantidad;
        }
    }

    //retirar(double monto): que reste el monto del saldo. Si el monto es mayor al saldo o no es positivo,
    //no debe realizar ninguna operación.
    public double retirarMonto(double cantRetirar){
        if (cantRetirar > this.saldoCuenta){
            JOptionPane.showMessageDialog(null, "Error!, el monto a retirar es mayor que la cantidad de dinero");
            return 0;
        }else{
            double saldoSinRetiro = this.saldoCuenta - cantRetirar;
            this.setSaldoCuenta(saldoSinRetiro);
            return cantRetirar;
        }
    }

    //obtenerSaldo(): que devuelva el saldo actual.
    public double obtenerSaldo(){
        return this.saldoCuenta;
    }
}
