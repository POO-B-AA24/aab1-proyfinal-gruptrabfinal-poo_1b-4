package Controller;

import Model.*;
import java.util.ArrayList;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.HashMap;

public class SistemaAdministracionCarcel {
    //ATRIBUTOS
    protected ArrayList<Pabellon> listaPabellones;

    //CONSTRUCTOR
    public SistemaAdministracionCarcel() {
        this.listaPabellones = new ArrayList<>();
        clasificarxPabellonDB();
    }
    //ASIGNAR PABELLON EMPLEADO DE SEGURIDAD
    public String AsignarPabellonEmpSeg(String nivelentrenamiento){
        String Pabellon;
        if(nivelentrenamiento.equalsIgnoreCase("Avanzado")){
            Pabellon = "Inquisicion";
            return Pabellon;
        }else if(nivelentrenamiento.equalsIgnoreCase("Medio")){
            Pabellon = "Sombra";
            return Pabellon;
        }else if(nivelentrenamiento.equalsIgnoreCase("Basico")){
            Pabellon = "Fraternidad";
            return Pabellon;
        }else if(nivelentrenamiento.equalsIgnoreCase("Bajo")){
            Pabellon = "Redencion";
            return Pabellon;
        }
        return "";
    }
    //ELIMINAR
    public boolean eliminarEmp(String cedula){
        if(((new ConeccionDB()).eliminarEmpleadoSeguridad(cedula))||
                ((new ConeccionDB()).eliminarEmpleadoAdministracion(cedula))){
        return true;
    }
        return false;
    }
    public boolean eliminarPPL(String cedula){
        return (new ConeccionDB()).eliminarPPL(cedula);
    }
    //INSERTAR EMPLEADO DE ADMINSTRACION
    public void insertarEmplAdmin(EmpleadoAdministracion emp){
        (new ConeccionDB()).insertarEmpleadoAdministracion(emp);
    }
    //INSERTAR EMPLEADO DE SEGURIDAD
    public void insertarEmplseguridad(EmpleadoSeguridad emp){
        (new ConeccionDB()).insertarEmpleadoSeguridad(emp);
    }
    //INSERTAR PPL
    public void insertarPPL(PPL ppl){
        (new ConeccionDB()).insertarPPL(ppl);
    }
    public boolean verificarCupoPPL(){
        int maximo = 2000;
        if(getLstPPL().size() < maximo){
            return true;
        }else
            return false;
    }
    public String calcularFechaSalida(int pena){
        LocalDate hoy = LocalDate.now();
        int anioActual = hoy.getYear();
        int mesActual = hoy.getMonthValue();
        int diaActual = hoy.getDayOfMonth();
        int anioSalida = anioActual + pena;
        String cadena = diaActual +"/"+mesActual+"/"+anioSalida;
        return cadena;
    }
    public String asignarPabellon(String Clasificacion){
        String Pabellon;
        if(Clasificacion.equalsIgnoreCase("Maxima Peligrosidad")){
            Pabellon = "Inquisicion";
            return Pabellon;
        }else if(Clasificacion.equalsIgnoreCase("Media Peligrosidad")){
            Pabellon = "Sombra";
            return Pabellon;
        }else if(Clasificacion.equalsIgnoreCase("Baja Peligrosidad")){
            Pabellon = "Fraternidad";
            return Pabellon;
        }else if(Clasificacion.equalsIgnoreCase("Peligro Menor")){
            Pabellon = "Redencion";
            return Pabellon;
        }
        return "";
    }
    public String asignarCelda(String Pabellon){
        String Celda;
        if(Pabellon.equalsIgnoreCase("Inquisicion")){
            Celda = "I"+ ((getLstPPL().size()-1700)+1);
            return Celda;
        }else if(Pabellon.equalsIgnoreCase("Sombra")){
            Celda = "S"+ ((getLstPPL().size()-1500)+1);
            return Celda;
        }else if(Pabellon.equalsIgnoreCase("Fraternidad")){
            Celda = "F"+ ((getLstPPL().size()-1400)+1);
            return Celda;
        }else if(Pabellon.equalsIgnoreCase("Redencion")){
            Celda = "R"+ ((getLstPPL().size()-1400)+1);
            return Celda;
        }
        return "";
    }
    public int asignarVisita(String Pabellon){
        int horasVisita;
        if(Pabellon.equalsIgnoreCase("Inquisicion")){
            horasVisita = 1;
            return horasVisita;
        }else if(Pabellon.equalsIgnoreCase("Sombra")){
            horasVisita = 2;
            return horasVisita;
        }else if(Pabellon.equalsIgnoreCase("Fraternidad")){
            horasVisita = 3;
            return horasVisita;
        }else if(Pabellon.equalsIgnoreCase("Redencion")){
            horasVisita = 4;
            return horasVisita;
        }
        return 0;
    }
    //BUSCAR:
    public PPL buscarPPL(String cedula){
        return (new ConeccionDB()).consultarPPL(cedula);
    }
    public Empleado buscarEmpleado(String cedula){
        if((new ConeccionDB()).consultarEmpleadoAdministracion(cedula) != null){
            return (new ConeccionDB()).consultarEmpleadoAdministracion(cedula);
        }
        if((new ConeccionDB()).consultarEmpleadoSeguridad(cedula) != null){
            return (new ConeccionDB()).consultarEmpleadoSeguridad(cedula);
        }
        return null;
    }
    
