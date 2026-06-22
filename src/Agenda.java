import java.util.Arrays;
import java.util.Comparator;

public class Agenda {

    private Contacto[] listaContacto = new Contacto[10];
    private int contadorContacto = 0;

    public void añadirContacto(String name, String lastName, String number) {
        if (contadorContacto >= 10) {
            System.out.println("La agenda está llena, no se pueden agregar más contactos.");
        } else {
            Contacto nuevo = new Contacto(name, lastName, number);
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

        //solo contactos reales para poder ordenarlos
        Contacto[] contactosActivos = Arrays.copyOf(listaContacto, contadorContacto);

        // Ordenamos alfabéticamente
        Arrays.sort(contactosActivos, Comparator.comparing((Contacto c) -> c.getName().toLowerCase())
                .thenComparing(c -> c.getLastName().toLowerCase()));

        // Imprimimos get
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

        if (!encontrado) {
            System.out.println("❌ Contacto no encontrado.");
        }
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

        if (!encontrado) {
            System.out.println("❌ Contacto no encontrado.");
        }
    }

}