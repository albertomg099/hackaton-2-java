public class Contacto {

    private static int total;
    private String name;
    private String lastName;
    private int number;

    public Contacto(String name, String lastName, int number){
        int total = total <= 10 ? true : false;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number=" + number +
                '}';
    }
}// class Contacto