    //METER A LOS PPL EN SUS RESPECTIVOS PABELLONES
    public void clasificarxPabellonDB() {
        String nombrePabellon;
        //LISTAS DE PPL
        ArrayList<PPL> redencionPPL = new ArrayList<>();
        ArrayList<PPL> fraternidadPPL = new ArrayList<>();
        ArrayList<PPL> sombraPPL = new ArrayList<>();
        ArrayList<PPL> inquisicionPPL = new ArrayList<>();
        
        //LISTAS DE EMPLEADOS DE SEGURIDAD
        ArrayList<EmpleadoSeguridad> redencionSeguridad = new ArrayList<>();
        ArrayList<EmpleadoSeguridad> fraternidadSeguridad = new ArrayList<>();
        ArrayList<EmpleadoSeguridad> sombraSeguridad = new ArrayList<>();
        ArrayList<EmpleadoSeguridad> inquisicionSeguridad = new ArrayList<>();
        
        for (PPL ppl : getLstPPL()) {
            nombrePabellon = ppl.getPabellon();
            switch (nombrePabellon) {
                case "Inquisicion":
                    inquisicionPPL.add(ppl);
                    break;
                case "Sombra":
                    sombraPPL.add(ppl);
                    break;
                case "Fraternidad":
                    fraternidadPPL.add(ppl);
                    break;
                case "Redencion":
                    redencionPPL.add(ppl);
                    break;
            }
        }
        for (EmpleadoSeguridad emp : getLstSeguridad()) {
            nombrePabellon = emp.getPabellon();
            switch (nombrePabellon) {
                case "Inquisicion":
                    inquisicionSeguridad.add(emp);
                    break;
                case "Sombra":
                    sombraSeguridad.add(emp);
                    break;
                case "Fraternidad":
                    fraternidadSeguridad.add(emp);
                    break;
                case "Redencion":
                    redencionSeguridad.add(emp);
                    break;
            }
        }
        Pabellon PabellonRedencion = new Pabellon("Redencion", 
                "Baja Peligrosidad", redencionSeguridad, 
                redencionPPL);
        Pabellon PabellonFraternidad = new Pabellon("Fraternidad", 
                "Baja Peligrosidad", fraternidadSeguridad,
                fraternidadPPL);
        Pabellon PabellonSombra = new Pabellon("Sombra", 
                "Media Peligrosidad", sombraSeguridad,
                sombraPPL);
        Pabellon PabellonInquisicion = new Pabellon("Redencion", 
                "Maxima Peligrosidad", inquisicionSeguridad, 
                inquisicionPPL);
        
        this.listaPabellones.add(PabellonInquisicion); // 0 
        this.listaPabellones.add(PabellonSombra); // 1
        this.listaPabellones.add(PabellonFraternidad); // 2
        this.listaPabellones.add(PabellonRedencion); // 3
    }
    //CAMBIAR NUMEROS DE PPL CUANDO SE MUESTRAN POR PABELLONES
    public ArrayList<PPL> cambiarNumeracionPPL(ArrayList<PPL> listaPPL){
        for (int i = 0; i < listaPPL.size(); i++) {
            listaPPL.get(i).numPPL = (i+1);
        }
        return listaPPL;
    }
    //CAMBIAR NUMEROS DE EMPLEADOS DE SEGURIDAD CUANDO SE MUESTRAN POR PABELLONES
    public ArrayList<EmpleadoSeguridad> cambiarNumeracionSeg(
            ArrayList<EmpleadoSeguridad> listaSeguridad){
        for (int i = 0; i < listaSeguridad.size(); i++) {
            listaSeguridad.get(i).numSeguridad = (i+1);
        }
        return listaSeguridad;
    }
    // CALCULO PROMEDIO DE LAS EDADES DE LOS PRESOS
    public double calcularPromedioEdadesPPL() {
        int sumaEdades = 0;
        for (PPL ppl : getLstPPL()) {
            sumaEdades += ppl.getEdad();
        }
        return (double) sumaEdades / getLstPPL().size();
    }

