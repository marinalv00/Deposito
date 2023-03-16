/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
// Comentario prueba
package cuentas;


/**
 * Esta clase crea objetos tipo cuenta, permitiendo gestionar atributos como 
 * su saldo o tipo de interés (además del nombre y número de cuenta).
 * @author Marina
 * @version 1.2
 * @since 1.0
 */

public class CCuenta {

    // Atributos
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Método constructod de CCuenta
     */
    public CCuenta()
    {
    }

    /**
     * Método constructor que inicializa el objeto con los parámetros:
     * @param nom nombre
     * @param cue cuenta
     * @param sal saldo
     * @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método que asígna un nombre que se dá como parámetro, mediante llamada al 
     * método set correspondiente
     * @param nom nombre
     * @see cuentas.CCuenta#setNombre(java.lang.String) 
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     * Método para obtener el nombre, mediante llamada al método get correspondiente
     * @return nombre
     * @see cuentas.CCuenta#getNombre() 
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método que consulta el estado de la cuenta, mediante llamada al método 
     * get del atributo saldo
     * @return saldo
     * @see cuentas.CCuenta#getSaldo() 
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Médoto para incrementar el saldo, con la cantidad introducida, llamando al
     * método correspondiente para obtener el saldo
     * @param cantidad a incrementar el saldo
     * @throws Exception si la cantidad introducida es negativa, lanza un mensaje
     * @see cuentas.CCuenta#getSaldo() 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para decrecer el saldo, con la cantidad introducida, llamando al
     * método correspondiente para obtener el saldo.
     * @param cantidad a restar al saldo
     * @throws Exception si la cantidad es negativa o si es mayor al saldo
     * @see cuentas.CCuenta#getSaldo() 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método obtener el número de cuenta, llamando al método get de cuenta.
     * @return número de cuenta.
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     * Método get del nombre asociado a al cuenta
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set para el nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método get del atributo tipo de interés
     * @return tipo de interes
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método set para el tipo de interés
     * @param tipoInterés 
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    /**
     * Método set para el número de cuenta.
     * @param cuenta cuenta a asignar
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método get para el saldo
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para asignar el saldo
     * @param saldo saldo a asignar
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     * Método para obtener la cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }
}
