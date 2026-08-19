import java.util.Scanner;
public class analisis_de_adn {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] personas = new String[10];
        String[] codigosMuestra = new String[10];
        String[] tiposMuestra = new String[10];
        String[] tiposAnalisis = new String[10];
        String[] resultados = new String[10];
        String[] fechas = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //---------------------------------------//
        //--|menu_principal_de_analisis_de_adn|--//
        //---------------------------------------//
        do {
            System.out.println("menu principal analisis de ADN");
            System.out.println("1) Registrar analisis");
            System.out.println("2) Editar analisis");
            System.out.println("3) Listar analisis");
            System.out.println("4) Buscar analisis");
            System.out.println("5) Eliminar analisis");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //------------------------//
                //--|registrar_analisis|--//
                //------------------------//
                case 1:
                    if (total >= personas.length) {
                        System.out.println("No hay espacio para registrar mas analisis.");
                        break;
                    }
                    int id = total + 1;
                    System.out.println("registro de analisis de ADN");
                    System.out.println("id del analisis a registrar: " + id);
                    System.out.print("nombre de la persona: ");
                    personas[total] = entrada.nextLine();
                    System.out.print("codigo de la muestra: ");
                    codigosMuestra[total] = entrada.nextLine();
                    System.out.print("tipo de muestra: ");
                    tiposMuestra[total] = entrada.nextLine();
                    System.out.print("tipo de analisis: ");
                    tiposAnalisis[total] = entrada.nextLine();
                    System.out.print("resultado del analisis: ");
                    resultados[total] = entrada.nextLine();
                    System.out.print("fecha del analisis: ");
                    fechas[total] = entrada.nextLine();
                    System.out.print("estado del analisis: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Analisis registrado correctamente.");
                    total++;
                    break;
                //---------------------//
                //--|editar_analisis|--//
                //---------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen analisis registrados.");
                        break;
                    }
                    System.out.println("Datos de los analisis");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Persona: " + personas[i] + " | Codigo: " + codigosMuestra[i] + " | Muestra: " + tiposMuestra[i] + " | Analisis: " + tiposAnalisis[i] + " | Resultado: " + resultados[i] + " | Fecha: " + fechas[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del analisis: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("Editar el dato del analisis");
                        System.out.print("Nuevo nombre de la persona: ");
                        personas[posicion] = entrada.nextLine();
                        System.out.print("Nuevo codigo de la muestra: ");
                        codigosMuestra[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de muestra: ");
                        tiposMuestra[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de analisis: ");
                        tiposAnalisis[posicion] = entrada.nextLine();
                        System.out.print("Nuevo resultado del analisis: ");
                        resultados[posicion] = entrada.nextLine();
                        System.out.print("Nueva fecha del analisis: ");
                        fechas[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado del analisis: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Analisis actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|listar_analisis|--//
                //---------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen analisis registrados.");
                    } else {
                        System.out.println("Lista de analisis de ADN");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Persona: " + personas[i] + " | Codigo: " + codigosMuestra[i] + " | Muestra: " + tiposMuestra[i] + " | Analisis: " + tiposAnalisis[i] + " | Resultado: " + resultados[i] + " | Fecha: " + fechas[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //---------------------//
                //--|buscar_analisis|--//
                //---------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen analisis registrados.");
                        break;
                    }
                    System.out.println("busqueda de analisis");
                    System.out.print("ingresa la id para buscar analisis: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del analisis encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Persona: " + personas[posicion] + " | Codigo: " + codigosMuestra[posicion] + " | Muestra: " + tiposMuestra[posicion] + " | Analisis: " + tiposAnalisis[posicion] + " | Resultado: " + resultados[posicion] + " | Fecha: " + fechas[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-----------------------//
                //--|eliminar_analisis|--//
                //-----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen analisis registrados.");
                        break;
                    }
                    System.out.println("Datos de los analisis");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Persona: " + personas[i] + " | Codigo: " + codigosMuestra[i] + " | Muestra: " + tiposMuestra[i] + " | Analisis: " + tiposAnalisis[i] + " | Resultado: " + resultados[i] + " | Fecha: " + fechas[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del analisis a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            personas[i] = personas[i + 1];
                            codigosMuestra[i] = codigosMuestra[i + 1];
                            tiposMuestra[i] = tiposMuestra[i + 1];
                            tiposAnalisis[i] = tiposAnalisis[i + 1];
                            resultados[i] = resultados[i + 1];
                            fechas[i] = fechas[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Analisis eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen analisis registrados.");
                        break;
                    }
                    int pendientes = 0;
                    int procesados = 0;
                    int cancelados = 0;
                    int otrosEstados = 0;
                    for (int i = 0; i < total; i++) {
                        if (estados[i].equalsIgnoreCase("Pendiente")) {
                            pendientes++;
                        } else if (estados[i].equalsIgnoreCase("Procesado")) {
                            procesados++;
                        } else if (estados[i].equalsIgnoreCase("Cancelado")) {
                            cancelados++;
                        } else {
                            otrosEstados++;
                        }
                    }
                    String tipoMuestraMayor = tiposMuestra[0];
                    int cantidadMuestraMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadMuestra = 0;
                        for (int j = 0; j < total; j++) {
                            if (tiposMuestra[i].equalsIgnoreCase(tiposMuestra[j])) {
                                cantidadMuestra++;
                            }
                        }
                        if (cantidadMuestra > cantidadMuestraMayor) {
                            cantidadMuestraMayor = cantidadMuestra;
                            tipoMuestraMayor = tiposMuestra[i];
                        }
                    }
                    String tipoAnalisisMayor = tiposAnalisis[0];
                    int cantidadAnalisisMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadAnalisis = 0;
                        for (int j = 0; j < total; j++) {
                            if (tiposAnalisis[i].equalsIgnoreCase(tiposAnalisis[j])) {
                                cantidadAnalisis++;
                            }
                        }
                        if (cantidadAnalisis > cantidadAnalisisMayor) {
                            cantidadAnalisisMayor = cantidadAnalisis;
                            tipoAnalisisMayor = tiposAnalisis[i];
                        }
                    }
                    System.out.println("resumen de analisis de ADN");
                    System.out.println("Analisis registrados: " + total);
                    System.out.println("Tipo de muestra mas utilizado: " + tipoMuestraMayor);
                    System.out.println("Tipo de analisis mas realizado: " + tipoAnalisisMayor);
                    System.out.println("Pendientes: " + pendientes);
                    System.out.println("Procesados: " + procesados);
                    System.out.println("Cancelados: " + cancelados);
                    System.out.println("Otros estados: " + otrosEstados);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Analisis de ADN.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}