    // CALCULO PROMEDIO DE LAS EDADES DE LOS EMPLEADOS DE SEGURIDAD
    public double calcularPromedioEdadesSeguridad() {
        int sumaEdades = 0;
        for (EmpleadoSeguridad empleadoSeguridad : getLstSeguridad()) {
            sumaEdades += empleadoSeguridad.getEdad();
        }
        return (double) sumaEdades / getLstSeguridad().size();
    }

    // CALCULO PROMEDIO DE LAS EDADES DE LOS EMPLEADOS ADMINISTRATIVOS
    public double calcularPromedioEdadesAdministracion() {
        int sumaEdades = 0;
        for (EmpleadoAdministracion empleado : getLstAdministracion()) {
            sumaEdades += empleado.getEdad();
        }
        return (double) sumaEdades / getLstAdministracion().size();
    }

    // CALCULO PROMEDIO DE LAS PENAS DE LOS PRESOS
    public double calcularPromPenas() {
        int sumaPenas = 0;
        for (PPL ppl : getLstPPL()) {
            sumaPenas += ppl.getPenaAsignada();
        }
        return (double) sumaPenas / getLstPPL().size();
    }

    // CALCULO PROMEDIO DE LOS ANIOS TRABAJADOS DE LOS EMPLEADOS ADMINISTRATIVOS
    public double calcularPromAniosTrabajadosAdministracion() {
        int sumaAniosTrabajados = 0;
        for (EmpleadoAdministracion empleado : getLstAdministracion()) {
            sumaAniosTrabajados += empleado.getAniosTrabajados();
        }
        return (double) sumaAniosTrabajados / getLstAdministracion().size();
    }

    // CALCULO PROMEDIO DE LOS ANIOS TRABAJADOS DE LOS EMPLEADOS DE SEGURIDAD
    public double calcularPromAniosTrabajadosSeguridad() {
        int sumaAniosTrabajados = 0;
        for (EmpleadoSeguridad empleado : getLstSeguridad()) {
            sumaAniosTrabajados += empleado.getAniosTrabajados();
        }
        return (double) sumaAniosTrabajados / getLstSeguridad().size();
    }

