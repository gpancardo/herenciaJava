/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esou.alumno;

/**
 *
 * @author german
 */
public class Egresado extends AlumnoSexto{
    public boolean es_egresado =true;
    public String esTitulado=nombre;
    public void emitirTitulo(){
        esTitulado=nombre+" está titulado por"+ESCUELA;
    }
}
