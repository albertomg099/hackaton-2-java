import java.util.ArrayList;
import java.util.Comparator;

public class Agenda {

    // 1. Declaramos la lista de contactos
    private ArrayList<Contacto> contactos;

    // 2. Constructor para inicializar la lista
    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    // =======================================================
    // TUS MÉTODOS
    // =======================================================

    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
            return;
        }

        System.out.println("\n--- LISTA DE CONTACTOS ---");
        contactos.stream()
                .sorted(Comparator.comparing((Contacto c) -> c.getNombre().toLowerCase())
                        .thenComparing(c -> c.getApellido().toLowerCase()))
                .forEach(c -> System.out.println(c.toString()));
    }

    public void buscaContacto(String nombre, String apellido) {
        boolean encontrado = false;

        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre) && c.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println("📞 Teléfono de " + c.getNombre() + " " + c.getApellido() + ": " + c.getTelefono());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("❌ Contacto no encontrado.");
        }
    }

    public void buscaContacto(String nombreBuscado) {
        boolean encontrado = false;

        for (Contacto c : contactos) {
            String nombreCompleto = c.getNombre() + " " + c.getApellido();

            if (c.getNombre().equalsIgnoreCase(nombreBuscado) ||
                    nombreCompleto.equalsIgnoreCase(nombreBuscado)) {

                System.out.println("📞 Teléfono: " + c.getTelefono());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("❌ Contacto no encontrado.");
        }
    }

}//Agenda