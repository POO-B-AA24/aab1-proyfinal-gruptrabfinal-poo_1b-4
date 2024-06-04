package Controller;

import java.time.LocalDate;
import java.util.Random;

public class Carcel {

    // ATRIBUTOS
    private PPL[] listaPPLCompleta;

    // CONSTRUCTOR
    public Carcel(PPL[] listaPPLCompleta) {
        this.listaPPLCompleta = listaPPLCompleta;
    }

    //ASIGNAR CLASIFICACION SEGUN EL DELITO
    public void asignarClasificacion() {
        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Narcotrafico")) {
                this.listaPPLCompleta[i].setClasificacion("Alto");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Homicidio")) {
                this.listaPPLCompleta[i].setClasificacion("Alto");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Robo")) {
                this.listaPPLCompleta[i].setClasificacion("Medio");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Hurto")) {
                this.listaPPLCompleta[i].setClasificacion("Medio");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Fraude")) {
                this.listaPPLCompleta[i].setClasificacion("Medio");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Evasion")) {
                this.listaPPLCompleta[i].setClasificacion("Medio");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Invasion")) {
                this.listaPPLCompleta[i].setClasificacion("Bajo");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Amenazas")) {
                this.listaPPLCompleta[i].setClasificacion("Bajo");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Estafa")) {
                this.listaPPLCompleta[i].setClasificacion("Bajo");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Otros")) {
                this.listaPPLCompleta[i].setClasificacion("Bajo");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Invasion")) {
                this.listaPPLCompleta[i].setClasificacion("Bajo");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Amenazas")) {
                this.listaPPLCompleta[i].setClasificacion("Bajo");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Estafa")) {
                this.listaPPLCompleta[i].setClasificacion("Bajo");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Otros")) {
                this.listaPPLCompleta[i].setClasificacion("Bajo");
            }
        }
    }

    //ASIGNAR PENAS SEGUN EL DELITO
    public void asignarPena() {
        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Narcotrafico")) {
                this.listaPPLCompleta[i].setPena(80);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Homicidio")) {
                this.listaPPLCompleta[i].setPena(40);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Robo")) {
                this.listaPPLCompleta[i].setPena(20);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Hurto")) {
                this.listaPPLCompleta[i].setPena(15);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Fraude")) {
                this.listaPPLCompleta[i].setPena(15);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Evasion")) {
                this.listaPPLCompleta[i].setPena(10);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Invasion")) {
                this.listaPPLCompleta[i].setPena(10);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Amenazas")) {
                this.listaPPLCompleta[i].setPena(7);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Estafa")) {
                this.listaPPLCompleta[i].setPena(5);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Otros")) {
                this.listaPPLCompleta[i].setPena(2);
            }
        }
    }

    //ASIGNAR PABELLONES SEGUN LA CLASIFICACION
    public void asignarPabellon() {
        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            if (this.listaPPLCompleta[i].getClasificacion().equalsIgnoreCase("Alto")) {
                this.listaPPLCompleta[i].setPabellon("A");
            } else if (this.listaPPLCompleta[i].getClasificacion().equalsIgnoreCase("Medio")) {
                this.listaPPLCompleta[i].setPabellon("M");
            } else if (this.listaPPLCompleta[i].getClasificacion().equalsIgnoreCase("Bajo")) {
                this.listaPPLCompleta[i].setPabellon("B");
            }
        }
    }

    //CALCULAR FECHA DE SALIDA
    public void calcularFechaSalida() {
        String anioIngreso;
        String dia;
        String mes;
        int anioSalida = 0;
        int pena;
        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            dia = this.listaPPLCompleta[i].getFechaIngreso().substring(0, 2);
            mes = this.listaPPLCompleta[i].getFechaIngreso().substring(3, 5);
            anioIngreso = this.listaPPLCompleta[i].getFechaIngreso().substring(6);
            pena = this.listaPPLCompleta[i].getPena();
            anioSalida = Integer.parseInt(anioIngreso) + pena;
            this.listaPPLCompleta[i].setFechaSalida(dia + "/" + mes + "/" + String.valueOf(anioSalida));
        }
    }

    //CALCULAR ANIOS RESTANTES 
    public void calcularAniosRestantes() {
        LocalDate fechaActual = LocalDate.now();
        int anioActual = fechaActual.getYear();

        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            String fechaSalida = this.listaPPLCompleta[i].getFechaSalida();
            int anioSalida = Integer.parseInt(fechaSalida.substring(6));
            this.listaPPLCompleta[i].setAniosRestantes(anioSalida - anioActual);
        }
    }

    //ELIMINAR UN PPL
    public boolean eliminarPreso(String cedula) {
        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            if (this.listaPPLCompleta[i].getCedula().equalsIgnoreCase(cedula)) {
                this.listaPPLCompleta[i].setNombre("[LIBRE]");
                this.listaPPLCompleta[i].setEdad(0);
                this.listaPPLCompleta[i].setCedula("[LIBRE]");
                this.listaPPLCompleta[i].setFechaIngreso("[LIBRE]");
                this.listaPPLCompleta[i].setDelito("[LIBRE]");
                this.listaPPLCompleta[i].setFechaSalida("[LIBRE]");
                this.listaPPLCompleta[i].setAniosRestantes(0);
                this.listaPPLCompleta[i].setClasificacion("[LIBRE]");
                this.listaPPLCompleta[i].setPena(0);
                return true;
            }
        }
        return false;
    }

    //CONSULTAR DISPONIBILIDAD DE CUPOS
    public String consultarCuposDisponibles() {
        StringBuilder sb = new StringBuilder();
        boolean haycupos = false;
        int cuposDispP_A = 0;
        int cuposDispP_M = 0;
        int cuposDispP_B = 0;
        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            if (this.listaPPLCompleta[i].getNombre().equalsIgnoreCase("[LIBRE]") && this.listaPPLCompleta[i].getPabellon().equalsIgnoreCase("A")) {
                haycupos = true;
                cuposDispP_A += 1;
            }
        }
        sb.append("Hay " + cuposDispP_A + " cupos disponibles en el pabellon A (Alta peligrosidad)").append("\n");
        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            if (this.listaPPLCompleta[i].getNombre().equalsIgnoreCase("[LIBRE]") && this.listaPPLCompleta[i].getPabellon().equalsIgnoreCase("M")) {
                haycupos = true;
                cuposDispP_M += 1;
            }
        }
        sb.append("Hay " + cuposDispP_M + " cupos disponibles en el pabellon M (Media Peligrosidad)").append("\n");

        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            if (this.listaPPLCompleta[i].getNombre().equalsIgnoreCase("[LIBRE]") && this.listaPPLCompleta[i].getPabellon().equalsIgnoreCase("B")) {
                haycupos = true;
                cuposDispP_B += 1;
            }
        }
        sb.append("Hay " + cuposDispP_B + " cupos disponibles en el pabellon B (Media Peligrosidad)");

        if (haycupos) {
            return sb.toString();
        } else
            return "NO HAY CUPOS DISPONIBLES EN ESTE MOMENTO";
    }

    //INGRESAR UN PPL A LA CARCEL SOLO SI HAY CUPOS DISPONIBLES
    public void agregarPPL(String pabellon, String nombre, String cedula, int edad, String delito) {
        GenerarData generador = new GenerarData();
        //GENERAR PENA SEGUN DELITO
        int pena = 0;
        if (delito.equalsIgnoreCase("Narcotrafico")) {
            pena = 80;
        } else if (delito.equalsIgnoreCase("Homicidio")) {
            pena = 40;
        } else if (delito.equalsIgnoreCase("Robo")) {
            pena = 20;
        } else if (delito.equalsIgnoreCase("Hurto")) {
            pena = 15;
        } else if (delito.equalsIgnoreCase("Fraude")) {
            pena = 15;
        } else if (delito.equalsIgnoreCase("Evasion")) {
            pena = 10;
        } else if (delito.equalsIgnoreCase("Invasion")) {
            pena = 10;
        } else if (delito.equalsIgnoreCase("Amenazas")) {
            pena = 7;
        } else if (delito.equalsIgnoreCase("Estafa")) {
            pena = 5;
        } else if (delito.equalsIgnoreCase("Otros")) {
            pena = 2;
        } else {
            pena = 1;
        }

        //GENERAR CLASIFICACION SEGUN DELITO
        String clasificacion = null;
        if (delito.equalsIgnoreCase("Narcotrafico")) {
            clasificacion = "Alto";
        } else if (delito.equalsIgnoreCase("Homicidio")) {
            clasificacion = "Alto";
        } else if (delito.equalsIgnoreCase("Robo")) {
            clasificacion = "Medio";
        } else if (delito.equalsIgnoreCase("Hurto")) {
            clasificacion = "Medio";
        } else if (delito.equalsIgnoreCase("Fraude")) {
            clasificacion = "Medio";
        } else if (delito.equalsIgnoreCase("Evasion")) {
            clasificacion = "Medio";
        } else if (delito.equalsIgnoreCase("Invasion")) {
            clasificacion = "Bajo";
        } else if (delito.equalsIgnoreCase("Amenazas")) {
            clasificacion = "Bajo";
        } else if (delito.equalsIgnoreCase("Estafa")) {
            clasificacion = "Bajo";
        } else if (delito.equalsIgnoreCase("Otros")) {
            clasificacion = "Bajo";
        } else {
            clasificacion = "No clasifica";
        }

        //GENERAR FECHA DE SALIDA echaIngreso=3/6/2024  fechaSalida=3/6//34  pena=10
        String anioIngreso = generador.fechaActual().substring(6);
        String dia = generador.fechaActual().substring(0, 2);
        String mes = generador.fechaActual().substring(3, 5);
        int anioSalida = Integer.parseInt(anioIngreso) + pena;//PENA CALCULADA ANTERIORMENTE    
        String fechaSalida = dia + "/" + mes + "/" + String.valueOf(anioSalida);

        //CALCULAR ANIOS RESTANTES
        int aniosRestantes = anioSalida - Integer.parseInt(anioIngreso);//El anio de ingreso siempre sera el anio actual

        //METER PPL EN EL PABELLON DESEADO
        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            if (this.listaPPLCompleta[i].getNombre().equalsIgnoreCase("[LIBRE]") && this.listaPPLCompleta[i].getPabellon().equalsIgnoreCase(pabellon)) {
                this.listaPPLCompleta[i].setNombre(nombre);
                this.listaPPLCompleta[i].setEdad(edad);
                this.listaPPLCompleta[i].setCedula(cedula);
                this.listaPPLCompleta[i].setFechaIngreso(generador.fechaActual());
                this.listaPPLCompleta[i].setDelito(delito);
                this.listaPPLCompleta[i].setFechaSalida(fechaSalida);
                this.listaPPLCompleta[i].setAniosRestantes(aniosRestantes);
                this.listaPPLCompleta[i].setClasificacion(clasificacion);
                this.listaPPLCompleta[i].setPena(pena);
            }
        }
    }

    public double promedioEdades() {
        double promEdades = 0;
        for (PPL listaPPLCompleta1 : this.listaPPLCompleta) {
            promEdades += listaPPLCompleta1.getEdad();
        }
        promEdades = promEdades / this.listaPPLCompleta.length;
        return promEdades;
    }

    public String promEdadesPabe() {
        StringBuilder sb = new StringBuilder();
        double promEdadPabe1 = 0;
        double promEdadPabe2 = 0;
        double promEdadPabe3 = 0;
        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            if (this.listaPPLCompleta[i].getPabellon().equalsIgnoreCase("A")) {
                promEdadPabe1 += listaPPLCompleta[i].getEdad();
            }
            if (this.listaPPLCompleta[i].getPabellon().equalsIgnoreCase("M")) {
                promEdadPabe2 += listaPPLCompleta[i].getEdad();
            }
            if (this.listaPPLCompleta[i].getPabellon().equalsIgnoreCase("B")) {
                promEdadPabe3 += listaPPLCompleta[i].getEdad();
            }
        }
        promEdadPabe1 = promEdadPabe1 / 200;
        promEdadPabe2 = promEdadPabe2 / 400;
        promEdadPabe3 = promEdadPabe3 / 400;
        sb.append("PROMEDIO DE EDADES POR CADA PABELLON").append("\n");
        sb.append("Promedio de edades Pabellon A: " + promEdadPabe1).append("\n");
        sb.append("Promedio de edades Pabellon M: " + promEdadPabe2).append("\n");
        sb.append("Promedio de edades Pabellon B: " + promEdadPabe3);
        return sb.toString();
    }

    public String promDelitoPabe() {
        StringBuilder sb = new StringBuilder();
        int promDelito1 = 0;
        int promDelito2 = 0;
        int promDelito3 = 0;
        int promDelito4 = 0;
        int promDelito5 = 0;
        int promDelito6 = 0;
        int promDelito7 = 0;
        int promDelito8 = 0;
        int promDelito9 = 0;
        int promDelito10 = 0;
        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Narcotrafico")) {
                promDelito1++;
            }
            if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Homicidio")) {
                promDelito2++;
            }
            if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Robo")) {
                promDelito3++;
            }
            if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Hurto")) {
                promDelito4++;
            }
            if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Fraude")) {
                promDelito5++;
            }
            if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Evasion")) {
                promDelito6++;
            }
            if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Invasion")) {
                promDelito7++;
            }
            if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Amenazas")) {
                promDelito8++;
            }
            if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Estafa")) {
                promDelito9++;
            }
            if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Otros")) {
                promDelito10++;
            }
        }
        sb.append("NUMERO DE DELITOS COMETIDOS").append("\n");
        sb.append("NARCOTRAFICO: " + promDelito1).append("\n");
        sb.append("HOMICIDIO: " + promDelito2).append("\n");
        sb.append("ROBO: " + promDelito3).append("\n");
        sb.append("HURTO: " + promDelito4).append("\n");
        sb.append("FRAUDE: " + promDelito5).append("\n");
        sb.append("EVASION: " + promDelito6).append("\n");
        sb.append("INVASION: " + promDelito7).append("\n");
        sb.append("AMENAZAS: " + promDelito8).append("\n");
        sb.append("ESTAFA: " + promDelito9).append("\n");
        sb.append("OTROS: " + promDelito10).append("\n");
        return sb.toString();
    }
    
    public String asignarAgravantes(String cedula, int agravante){
        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            if (this.listaPPLCompleta[i].getCedula().equalsIgnoreCase(cedula)) {
                int penaAux = this.listaPPLCompleta[i].getPena();
                int pena = penaAux + agravante;
                this.listaPPLCompleta[i].setPena(pena);
                return "PPL CON IDENTIFICACION "+cedula+" AHORA TIENE "+this.listaPPLCompleta[i].getPena()+" ANIOS DE PENA" ;
            }
        }
        return "PPL NO ENCONTRADO";
    }
    //BUSCAR UN PPL ESPECIFICO Y MOSTRAR SUS DATOS
    public String mostrarPPL(String cedula){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            if(cedula.equalsIgnoreCase(this.listaPPLCompleta[i].getCedula())){
                sb.append("NOMBRE:").append(this.listaPPLCompleta[i].getNombre()).append("\n");
                sb.append("CEDULA:").append(this.listaPPLCompleta[i].getCedula()).append("\n");
                sb.append("EDAD:").append(this.listaPPLCompleta[i].getEdad()).append("\n");
                sb.append("FECHA INGRESO:").append(this.listaPPLCompleta[i].getFechaIngreso()).append("\n");
                sb.append("FECHA SALIDA:").append(this.listaPPLCompleta[i].getFechaSalida()).append("\n");
                sb.append("PENA:").append(this.listaPPLCompleta[i].getPena()).append("\n");
                sb.append("CLASIFICACION:").append(this.listaPPLCompleta[i].getClasificacion()).append("\n");
                sb.append("ANIOS RESTANTES:").append(this.listaPPLCompleta[i].getAniosRestantes()).append("\n");
                sb.append("DELITO:").append(this.listaPPLCompleta[i].getDelito()).append("\n");
                sb.append("PABELLON:").append(this.listaPPLCompleta[i].getPabellon()).append("\n");
                return sb.toString();
            }
        }
        return "CEDULA NO ENCONTRADA";
    }
    //MOSTRAR LA LISTA DE PPL O SOLO EL PABELLON SELECCIONADO
    public String mostrarListaPPL(int opcion) {
        StringBuilder sb = new StringBuilder();
        if(opcion == 0){
            for (PPL ppl : listaPPLCompleta) {
                sb.append(ppl.toString()).append("\n");
            }
            return sb.toString();
        } else if(opcion == 1){
            for (int i = 0; i < 200; i++) {
                sb.append(listaPPLCompleta[i].toString());
                sb.append("\n");
            }
            return sb.toString();
        } else if(opcion == 2){
            for (int i = 200; i < 600; i++) {
                sb.append(listaPPLCompleta[i].toString());
                sb.append("\n");
            }
            return sb.toString();
        } else if(opcion == 3){
            for (int i = 600; i < 1000; i++) {
                sb.append(listaPPLCompleta[i].toString());
                sb.append("\n");
            }
            return sb.toString();
        } else
            return "";
    }
    //ASIGNAR DIAS DE VISITA SEGUN EL DELITO COMETIDO
    public void asignarDiasVisita() {
        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Narcotrafico")) {
                this.listaPPLCompleta[i].setVisitas(1);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Homicidio")) {
                this.listaPPLCompleta[i].setVisitas(1);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Robo")) {
                this.listaPPLCompleta[i].setVisitas(2);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Hurto")) {
                this.listaPPLCompleta[i].setVisitas(3);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Fraude")) {
                this.listaPPLCompleta[i].setVisitas(3);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Evasion")) {
                this.listaPPLCompleta[i].setVisitas(3);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Invasion")) {
                this.listaPPLCompleta[i].setVisitas(4);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Amenazas")) {
                this.listaPPLCompleta[i].setVisitas(4);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Estafa")) {
                this.listaPPLCompleta[i].setVisitas(5);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Otros")) {
                this.listaPPLCompleta[i].setVisitas(5);
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carcel{");
        for (PPL ppl : listaPPLCompleta) {
            sb.append(ppl.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
