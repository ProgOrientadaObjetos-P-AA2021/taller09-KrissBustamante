/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;
import paquete1.Persona;
import paquete2.Prestamo;
/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo{
    private String tipo;
    private String marca;
    private Persona garante1;
    private double valorAuto;
    private double valorMensual;
    
    
    public  PrestamoAutomovil(Persona bene, int mes, String ciu, String tip,
            String mar, Persona gar, double valAut) {
    
        super(bene, mes, ciu);
        establecerCiudad(ciu);
        tipo = tip;
        marca = mar;
        garante1 = gar;
        valorAuto = valAut;
    
    }
    @Override
    public void establecerCiudad(String n) {
        ciudad = n.toLowerCase();
    }
    public void establecerTipo(String n) {
       tipo = n;
    }

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerGarante1(Persona n) {
        garante1 = n;
    }

    public void establecerValorAuto(double  n) {
       valorAuto = n;
    }

    public void calcularValorMensual() {
        valorMensual = valorAuto / tiempoPrestamo;;
    }
    
    
    
    
    
    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerMarca() {
        return marca;
    }

    public Persona obtenerGarante1() {
        return garante1; 
        
    }
     public double obtenerValorAuto() {
        return valorAuto;
    }

    public double obtenerValorMensual() {
        return valorMensual;  
    }
    
    
  @Override
    public String toString() {
        String cadenaFinal = String.format("%s", super.toString());

        cadenaFinal = String.format("%s\n"
                + "Tipo de auto: %s\n"
                + "Marca del auto: %s\n"
                + "Garante 1: %s\n"
                + "Costo del auto: %2.f\n"
                + "Valor mensual de prestamo automovil: %2.f\n",
                obtenerTipo(),
                obtenerMarca(),
                obtenerBeneficiario(),
                obtenerValorAuto(),
                obtenerValorMensual());

        return cadenaFinal;
    } 
  
}
