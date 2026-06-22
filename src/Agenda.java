
public class Agenda {

    private Contacto[] listaContacto = new Contacto[10];
    private int contadorContacto = 0;

    public void añadirContacto(String name, String lastName, String number){
        if(contadorContacto >= 10){
            System.out.println("La agenda está llena, no se pueden agregar más contactos.");
        }else {
            Contacto nuevo = new Contacto(name, lastName, number);
            listaContacto[contadorContacto] = nuevo;
            contadorContacto++;
            System.out.println("Contacto añadido con éxito.");
        }

    }// metodo añadirContacto
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


}// class Agenda

