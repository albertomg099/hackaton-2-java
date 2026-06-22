public class Main {
    public static void main(String[] args) {
        Agenda miAgenda = new Agenda();

        // ==========================================================
        // prueba Alberto (Añadir y Existe)
        // ==========================================================
        System.out.println("--- 1. AÑADIENDO CONTACTOS (Compañero) ---");
        miAgenda.añadirContacto("José", "Morales", "8100000000");
        miAgenda.añadirContacto("Maria", "González", "8111111111");

        // Agregamos a Ale para comprobar tus búsquedas
        miAgenda.añadirContacto("Ale", "Gomez", "555-1234");
        // Agregamos otro con "Z" para comprobar tu ordenamiento alfabético
        miAgenda.añadirContacto("Ana", "Zavala", "555-9999");

        System.out.println("\n--- 2. VERIFICANDO SI EXISTEN (Compañero) ---");
        Contacto contacto1 = new Contacto("Juan", "Perez", "5551234");
        Contacto contacto2 = new Contacto("Carlos", "Gomez", "1112223");

        boolean existeJuan = miAgenda.existeContacto(contacto1);
        boolean existeCarlos = miAgenda.existeContacto(contacto2);

        System.out.println("¿Existe Juan Perez en la agenda?: " + existeJuan);
        System.out.println("¿Existe Carlos Gomez en la agenda?: " + existeCarlos);


        // ==========================================================
        // Prueba Ale
        // ==========================================================
        System.out.println("\n--- 3. PRUEBAS DE BÚSQUEDA (Kevin) ---");

        System.out.println(">> Buscando exactamente a Maria González:");
        miAgenda.buscaContacto("Maria", "González");

        System.out.println("\n>> Buscando de forma flexible a 'Ale':");
        miAgenda.buscaContacto("Ale");

        System.out.println("\n>> Buscando a alguien que no está registrado ('Pedro'):");
        miAgenda.buscaContacto("Pedro");

        System.out.println("\n--- 4. PRUEBA DE LISTADO ALFABÉTICO (Kevin) ---");
        // Debería imprimir en este orden: Ale, Ana, José, Maria
        miAgenda.listarContactos();

    }
}