    // CALCULO PROMEDIO DE LAS HORAS TRABAJADAS DE LOS EMPLEADOS DE SEGURIDAD
    public double calcularPromHorasTrabajadosSeguridad() {
        int sumaHorasTrabajados = 0;
        for (EmpleadoSeguridad empleado : getLstSeguridad()) {
            sumaHorasTrabajados += empleado.getHorasTrabajadas();
        }
        return (double) sumaHorasTrabajados / getLstSeguridad().size();
    }

    // CALCULO PROMEDIO DE LAS HORAS TRABAJADAS DE LOS EMPLEADOS DE ADMINISTRATIVOS
    public double calcularPromHorasTrabajadosAdministracion() {
        int sumaHorasTrabajados = 0;
        for (EmpleadoAdministracion empleado : getLstAdministracion()) {
            sumaHorasTrabajados += empleado.getHorasTrabajadas();
        }
        return (double) sumaHorasTrabajados / getLstAdministracion().size();
    }

    // CONTEO DE LOS DELITOS QUE EXISTEN EN LA CARCEL
    public String conteoDelitos() {
        ArrayList<String> delitos = new ArrayList<>();
        StringBuilder s = new StringBuilder("Conteo de Delitos: \n");
        for (PPL ppl : getLstPPL()) {
            delitos.add(ppl.getDelitoCometido());

        }
        HashMap<String, Integer> conteoDelitos = new HashMap<>();
        for (String delito : delitos) {
            conteoDelitos.put(delito, conteoDelitos.getOrDefault(delito, 0) + 1);
        }
        for (String delito : conteoDelitos.keySet()) {
            s.append(delito).append(": ").append(conteoDelitos.get(delito)).append("\n");
        }
        return s.toString();
    }

    // CONTEO DE LOS LUGARES DE NACIMIENTO DE LOS PRESOS
    public String conteoLugaresNacimientoPPL() {
        ArrayList<String> lugaresNacimiento = new ArrayList<>();
        StringBuilder s = new StringBuilder("Lugares de nacimiento: \n");
        for (PPL ppl : getLstPPL()) {
            lugaresNacimiento.add(ppl.getLugarNacimiento());
        }
        HashMap<String, Integer> conteoLugares = new HashMap<>();
        for (String lugar : lugaresNacimiento) {
            conteoLugares.put(lugar, conteoLugares.getOrDefault(lugar, 0) + 1);
        }
        for (String lugar : conteoLugares.keySet()) {
            s.append(lugar).append(": ").append(conteoLugares.get(lugar)).append("\n");
        }
        return s.toString();
    }
    // CONTEO DE LOS LUGARES DE NACIMIENTO DE LOS EMPLEADOS DE SEGURIDAD

    public String conteoLugaresNacimientoSeguridad() {
        ArrayList<String> lugaresNacimiento = new ArrayList<>();
        StringBuilder s = new StringBuilder("Lugares de nacimiento: \n");
        for (EmpleadoSeguridad seguridad : getLstSeguridad()) {
            lugaresNacimiento.add(seguridad.getLugarNacimiento());
        }
        HashMap<String, Integer> conteoLugares = new HashMap<>();
        for (String lugar : lugaresNacimiento) {
            conteoLugares.put(lugar, conteoLugares.getOrDefault(lugar, 0) + 1);
        }
        for (String lugar : conteoLugares.keySet()) {
            s.append(lugar).append(": ").append(conteoLugares.get(lugar)).append("\n");
        }
        return s.toString();
    }
    // CONTEO DE LOS LUGARES DE NACIMIENTO DE LOS EMPLEADOS ADMINISTRATIVOS

