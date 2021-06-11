/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;
import paquete2.Prestamo;
import paquete1.Persona;
/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {
    
   private String niveles;
    private String centroEducativo;
   
    private double valorCarrera;
    private double valorMensual; 
   
    public  PrestamoEducativo(Persona bene, int mes, String ciu, String nivel,
            String centro, double valCarr) {
    
        super(bene, mes, ciu);
    establecerCiudad(ciu);
        niveles = nivel;
        centroEducativo = centro;
        valorCarrera = valCarr;
    
    }
     @Override
    public void establecerCiudad(String n) {
        ciudad = n.toUpperCase();
    }
    
    public void establecerNiveles(String n) {
       niveles = n;
    }

    public void establecerCentroEducativo(String n) {
        centroEducativo = n;
    }

    public void establecerValorCarrera(double  n) {
       valorCarrera = n;
    }

    public void calcularValorMensual() {
       valorMensual = (valorCarrera / tiempoPrestamo)
                - (0.1 * (valorCarrera / tiempoPrestamo));
    }
    
    
    
    
    
    public String obtenerNiveles() {
        return niveles;
    }

    public String obtenerCentroEducativo() {
        return centroEducativo;
    }
     public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensual() {
        return valorMensual;  
    }
    
    
  @Override
    public String toString() {
        String cadenaFinal = String.format("%s", super.toString());

        cadenaFinal = String.format("%s\n"
                + "Nivel de estudio: %s\n"
                + "Nombre de centro educativo: %s\n"
                + "Valor de la carrera: %2.f\n"
                + "Valor mensual del pago del préstamo del "
                + "valor de la carrera: %2.f\n",
                obtenerNiveles(),
                obtenerCentroEducativo(),
                obtenerValorCarrera(),
                obtenerValorMensual());

        return cadenaFinal;
    } 
   
}
