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

        miAgenda.añadirContacto("Alberto", "Morales", "8055555555");
        miAgenda.añadirContacto("Alberto", "Morales", "8055555555");

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

        miAgenda.agendaLlena();
        miAgenda.espacioLibres();

    } //método Main
} //Maingit