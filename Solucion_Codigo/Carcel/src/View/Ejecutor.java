//PAQUETE VISTA
package View;
//IMPORTAR LAS CLASES NECESARIAS
import Controller.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        //CODIGO NECESARIO
        Scanner tc = new Scanner(System.in);
        String cedula = null, nameArch = "serializado.dat";
        int seguir = 0, opcionM1 = 0, opcionM2 = 0, aumPena = 0;
        double prom = 0;
        
        //INSTANCIAR CLASE GENERARDATA
        GenerarData generador = new GenerarData();//INSTANCIAR CLASE PARA GENERAR DATOS
        //SACAR DATOS NECESARIOS 
        String nombres[] = generador.generarNombresPPL();
        int edades[] = generador.generaredades();
        String cedulas[] = generador.generarCedulas();
        String delitos[] = generador.generardelitos();
        String fechasIngreso[] = generador.generarFechasIngreso();
        
        //INSTANCIAR LA CLASE PPL Y PASARLE DATOS ALEATORIOS
        PPL[] listaPPL = new PPL[1000];
        for (int i = 0; i < 1000; i++) {
            listaPPL[i] = new PPL(nombres[i], edades[i], cedulas[i], fechasIngreso[i], delitos[i]);
        }
        
        //INSTANCIAR LA CLASE CARCEL
        Carcel carcel = new Carcel(listaPPL);
        
        //CALCULAR LOS DATOS USANDO LOS METODOS DE LA CLASE CARCEL
        carcel.asignarClasificacion();
        carcel.asignarPena();
        carcel.asignarPabellon();
        carcel.calcularFechaSalida();
        carcel.calcularAniosRestantes();
        carcel.asignarDiasVisita();
        
        //SERIALIZAR CARCEL
        ObjectOutputStream salida  = new ObjectOutputStream(new FileOutputStream(nameArch));//Crear el canal
        salida.writeObject(carcel); 
        salida.close();
        //INICIAR LA SALIDA POR CONSOLA
        System.out.println("**************CARCEL DE LOJA****************");
        do{
            System.out.println("INGRESA EL NUMERO CORRESPONDIENTE A LA OPCION:");
            System.out.println("[1] -> VER LISTA DE PPL COMPLETA");
            System.out.println("[2] -> VER LISTA DE PPL POR PABELLONES");
            System.out.println("[3] -> VER PPL ESPECIFICO");
            System.out.println("[4] -> CONSULTAR DISPONIBILIDAD DE CUPOS");
            System.out.println("[5] -> INGRESAR PPL A LA CARCEL");
            System.out.println("[6] -> ELIMINAR PPL DE LA CARCEL");
            System.out.println("[7] -> ASIGNAR AGRAVANTE (AUMENTAR PENA)");
            System.out.println("[8] -> MOSTRAR ESTADISTICAS DE LA CARCEL");
            opcionM1 = tc.nextInt();
            switch(opcionM1){
                case 1:
                    //DESERIALIZAR EL ARCHIVO (LEERLO Y TRAERLO A CONSOLA)
                    ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nameArch));
                    Carcel mostrarCarcel = (Carcel) entrada.readObject();//Deserializacion
                    System.out.println(mostrarCarcel);
                    break;
                case 2:
                    System.out.println("QUE PABELLON DESEAS VER?");
                    System.out.println("[1] -> PABELLON A - ALTA PELIGROSIDAD");
                    System.out.println("[2] -> PABELLON M - MEDIA PELIGROSIDAD");
                    System.out.println("[3] -> PABELLON B - BAJA PELIGROSIDAD");
                    opcionM2 = tc.nextInt();
                    if(opcionM2 == 1){
                        System.out.println(carcel.mostrarListaPPL(opcionM2));
                        System.out.println("LA LISTA ANTERIOR CONTIENE LA INFORMACION DE TODOS LOS PPL DEL PABELLON A - ALTA PELIGROSIDAD");
                    } else if (opcionM2 == 2){
                        System.out.println(carcel.mostrarListaPPL(opcionM2));
                        System.out.println("LA LISTA ANTERIOR CONTIENE LA INFORMACION DE TODOS LOS PPL DEL PABELLON M - MEDIA PELIGROSIDAD");
                    } else if(opcionM2 == 3){
                        System.out.println(carcel.mostrarListaPPL(opcionM2));
                        System.out.println("LA LISTA ANTERIOR CONTIENE LA INFORMACION DE TODOS LOS PPL DEL PABELLON B - BAJA PELIGROSIDAD");
                    }
                    break;
                case 3:
                    System.out.println("INGRESA LA IDENTIFICACION DEL PPL");
                    cedula = tc.next();
                    System.out.println(carcel.mostrarPPL(cedula));
                    break;
                case 4:
                    System.out.println(carcel.consultarCuposDisponibles());
                    break;
                case 5:
                    if(carcel.consultarCuposDisponibles().equalsIgnoreCase("NO HAY CUPOS DISPONIBLES EN ESTE MOMENTO")){
                        System.out.println("NO HAY CUPOS DISPONIBLES EN ESTE MOMENTO");
                    }else{
                        System.out.println("INGRESA LOS DATOS DEL PPL QUE VAS A INGRESAR");
                        System.out.println("INGRESA EL PABELLON AL QUE DESEAS INGRESAR EL PPL");
                        System.out.println(carcel.consultarCuposDisponibles());
                        String pabellon = tc.next();
                        tc.nextLine();
                        System.out.println("NOMBRE:");
                        String nombre = tc.nextLine();
                        System.out.println("EDAD");
                        int edad = tc.nextInt();
                        System.out.println("CEDULA:");
                        cedula = tc.next();
                        System.out.println("DELITO");
                        String delito = tc.next();
                        carcel.agregarPPL(pabellon, nombre, cedula, edad, delito);
                        System.out.println("PPL CON IDENTIFICACION "+cedula+" INGRESADO CON EXITO");
                    }
                    break;
                case 6:
                    System.out.println("INGRESA LA CEDULA DEL PPL QUE QUIERES ELIMINAR");
                    cedula = tc.next();
                    if(carcel.eliminarPreso(cedula)){
                        System.out.println("PPL CON IDENTIFICACION "+cedula+" ELIMINADO CON EXITO");
                        carcel.eliminarPreso(cedula);
                    }else
                        System.out.println("PPL NO ENCONTRADO");
                    break;
                case 7:
                    System.out.println("INGRESA EL AUMENTO DE PENA");
                    aumPena = tc.nextInt();
                    System.out.println("INGRESA LA IDENTIFICACION DEL PPL QUE DESEAS SANCIONAR");
                    cedula = tc.next();
                    System.out.println(carcel.asignarAgravantes(cedula, aumPena));
                case 8:
                    System.out.println("****ESTADISTICA - CARCEL LOJA******");
                    prom = carcel.promedioEdades();
                    System.out.println("PROMEDIO DE EDADES DE TODA LA CARCEL: " + prom+"\n");
                    System.out.println(carcel.promEdadesPabe()+"\n");
                    System.out.println(carcel.promDelitoPabe());
                    break;
                default:
                    System.out.println("OPCION INCORRECTA, VUELVE A INGRESAR EL VALOR");
                    break;
            }
            System.out.println("DESEAS CONTINUAR CON EL PROGRAMA? (SI -> 1 | NO -> 2)");
            seguir = tc.nextInt();
            if(seguir != 1)
                System.out.println("***************CARCEL DE LOJA*****************");
                System.out.println("GRACIAS POR USAR ESTE PROGRAMA, REGRESA PRONTO");
        }while(seguir == 1);
    }
}