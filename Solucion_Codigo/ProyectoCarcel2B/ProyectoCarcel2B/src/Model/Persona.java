package Model;
public abstract class Persona {
    //ATRIBUTOS
    protected String nombreCompleto;
    protected String cedula;
    protected int edad;
    protected String lugarNacimiento;
    protected String genero;
    
    //CONSTRUCTOR
    public Persona(String nombreCompleto, String cedula, int edad, String lugarNacimiento, String genero) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.edad = edad;
        this.lugarNacimiento = lugarNacimiento;
        this.genero = genero;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NOMBRE COMPLETO: ").append(nombreCompleto).append("\n");
        sb.append("CEDULA: ").append(cedula).append("\n");
        sb.append("EDAD: ").append(edad).append("\n");
        sb.append("LUGAR DE NACIMIENTO: ").append(lugarNacimiento).append("\n");
        sb.append("GENERO: ").append(genero).append("\n");
        return sb.toString();
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
