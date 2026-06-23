import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Agenda miAgenda = new Agenda();

        String opcion;

        do {
            System.out.println("\n========== MENÚ DE AGENDA ==========");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Verificar si existe un contacto");
            System.out.println("3. Buscar contacto por nombre y apellido");
            System.out.println("4. Buscar contacto por nombre o nombre completo");
            System.out.println("5. Listar contactos");
            System.out.println("6. Eliminar contacto");
            System.out.println("7. Modificar teléfono");
            System.out.println("8. Verificar si la agenda está llena");
            System.out.println("9. Ver espacios libres");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextLine();

            switch (opcion) {

                case "1":
                    System.out.println("\n--- AÑADIR CONTACTO ---");

                    System.out.print("Nombre: ");
                    String nombreAgregar = scanner.nextLine();

                    System.out.print("Apellido: ");
                    String apellidoAgregar = scanner.nextLine();

                    System.out.print("Teléfono: ");
                    String telefonoAgregar = scanner.nextLine();

                    miAgenda.añadirContacto(nombreAgregar, apellidoAgregar, telefonoAgregar);
                    break;

                case "2":
                    System.out.println("\n--- VERIFICAR SI EXISTE CONTACTO ---");

                    System.out.print("Nombre: ");
                    String nombreExiste = scanner.nextLine();

                    System.out.print("Apellido: ");
                    String apellidoExiste = scanner.nextLine();

                    Contacto contactoBuscar = new Contacto(nombreExiste, apellidoExiste, "");
                    boolean existe = miAgenda.existeContacto(contactoBuscar);

                    if (existe) {
                        System.out.println("El contacto sí existe en la agenda.");
                    } else {
                        System.out.println("El contacto no existe en la agenda.");
                    }
                    break;

                case "3":
                    System.out.println("\n--- BUSCAR CONTACTO POR NOMBRE Y APELLIDO ---");

                    System.out.print("Nombre: ");
                    String nombreBusqueda = scanner.nextLine();

                    System.out.print("Apellido: ");
                    String apellidoBusqueda = scanner.nextLine();

                    miAgenda.buscaContacto(nombreBusqueda, apellidoBusqueda);
                    break;

                case "4":
                    System.out.println("\n--- BUSCAR CONTACTO POR NOMBRE O NOMBRE COMPLETO ---");

                    System.out.print("Escribe el nombre o nombre completo: ");
                    String nombreFlexible = scanner.nextLine();

                    miAgenda.buscaContacto(nombreFlexible);
                    break;

                case "5":
                    System.out.println("\n--- LISTAR CONTACTOS ---");
                    miAgenda.listarContactos();
                    break;

                case "6":
                    System.out.println("\n--- ELIMINAR CONTACTO ---");

                    System.out.print("Nombre: ");
                    String nombreEliminar = scanner.nextLine();

                    System.out.print("Apellido: ");
                    String apellidoEliminar = scanner.nextLine();

                    miAgenda.eliminarContacto(nombreEliminar, apellidoEliminar);
                    break;

                case "7":
                    System.out.println("\n--- MODIFICAR TELÉFONO ---");

                    System.out.print("Nombre del contacto: ");
                    String nombreModificar = scanner.nextLine();

                    System.out.print("Apellido del contacto: ");
                    String apellidoModificar = scanner.nextLine();

                    System.out.print("Nuevo teléfono: ");
                    String nuevoTelefono = scanner.nextLine();

                    miAgenda.modificarTelefono(nombreModificar, apellidoModificar, nuevoTelefono);
                    break;

                case "8":
                    System.out.println("\n--- VERIFICAR SI LA AGENDA ESTÁ LLENA ---");
                    miAgenda.agendaLlena();
                    break;

                case "9":
                    System.out.println("\n--- ESPACIOS LIBRES ---");
                    miAgenda.espacioLibres();
                    break;

                case "0":
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
                    break;
            }

        } while (!opcion.equals("0"));

        scanner.close();
    }
}
