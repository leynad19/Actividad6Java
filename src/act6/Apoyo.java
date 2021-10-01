/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act6;

import java.util.Scanner;

/**
 *
 * @author danyg
 */
public class Apoyo {
    //Variables
    private String nombre;
    private int[]notas = new int[5]; 
    private int promedio;
    private int suma;
    private String calificacion;
    Scanner sc = new Scanner(System.in);
    
    //Pedir nombre del alumno
    public String leoNomb(){       
        System.out.println("Ingrese el nombre del alumno: ");
        setNombre(sc.next());
        return getNombre();        
    }
    //Pedir notas
    public int [] leoNotas(){
        for (int x = 0; x < getNotas().length; x++) {
            System.out.print("Ingrese la calificion "+(x+1)+": ");
            getNotas()[x] = sc.nextInt();
            setSuma(getSuma() + getNotas()[x]); 
        }
        return getNotas();       
    }
    //Calcular promedio
    public int calcularPromedio(int [] notas ){
        for (int x = 0; x < notas.length; x++) {
            promedio = promedio + notas[x]; 
        }
        promedio = promedio/5;
        return promedio;
    }
    
    public String obtenerCalificacion(int promedio){
        
        if(promedio >= 91 && promedio <=100){
            calificacion= "A";
        }else if(promedio >= 81 && promedio <=90){
            calificacion= "B";
        }else if(promedio >= 71 && promedio <=80){
            calificacion= "C";
        }else if(promedio >= 61 && promedio <=70){
            calificacion= "D";
        }else if(promedio >= 51 && promedio <=60){
            calificacion= "E";
        }else{
            calificacion="F";
        }
        return calificacion;
    }
    
    //Imprimir Datos
    public void ImprimirDatos(){
        System.out.println(this.getNombre());
        for (int x = 0; x < getNotas().length; x++) {
            System.out.println("Calificaion "+(x+1)+": " + this.getNotas()[x]);
        }
        System.out.println("Promedio: " + this.getPromedio());
        System.out.println("Calificacion: " + this.getCalificacion());
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the notas
     */
    public int[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(int[] notas) {
        this.setNotas(notas);
    }

    /**
     * @return the promedio
     */
    public int getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    /**
     * @return the suma
     */
    public int getSuma() {
        return suma;
    }

    /**
     * @param suma the suma to set
     */
    public void setSuma(int suma) {
        this.suma = suma;
    }

    /**
     * @return the calificacion
     */
    public String getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
    
}
