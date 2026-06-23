import java.util.Arrays;
import java.util.Comparator;

public class Agenda {

    private Contacto[] listaContacto = new Contacto[10];
    private int contadorContacto = 0;

    public void añadirContacto(String name, String lastName, String number) {
        Contacto nuevo = new Contacto(name, lastName, number);
        if (existeContacto(nuevo)) {
            System.out.println("El contacto " + name + " " + lastName + " ya existe en la agenda.");
            return;
        }
        if (contadorContacto >= 10) {
            System.out.println("La agenda está llena, no se pueden agregar más contactos.");
        } else {
            listaContacto[contadorContacto] = nuevo;
            contadorContacto++;
            System.out.println("Contacto añadido con éxito.");
        }
    }

    public boolean existeContacto(Contacto c) {
        if (c == null) {
            return false;
        }
        for (int i = 0; i < contadorContacto; i++) {
            Contacto actual = listaContacto[i];
            if (actual.getName().equalsIgnoreCase(c.getName()) &&
                    actual.getLastName().equalsIgnoreCase(c.getLastName())) {
                return true;
            }
        }
        return false;
    }

    public void listarContactos() {
        if (contadorContacto == 0) {
            System.out.println("La agenda está vacía.");
            return;
        }

        System.out.println("\n--- LISTA DE CONTACTOS ---");

        // Copia solo los contactos activos para evitar NullPointerException
        Contacto[] contactosActivos = Arrays.copyOf(listaContacto, contadorContacto);

        // Ordenamos alfabéticamente por nombre y luego apellido
        Arrays.sort(contactosActivos, Comparator.comparing((Contacto c) -> c.getName().toLowerCase())
                .thenComparing(c -> c.getLastName().toLowerCase()));

        for (Contacto c : contactosActivos) {
            System.out.println(c.getName() + " " + c.getLastName() + " - " + c.getNumber());
        }
    }

