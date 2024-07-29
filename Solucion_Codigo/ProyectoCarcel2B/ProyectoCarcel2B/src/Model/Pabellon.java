package Model;
import java.util.ArrayList;
public class Pabellon {
    //ATRIBUTOS
    protected String nombre;
    protected String clasificacion;
    protected ArrayList<EmpleadoSeguridad> listaEmpleadoSeguridad;
    protected ArrayList<PPL> listaPPL;
    
    //CONSTRUCTOR
    public Pabellon(String nombre, String clasificacion, ArrayList<EmpleadoSeguridad> listaEmpleadoSeguridad, ArrayList<PPL> listaPPL) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.listaEmpleadoSeguridad = listaEmpleadoSeguridad;
        this.listaPPL = listaPPL;
    }

    public ArrayList<PPL> getListaPPL() {
        return listaPPL;
    }

    public void setListaPPL(ArrayList<PPL> listaPPL) {
        this.listaPPL = listaPPL;
    }

    public ArrayList<EmpleadoSeguridad> getListaEmpleadoSeguridad() {
        return listaEmpleadoSeguridad;
    }

    public void setListaEmpleadoSeguridad(ArrayList<EmpleadoSeguridad> listaEmpleadoSeguridad) {
        this.listaEmpleadoSeguridad = listaEmpleadoSeguridad;
    }
    
}
