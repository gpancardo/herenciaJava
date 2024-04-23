/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esou.alumno;
import java.util.*;

/**
 *
 * @author german
 */
public class AlumnoSexto implements Alumno{
    private static Scanner entrada=new Scanner(System.in);
    public String area;
    public String nombre;
    public String numero_cuenta;
    public String codigoArea=numero_cuenta+area;
    public void cambiarArea(){
        System.out.println("Cambiar área: ");
        area=entrada.nextLine();
    }
}
