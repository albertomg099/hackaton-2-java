public class Agenda {
    public Contacto[] contactos;
    public int totalContactos;

    public Agenda() {
        this.contactos = new Contacto[10];
        this.totalContactos = 0;
    }

    public boolean agendaLlena() {
        return totalContactos == contactos.length;
    }
}