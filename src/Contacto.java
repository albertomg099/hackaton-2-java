public class Contacto {
<<<<<<< HEAD

    private String name;
    private String lastName;
    private String number;


    public Contacto(String name, String lastName, String number){
        this.name = name;
        this.lastName = lastName;
        this.number = number;
    }//Contructor Contacto


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number='" + number + '\'' +
                '}';
    }



}// class Contacto
=======
    private String nombre;
    private String apellido;
    private String telefono;

    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
}
>>>>>>> 7388e62de9fa28f1772830a148378ff0aceed859
