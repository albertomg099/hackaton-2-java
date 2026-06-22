public class Main {
    public static void main(String[] args) {

        System.out.println("--- 0. PRUEBAS INDIVIDUALES DE LA CLASE CONTACTO ---");

        // 1. Probamos el constructor
        Contacto contactoPrueba = new Contacto("Luis", "Ramirez", "555-0000");

        // 2. Probamos el método toString()
        System.out.println("Contacto creado: " + contactoPrueba.toString());

        // 3. Probamos un Setter y un Getter
        contactoPrueba.setNumber("555-9999"); // Cambiamos el número
        System.out.println("Número actualizado (probando Getter): " + contactoPrueba.getNumber());

        System.out.println("----------------------------------------------------\n");


        // ==========================================================
        // PARTE 1: PRUEBAS DE LA AGENDA (Añadir y Existe)
        // ==========================================================
        Agenda miAgenda = new Agenda();

        System.out.println("--- 1. AÑADIENDO CONTACTOS (Compañero) ---");
        miAgenda.añadirContacto("José", "Morales", "8100000000");
        miAgenda.añadirContacto("Maria", "González", "8111111111");

        //Ale para comprobar búsquedas
        miAgenda.añadirContacto("Ale", "Gomez", "555-1234");
        //comprobar tu ordenamiento alfabético
        miAgenda.añadirContacto("Ana", "Zavala", "555-7777");

        System.out.println("\n--- 2. VERIFICANDO SI EXISTEN (Compañero) ---");
        Contacto contacto1 = new Contacto("Juan", "Perez", "5551234");
        Contacto contacto2 = new Contacto("Carlos", "Gomez", "1112223");

        boolean existeJuan = miAgenda.existeContacto(contacto1);
        boolean existeCarlos = miAgenda.existeContacto(contacto2);

        System.out.println("¿Existe Juan Perez en la agenda?: " + existeJuan);
        System.out.println("¿Existe Carlos Gomez en la agenda?: " + existeCarlos);


        // ==========================================================
        // PRUEBAS DE BÚSQUEDA Y LISTADO Ale
        // ==========================================================
        System.out.println("\n--- 3. PRUEBAS DE BÚSQUEDA ---");

        System.out.println(">> Buscando exactamente a Maria González:");
        miAgenda.buscaContacto("Maria", "González");

        System.out.println("\n>> Buscando de forma flexible a 'Ale':");
        miAgenda.buscaContacto("Ale");

        System.out.println("\n>> Buscando a alguien que no está registrado ('Pedro'):");
        miAgenda.buscaContacto("Pedro");

        System.out.println("\n--- 4. PRUEBA DE LISTADO ALFABÉTICO ---");
        // Debería imprimir : Ale, Ana, José, Maria
        miAgenda.listarContactos();


        // ==========================================================
        // PRUEBA: MODIFICAR TELÉFONO Estef
        // ==========================================================
        System.out.println("\n--- 4. PRUEBA DE MODIFICAR TELÉFONO ---");

        System.out.println(">> Teléfono antes de modificar:");
        miAgenda.buscaContacto("Maria", "González");

        System.out.println("\n>> Modificando teléfono de Maria González...");
        miAgenda.modificarTelefono("Maria", "González", "8199999999");

        System.out.println("\n>> Teléfono después de modificar:");
        miAgenda.buscaContacto("Maria", "González");

        System.out.println("\n>> Intentando modificar un contacto que no existe:");
        miAgenda.modificarTelefono("Pedro", "Lopez", "5555555555");
    }
}