public class Persona {
//    nombre
    private String name;
//    apellido
    private String surname;

//    constructor pasa por parametro nombre y apellido
    public Persona (String name, String surname){
        this.name = name;
        this.surname = surname;
    }


//    Getters y Setters para cada atributo
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
