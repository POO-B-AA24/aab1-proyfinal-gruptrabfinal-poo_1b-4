package Model;
public class PPL extends Persona{
    //ATRIBUTOS
    public int numPPL;
    protected String alias;
    protected String clasificacion;
    protected String celda;
    protected String pabellon;
    protected String fechaIngreso;
    protected String fechaSalida;
    protected int penaAsignada;
    protected int aniosRestantes;
    protected String delitoCometido;
    protected int visitasSemanales;
    
    //CONSTRUCTOR
    public PPL(int numPPL,String nombreCompleto, String cedula, int edad, 
            String lugarNacimiento, String genero, String alias, 
            String clasificacion, String celda, String pabellon, 
            String fechaIngreso, String fechaSalida, int penaAsignada, 
            int aniosRestantes, String delitoCometido, int visitasSemanales) {
        super(nombreCompleto, cedula, edad, lugarNacimiento, genero);
        this.numPPL = numPPL;
        this.alias = alias;
        this.clasificacion = clasificacion;
        this.celda = celda;
        this.pabellon = pabellon;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.penaAsignada = penaAsignada;
        this.aniosRestantes = aniosRestantes;
        this.delitoCometido = delitoCometido;
        this.visitasSemanales = visitasSemanales;
    }

    public String getPabellon() {
        return pabellon;
    }

    public void setPabellon(String pabellon) {
        this.pabellon = pabellon;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPenaAsignada() {
        return penaAsignada;
    }

    public void setPenaAsignada(int penaAsignada) {
        this.penaAsignada = penaAsignada;
    }

    public String getDelitoCometido() {
        return delitoCometido;
    }

    public void setDelitoCometido(String delitoCometido) {
        this.delitoCometido = delitoCometido;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getCelda() {
        return celda;
    }

    public void setCelda(String celda) {
        this.celda = celda;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getAniosRestantes() {
        return aniosRestantes;
    }

    public void setAniosRestantes(int aniosRestantes) {
        this.aniosRestantes = aniosRestantes;
    }

    public int getVisitasSemanales() {
        return visitasSemanales;
    }

    public void setVisitasSemanales(int visitasSemanales) {
        this.visitasSemanales = visitasSemanales;
    }
   
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NUMERO: ").append(numPPL).append("\n");
        sb.append(super.toString());
        sb.append("ALIAS: ").append(alias).append("\n");
        sb.append("CLASIFICACION: ").append(clasificacion).append("\n");
        sb.append("CELDA: ").append(celda).append("\n");
        sb.append("PABELLON: ").append(pabellon).append("\n");
        sb.append("FECHA DE INGRESO: ").append(fechaIngreso).append("\n");
        sb.append("FECHA DE SALIDA: ").append(fechaSalida).append("\n");
        sb.append("PENA ASIGNADA: ").append(penaAsignada).append("\n");
        sb.append("ANIOS RESTANTES: ").append(aniosRestantes).append("\n");
        sb.append("DELITO COMETIDO: ").append(delitoCometido).append("\n");
        sb.append("VISITAS SEMANALES (HORAS): ").append(visitasSemanales);
        return sb.toString();
    }
       
}