    public void buscaContacto(String nombre, String apellido) {
        boolean encontrado = false;
        for (int i = 0; i < contadorContacto; i++) {
            Contacto c = listaContacto[i];
            if (c.getName().equalsIgnoreCase(nombre) && c.getLastName().equalsIgnoreCase(apellido)) {
                System.out.println("📞 Teléfono de " + c.getName() + " " + c.getLastName() + ": " + c.getNumber());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) System.out.println("❌ Contacto no encontrado.");
    }

    public void buscaContacto(String nombreBuscado) {
        boolean encontrado = false;
        for (int i = 0; i < contadorContacto; i++) {
            Contacto c = listaContacto[i];
            String nombreCompleto = c.getName() + " " + c.getLastName();
            if (c.getName().equalsIgnoreCase(nombreBuscado) || nombreCompleto.equalsIgnoreCase(nombreBuscado)) {
                System.out.println("📞 Teléfono: " + c.getNumber());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) System.out.println("❌ Contacto no encontrado.");
    }

    public void eliminarContacto(String nombre, String apellido) {
        int indiceAEliminar = -1;

        for (int i = 0; i < contadorContacto; i++) {
            Contacto c = listaContacto[i];
            if (c.getName().equalsIgnoreCase(nombre) && c.getLastName().equalsIgnoreCase(apellido)) {
                indiceAEliminar = i;
                break;
            }
        }

        if (indiceAEliminar != -1) {
            // Recorremos los elementos a la izquierda para tapar el hueco
            for (int i = indiceAEliminar; i < contadorContacto - 1; i++) {
                listaContacto[i] = listaContacto[i + 1];
            }
            listaContacto[contadorContacto - 1] = null;
            contadorContacto--;
            System.out.println("✅ Contacto '" + nombre + " " + apellido + "' eliminado exitosamente.");
        } else {
            System.out.println("❌ Error: No se encontró el contacto '" + nombre + " " + apellido + "'.");
        }
    }

    import java.util.Arrays;
import java.util.Comparator;

    public class Agenda {

        private Contacto[] listaContacto = new Contacto[10];
        private int contadorContacto = 0;

        public void añadirContacto(String name, String lastName, String number) {
            Contacto nuevo = new Contacto(name, lastName, number);
            if (existeContacto(nuevo)) {
                System.out.println("El contacto " + name + " " + lastName + " ya existe en la agenda.");
                return;
            }
            if (contadorContacto >= 10) {
                System.out.println("La agenda está llena, no se pueden agregar más contactos.");
            } else {
                listaContacto[contadorContacto] = nuevo;
                contadorContacto++;
                System.out.println("Contacto añadido con éxito.");
            }
        }

        public boolean existeContacto(Contacto c) {
            if (c == null) {
                return false;
            }
            for (int i = 0; i < contadorContacto; i++) {
                Contacto actual = listaContacto[i];
                if (actual.getName().equalsIgnoreCase(c.getName()) &&
                        actual.getLastName().equalsIgnoreCase(c.getLastName())) {
                    return true;
                }
            }
            return false;
        }

        public void listarContactos() {
            if (contadorContacto == 0) {
                System.out.println("La agenda está vacía.");
                return;
            }

            System.out.println("\n--- LISTA DE CONTACTOS ---");

            // Copia solo los contactos activos para evitar NullPointerException
            Contacto[] contactosActivos = Arrays.copyOf(listaContacto, contadorContacto);

            // Ordenamos alfabéticamente por nombre y luego apellido
            Arrays.sort(contactosActivos, Comparator.comparing((Contacto c) -> c.getName().toLowerCase())
                    .thenComparing(c -> c.getLastName().toLowerCase()));

            for (Contacto c : contactosActivos) {
                System.out.println(c.getName() + " " + c.getLastName() + " - " + c.getNumber());
            }
        }

        public void buscaContacto(String nombre, String apellido) {
            boolean encontrado = false;
            for (int i = 0; i < contadorContacto; i++) {
                Contacto c = listaContacto[i];
                if (c.getName().equalsIgnoreCase(nombre) && c.getLastName().equalsIgnoreCase(apellido)) {
                    System.out.println("📞 Teléfono de " + c.getName() + " " + c.getLastName() + ": " + c.getNumber());
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) System.out.println("❌ Contacto no encontrado.");
        }

        public void buscaContacto(String nombreBuscado) {
            boolean encontrado = false;
            for (int i = 0; i < contadorContacto; i++) {
                Contacto c = listaContacto[i];
                String nombreCompleto = c.getName() + " " + c.getLastName();
                if (c.getName().equalsIgnoreCase(nombreBuscado) || nombreCompleto.equalsIgnoreCase(nombreBuscado)) {
                    System.out.println("📞 Teléfono: " + c.getNumber());
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) System.out.println("❌ Contacto no encontrado.");
        }

        public void eliminarContacto(String nombre, String apellido) {
            int indiceAEliminar = -1;

            for (int i = 0; i < contadorContacto; i++) {
                Contacto c = listaContacto[i];
                if (c.getName().equalsIgnoreCase(nombre) && c.getLastName().equalsIgnoreCase(apellido)) {
                    indiceAEliminar = i;
                    break;
                }
            }

            if (indiceAEliminar != -1) {
                // Recorremos los elementos a la izquierda para tapar el hueco
                for (int i = indiceAEliminar; i < contadorContacto - 1; i++) {
                    listaContacto[i] = listaContacto[i + 1];
                }
                listaContacto[contadorContacto - 1] = null;
                contadorContacto--;
                System.out.println("✅ Contacto '" + nombre + " " + apellido + "' eliminado exitosamente.");
            } else {
                System.out.println("❌ Error: No se encontró el contacto '" + nombre + " " + apellido + "'.");
            }
        }

        public void modificarTelefono(String nombre, String apellido, String nuevoTelefono) {
            boolean encontrado = false;

            for (int i = 0; i < contadorContacto; i++) {
                Contacto c = listaContacto[i];

                if (c.getName().equalsIgnoreCase(nombre) &&
                        c.getLastName().equalsIgnoreCase(apellido)) {

                    c.setNumber(nuevoTelefono);

                    System.out.println("El teléfono de " + c.getName() + " " + c.getLastName() + " ha sido actualizado con éxito.");
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Error: No se encontró el contacto '" + nombre + " " + apellido + "' para modificar su teléfono.");
            }
        }

        public void agendaLlena() {
            if (contadorContacto == listaContacto.length) {
                System.out.println("Espacio de agenda lleno.");
            } else {
                System.out.println("La agenda tiene espacio disponible.");
            }
        }

        public void espacioLibres() {
            int libres = listaContacto.length - contadorContacto;
            System.out.println("Espacios disponibles: " + libres);
        }
    }
