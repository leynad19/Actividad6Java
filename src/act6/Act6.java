/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act6;

/**
 *
 * @author danyg
 */
public class Act6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre;
        int [] notas = new int[5];
        int promedio;
        
        Apoyo apoyo = new Apoyo();
        apoyo.leoNomb();
        notas = apoyo.leoNotas();
        promedio = apoyo.calcularPromedio(notas);
        apoyo.obtenerCalificacion(promedio);
        apoyo.ImprimirDatos();
    }
    
}
