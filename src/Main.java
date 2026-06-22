public class Main {
    public static void main(String[] args) {
        Agenda miAgenda = new Agenda();

        miAgenda.añadirContacto("José", "Morales", "8100000000");
        miAgenda.añadirContacto("Maria", "González", "8111111111");

        Contacto contacto1 = new Contacto("Juan", "Perez", "5551234");
        Contacto contacto2 = new Contacto("Carlos", "Gomez", "1112223");


        boolean existeJuan = miAgenda.existeContacto(contacto1);
        boolean existeCarlos = miAgenda.existeContacto(contacto2);


        System.out.println("¿Existe Juan Perez en la agenda?: " + existeJuan);
        System.out.println("¿Existe Carlos Gomez en la agenda?: " + existeCarlos);




    }// metodo Main
}// class Main