    public String conteoLugaresNacimientoAdministracion() {
        ArrayList<String> lugaresNacimiento = new ArrayList<>();
        StringBuilder s = new StringBuilder("Lugares de nacimiento: \n");
        for (EmpleadoAdministracion administracion : getLstAdministracion()) {
            lugaresNacimiento.add(administracion.getLugarNacimiento());
        }
        HashMap<String, Integer> conteoLugares = new HashMap<>();
        for (String lugar : lugaresNacimiento) {
            conteoLugares.put(lugar, conteoLugares.getOrDefault(lugar, 0) + 1);
        }
        for (String lugar : conteoLugares.keySet()) {
            s.append(lugar).append(": ").append(conteoLugares.get(lugar)).append("\n");
        }
        return s.toString();
    }
    // CONTEO DEL NIVEL ACADEMICO DE LOS EMPLEADOS ADMINISTRATIVOS

    public String conteoNivelAcademico() {
        ArrayList<String> nivelesAcademicos = new ArrayList<>();
        StringBuilder s = new StringBuilder("Niveles Academicos: \n");
        for (EmpleadoAdministracion empleado : getLstAdministracion()) {
            nivelesAcademicos.add(empleado.getNivelAcademico());
        }
        HashMap<String, Integer> conteoNivelAcademico = new HashMap<>();
        for (String nivel : nivelesAcademicos) {
            conteoNivelAcademico.put(nivel, conteoNivelAcademico.getOrDefault(nivel, 0) + 1);
        }
        for (String nivel : conteoNivelAcademico.keySet()) {
            s.append(nivel).append(": ").append(conteoNivelAcademico.get(nivel)).append("\n");
        }
        return s.toString();
    }

    // CONTEO DE LOS IDIOMAS HABLADOS DE LOS EMPLEADOS ADMINISTRATIVOS
    public String conteoIdiomas() {
        ArrayList<String> idiomas = new ArrayList<>();
        StringBuilder s = new StringBuilder("Idiomas: \n");
        for (EmpleadoAdministracion empleado : getLstAdministracion()) {
            idiomas.add(empleado.getIdiomasHablados());
        }
        HashMap<String, Integer> conteoIdiomas = new HashMap<>();
        for (String idioma : idiomas) {
            conteoIdiomas.put(idioma, conteoIdiomas.getOrDefault(idioma, 0) + 1);
        }
        for (String idioma : conteoIdiomas.keySet()) {
            s.append(idioma).append(": ").append(conteoIdiomas.get(idioma)).append("\n");
        }
        return s.toString();
    }

    // CONTEO DE LAS HABILIDADAS BLANDAS DE LOS EMPLEADOS ADMINISTRATIVOS
    public String conteoHabilidadesBlandas() {
        ArrayList<String> habilidades = new ArrayList<>();
        StringBuilder s = new StringBuilder("Habilidades Blandas: \n");
        for (EmpleadoAdministracion empleado : getLstAdministracion()) {
            habilidades.add(empleado.getHabilidadesBlandas());
        }
        HashMap<String, Integer> conteoHabilidades = new HashMap<>();
        for (String habilidad : habilidades) {
            conteoHabilidades.put(habilidad, conteoHabilidades.getOrDefault(habilidad, 0) + 1);
        }
        for (String habilidad : conteoHabilidades.keySet()) {
            s.append(habilidad).append(": ").append(conteoHabilidades.get(habilidad)).append("\n");
        }
        return s.toString();
    }

    // CONETO DE LAS CERTIFICACIONES DE LOS EMPLEADOS ADMINISTRATIVOS
    public String conteoCertificacionesAdicionales() {
        ArrayList<String> certificaciones = new ArrayList<>();
        StringBuilder s = new StringBuilder("Certificaciones Adicionales: \n");
        for (EmpleadoAdministracion empleado : getLstAdministracion()) {
            certificaciones.add(empleado.getCertificadosAdicionales());
        }
        HashMap<String, Integer> conteoHabilidades = new HashMap<>();
        for (String certificados : certificaciones) {
            conteoHabilidades.put(certificados, conteoHabilidades.getOrDefault(certificados, 0) + 1);
        }
        for (String certificados : conteoHabilidades.keySet()) {
            s.append(certificados).append(": ").append(conteoHabilidades.get(certificados)).append("\n");
        }
        return s.toString();
    }

