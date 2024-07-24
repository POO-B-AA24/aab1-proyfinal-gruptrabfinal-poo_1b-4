package Controller;

import Model.*;
import java.util.ArrayList;
import java.sql.Connection;

public class SistemaAdministracionCarcel {

    //ATRIBUTOS
    ArrayList<Pabellon> listaPabellones;
    ArrayList<PPL> listaPPL;//ATRIBUTO AUX
    ArrayList<EmpleadoSeguridad> listaseguridad;//ATRIBUTO AUX

    //CONSTRUCTOR

    public SistemaAdministracionCarcel() {
    }
    

    //METODOS
    public void clasificarxPabellonDB() {
        String pabellon;
        ArrayList<PPL> redencion = new ArrayList<>();
        ArrayList<PPL> fraternidad = new ArrayList<>();
        ArrayList<PPL> sombra = new ArrayList<>();
        ArrayList<PPL> inquisicion = new ArrayList<>();
        for (PPL ppl : this.listaPPL) {
            pabellon = ppl.pabellon;
            switch (pabellon) {
                case "Inquisicion":
                    inquisicion.add(ppl);
                    break;
                case "Sombra":
                    sombra.add(ppl);
                    break;
                case "Fraternidad":
                    fraternidad.add(ppl);
                    break;
                case "Redencion":
                    redencion.add(ppl);
                    break;
            }
        }
        Pabellon PabellonRedencion = new Pabellon("Redencion", 
                "Baja Peligrosidad", redencion);
        Pabellon PabellonFraternidad = new Pabellon("Redencion", 
                "Baja Peligrosidad", fraternidad);
        Pabellon PabellonSombra = new Pabellon("Redencion", 
                "Media Peligrosidad", sombra);
        Pabellon PabellonInquisicion = new Pabellon("Redencion", 
                "Maxima Peligrosidad", inquisicion);
    }

    public ArrayList<PPL> getLstPPL() {
        return (new ConeccionDB()).getListaPPL();
    }
    public ArrayList<EmpleadoSeguridad> getLstSeguridad() {
        return (new ConeccionDB()).getListaEmpleadosSeguridad();
    }
    public ArrayList<EmpleadoAdministracion> getLstAdministracion() {
        return (new ConeccionDB()).getListaEmpleadosAdministracion();
    }
}
