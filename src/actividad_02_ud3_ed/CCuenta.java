/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;



/**
 * 
 * @author Ana González Jorge 1DAW-2122
 */
public class CCuenta {
  
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  /**
   * Constructor sin parámetros
   */
    public CCuenta ()
    {
    }
  /**
   * 
   * @param nom Nombre del titular
   * @param cue número de cuenta
   * @param sal Saldo en cuenta
   * @param tipo Tipo de cuenta
   */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   * 
   * @param nom Nombre del titular
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
  /**
   * 
   * @return Devuelve el nombre del titular
   */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
     * 
     * @return Devuelve el saldo de la cuenta
     */
     public double estado ()
    {
        return saldo;
    }

    /**
     * 
     * @param cantidad Cantidad a ingresar
     * @throws Exception Control de error al ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

   /**
    * 
    * @param cantidad Cantidad solicitada para retirar
    * @throws Exception control de error al retirar una cantidad negativa
    * @throws Exception control de error al retirar una cantidad mayor al saldo dsiponible
    */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    /**
     * 
     * @return Devuelve el número de cuenta
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
   * 
   * @param cuenta Establece el número de cuenta
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * 
   * @param saldo Establece el saldo indicado por el parámetro saldo
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 /**
  * 
  * @return Devuelve el tipo de interés
  */
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
   * 
   * @param tipoInterés Establece el tipo de interés
   */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
