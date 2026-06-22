//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();


        agenda.contactos[0] = new Contacto("Juan", "Perez", "1234");
        agenda.contactos[1] = new Contacto("Ana", "Lopez", "5678");
        agenda.contactos[2] = new Contacto("Luis", "Garcia", "9012");
        agenda.contactos[3] = new Contacto("Maria", "Torres", "3456");
        agenda.contactos[4] = new Contacto("Pedro", "Ruiz", "7890");
        agenda.contactos[5] = new Contacto("Laura", "Diaz", "1111");
        agenda.contactos[6] = new Contacto("Carlos", "Vega", "2222");
        agenda.contactos[7] = new Contacto("Sofia", "Mora", "3333");
        agenda.contactos[8] = new Contacto("Diego", "Cruz", "4444");
        agenda.contactos[9] = new Contacto("Elena", "Rios", "5555");
        agenda.totalContactos = 10;

        System.out.println(agenda.agendaLlena());
    }
}//class Main