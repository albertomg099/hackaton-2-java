public class Agenda {
    private Contacto[] contactos;
    private int totalContactos;

    public Agenda() {
        this.contactos = new Contacto[10];
        this.totalContactos = 0;
    }

    public boolean agendaLlena() {
        return totalContactos == contactos.length;
    }
}