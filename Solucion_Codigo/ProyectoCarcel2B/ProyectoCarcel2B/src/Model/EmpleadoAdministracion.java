package Model;

public class EmpleadoAdministracion extends Empleado {

    //ATRIBUTOS
    public int numAdministracion;
    protected String nivelAcademico;
    protected String idiomasHablados;
    protected String habilidadesBlandas;
    protected String certificadosAdicionales;

    public EmpleadoAdministracion(int numAdministracion, String nivelAcademico, String idiomasHablados, String habilidadesBlandas, String certificadosAdicionales, String cargo, int horasTrabajadas, double valorXHora, String telefonoContacto, String fechaContratacion, int aniosTrabajados, String nombreCompleto, String cedula, int edad, String lugarNacimiento, String genero) {
        super(cargo, horasTrabajadas, valorXHora, telefonoContacto, fechaContratacion, aniosTrabajados, nombreCompleto, cedula, edad, lugarNacimiento, genero);
        this.numAdministracion = numAdministracion;
        this.nivelAcademico = nivelAcademico;
        this.idiomasHablados = idiomasHablados;
        this.habilidadesBlandas = habilidadesBlandas;
        this.certificadosAdicionales = certificadosAdicionales;
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

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public String getIdiomasHablados() {
        return idiomasHablados;
    }

    public void setIdiomasHablados(String idiomasHablados) {
        this.idiomasHablados = idiomasHablados;
    }

    public String getHabilidadesBlandas() {
        return habilidadesBlandas;
    }

    public void setHabilidadesBlandas(String habilidadesBlandas) {
        this.habilidadesBlandas = habilidadesBlandas;
    }

    public String getCertificadosAdicionales() {
        return certificadosAdicionales;
    }

    public void setCertificadosAdicionales(String certificadosAdicionales) {
        this.certificadosAdicionales = certificadosAdicionales;
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
        sb.append("NUMERO: ").append(numAdministracion).append("\n");
        sb.append(super.toString());
        sb.append("NIVEL ACADEMICO: ").append(nivelAcademico).append("\n");
        sb.append("IDIOMAS HABLADOS: ").append(idiomasHablados).append("\n");
        sb.append("HABILIDADES BLANDAS: ").append(habilidadesBlandas).append("\n");
        sb.append("CERTIFICADOS ADICIONALES: ").append(certificadosAdicionales);
        return sb.toString();
    }
}
