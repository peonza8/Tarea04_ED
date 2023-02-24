package cuentas;

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() {
    }

    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getTipoInteres() {
        return tipoInterés;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInterés = tipoInteres;
    }

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    public void operativa_cuenta(float cantidad) {
    double saldoActual;

    saldoActual = getSaldo();
    System.out.println("El saldo actual es " + saldoActual);

    try {
        retirar(cantidad);
    } catch (Exception e) {
        System.out.print("Fallo al retirar");
    }

    try {
        System.out.println("Ingreso en cuenta");
        ingresar(cantidad);
    } catch (Exception e) {
        System.out.print("Fallo al ingresar");
    }
}

}

