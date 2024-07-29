package Model;

public class EmpleadoSeguridad extends Empleado {

    //ATRIBUTOS
    public int numSeguridad;
    protected String pabellon;
    protected String tipoLicenciaArma;
    protected String nivelEntrenamiento;
    protected String limitanteFisico;
    protected String equipoProteccion;

    //CONSTRUCTOR
    public EmpleadoSeguridad(int numSeguridad, String pabellon, String tipoLicenciaArma,
            String nivelEntrenamiento, String limitanteFisico,
            String equipoProteccion, String cargo,
            int horasTrabajadas, double valorXHora, String telefonoContacto,
            String fechaContratacion, int aniosTrabajados, String nombreCompleto,
            String cedula, int edad, String lugarNacimiento, String genero) {
        super(cargo, horasTrabajadas, valorXHora, telefonoContacto,
                fechaContratacion, aniosTrabajados, nombreCompleto, cedula, edad,
                lugarNacimiento, genero);
        this.numSeguridad = numSeguridad;
        this.pabellon = pabellon;
        this.tipoLicenciaArma = tipoLicenciaArma;
        this.nivelEntrenamiento = nivelEntrenamiento;
        this.limitanteFisico = limitanteFisico;
        this.equipoProteccion = equipoProteccion;
        calcularSalario();
    }

    @Override
    public void calcularSalario() {
        this.salario = this.valorXHora * this.horasTrabajadas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAniosTrabajados() {
        return aniosTrabajados;
    }

    public void setAniosTrabajados(int aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getPabellon() {
        return pabellon;
    }

    public void setPabellon(String pabellon) {
        this.pabellon = pabellon;
    }

    public String getTipoLicenciaArma() {
        return tipoLicenciaArma;
    }

    public void setTipoLicenciaArma(String tipoLicenciaArma) {
        this.tipoLicenciaArma = tipoLicenciaArma;
    }

    public String getNivelEntrenamiento() {
        return nivelEntrenamiento;
    }

    public void setNivelEntrenamiento(String nivelEntrenamiento) {
        this.nivelEntrenamiento = nivelEntrenamiento;
    }

    public String getLimitanteFisico() {
        return limitanteFisico;
    }

    public void setLimitanteFisico(String limitanteFisico) {
        this.limitanteFisico = limitanteFisico;
    }

    public String getEquipoProteccion() {
        return equipoProteccion;
    }

    public void setEquipoProteccion(String equipoProteccion) {
        this.equipoProteccion = equipoProteccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValorXHora() {
        return valorXHora;
    }

    public void setValorXHora(double valorXHora) {
        this.valorXHora = valorXHora;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NUMERO: ").append(numSeguridad).append("\n");
        sb.append(super.toString());
        sb.append("PABELLON:").append(pabellon).append("\n");
        sb.append("TIPO DE LICENCIA DE ARMA: ").append(tipoLicenciaArma).append("\n");
        sb.append("NIVEL DE ENTRENAMIENTO: ").append(nivelEntrenamiento).append("\n");
        sb.append("LIMITANTE FISICO: ").append(limitanteFisico).append("\n");
        sb.append("EQUIPO DE PROTECCION: ").append(equipoProteccion);
        return sb.toString();
    }

}
