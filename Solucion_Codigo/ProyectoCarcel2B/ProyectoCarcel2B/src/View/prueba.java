/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import java.util.ArrayList;
import Controller.SistemaAdministracionCarcel;
import Model.EmpleadoSeguridad;
import Model.EmpleadoAdministracion;

/**
 *
 * @author ricar
 */
public class prueba {
    public static void main(String[] args) {
        SistemaAdministracionCarcel sistema = new SistemaAdministracionCarcel();
        for(EmpleadoAdministracion emp : sistema.getLstAdministracion()){
            System.out.println(emp);
        }
    }
}
