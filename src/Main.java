public class Main {
    public static void main(String[] args) {
        Agenda miAgenda = new Agenda();

        // ==========================================================
        // (El objeto base)
        // ==========================================================
        System.out.println("--- 0. PRUEBAS DE CLASE CONTACTO ---");
        Contacto cPrueba = new Contacto("Luis", "Ramirez", "555-0000");
        System.out.println("Objeto creado: " + cPrueba.toString());
        System.out.println("------------------------------------\n");

        // ==========================================================
        //AÑADIR Y EXISTENCIA
        // ==========================================================
        System.out.println("--- 1. AÑADIENDO CONTACTOS ---");
        miAgenda.añadirContacto("José", "Morales", "8100000000");
        miAgenda.añadirContacto("Maria", "González", "8111111111");
        miAgenda.añadirContacto("Ale", "Gomez", "555-1234");
        miAgenda.añadirContacto("Ana", "Zavala", "555-7777");

        System.out.println("\n--- 2. VERIFICANDO EXISTENCIA ---");
        Contacto buscar1 = new Contacto("José", "Morales", "");
        System.out.println("¿Existe José Morales?: " + miAgenda.existeContacto(buscar1));
        System.out.println("¿Existe Juan Perez?: " + miAgenda.existeContacto(new Contacto("Juan", "Perez", "")));

        // ==========================================================
        // 2. (Buscar y Listar) Ale
        // ==========================================================
        System.out.println("\n--- 3. PRUEBAS DE BÚSQUEDA ---");
        miAgenda.buscaContacto("Maria", "González"); // Exacto
        miAgenda.buscaContacto("Ale");               // Flexible

        System.out.println("\n--- 4. LISTADO ALFABÉTICO ---");
        miAgenda.listarContactos();

        // ==========================================================
        // 3. PRUEBAS DE ELIMINACIÓN
        // ==========================================================
        System.out.println("\n--- 5. PRUEBAS DE ELIMINACIÓN ---");
        System.out.println("Eliminando a 'Ale Gomez'...");
        miAgenda.eliminarContacto("Ale", "Gomez");

        System.out.println("\n--- 6. VERIFICACIÓN FINAL (LISTADO) ---");
        // Aquí debe aparecer la lista sin Ale
        miAgenda.listarContactos();

        miAgenda.modificarTelefono("Maria", "González", "999-888-777");
        miAgenda.modificarTelefono("Luis", "Alvarez", "555-000-111");

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
        //agenda.listarContactos(); = 9;

        System.out.println("--- 1. AÑADIENDO CONTACTOS ---");
        miAgenda.añadirContacto("José", "Morales", "8100000000");
        miAgenda.agendaLlena();



    } //método Main
} //Maingit