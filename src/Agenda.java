public class Agenda {
    private Contacto[] contactos;
    private int totalContactos;

    public boolean agendaLlena() {
        return totalContactos == contactos.length;
    }
}