    // CONTEO DEL TIPO DE ARMA QUE USAN LOS EMPLEADOS DE SEGURIDAD
    public String conteoTipoArma() {
        ArrayList<String> tipoArma = new ArrayList<>();
        StringBuilder s = new StringBuilder("Tipos de Licencia de Arma: \n");
        for (EmpleadoSeguridad empleado : getLstSeguridad()) {
            tipoArma.add(empleado.getTipoLicenciaArma());
        }
        HashMap<String, Integer> conteoTipoArma = new HashMap<>();
        for (String arma : tipoArma) {
            conteoTipoArma.put(arma, conteoTipoArma.getOrDefault(arma, 0) + 1);
        }
        for (String arma : conteoTipoArma.keySet()) {
            s.append(arma).append(": ").append(conteoTipoArma.get(arma)).append("\n");
        }
        return s.toString();
    }

    // CONTEO DEL NIVEL DE ENTREAMIENTO DE LOS EMPLEADOS DE SEGURIDAD
    public String conteoNivelEntrenamiento() {
        ArrayList<String> nivelEntrenamiento = new ArrayList<>();
        StringBuilder s = new StringBuilder("Niveles de Entrenamiento: \n");
        for (EmpleadoSeguridad empleado : getLstSeguridad()) {
            nivelEntrenamiento.add(empleado.getNivelEntrenamiento());
        }
        HashMap<String, Integer> conteoNivelEntrenamiento = new HashMap<>();
        for (String nivel : nivelEntrenamiento) {
            conteoNivelEntrenamiento.put(nivel, conteoNivelEntrenamiento.getOrDefault(nivel, 0) + 1);
        }
        for (String nivel : conteoNivelEntrenamiento.keySet()) {
            s.append(nivel).append(": ").append(conteoNivelEntrenamiento.get(nivel)).append("\n");
        }
        return s.toString();
    }

    // CONTEO DE LAS LIMITANTES QUE TIENEN LOS EMPLEADOS DE SEGURIDAD
    public String conteoLimitante() {
        ArrayList<String> limitante = new ArrayList<>();
        StringBuilder s = new StringBuilder("Limitante: \n");
        for (EmpleadoSeguridad empleado : getLstSeguridad()) {
            limitante.add(empleado.getLimitanteFisico());
        }
        HashMap<String, Integer> conteoLimitante = new HashMap<>();
        for (String nivel : limitante) {
            conteoLimitante.put(nivel, conteoLimitante.getOrDefault(nivel, 0) + 1);
        }
        for (String nivel : conteoLimitante.keySet()) {
            s.append(nivel).append(": ").append(conteoLimitante.get(nivel)).append("\n");
        }
        return s.toString();
    }

    // CONTEO DEL EQUIPAMIENTO QUE TIENEN LOS EMPLEADOS DE SEGURIDAD
    public String conteoEquipamiento() {
        ArrayList<String> equipamiento = new ArrayList<>();
        StringBuilder s = new StringBuilder("Equipamiento: \n");
        for (EmpleadoSeguridad empleado : getLstSeguridad()) {
            equipamiento.add(empleado.getEquipoProteccion());
        }
        HashMap<String, Integer> conteoEquipamiento = new HashMap<>();
        for (String nivel : equipamiento) {
            conteoEquipamiento.put(nivel, conteoEquipamiento.getOrDefault(nivel, 0) + 1);
        }
        for (String nivel : conteoEquipamiento.keySet()) {
            s.append(nivel).append(": ").append(conteoEquipamiento.get(nivel)).append("\n");
        }
        return s.toString();
    }
    public ArrayList<Pabellon> getListaPabellones() {
        return listaPabellones;
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
