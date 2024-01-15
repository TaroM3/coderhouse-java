import java.util.*;


public class ListarPersonasMelillo {
    public static void main(String[] args) {

        //Creo 5 objetos Persona
        Persona person1 = new Persona("Juan", "Fernandez");
        Persona person2 = new Persona("Diego","Suarez");
        Persona person3 = new Persona("Jose","Esquivel");
        Persona person4 = new Persona("Milagros","Rosales");
        Persona person5 = new Persona("Celeste", "Jimenez");

        //Agrego personas a la lista
        List<Persona> personaList = new ArrayList<Persona>();
        personaList.add(person1);
        personaList.add(person2);
        personaList.add(person3);
        personaList.add(person4);
        personaList.add(person5);


        //creo una variable booleana que
        boolean isMenuOpened = true;

        //muestra un menu que se imprima por lo menos una vez
        do{
            //muestra las opciones por consola
            System.out.println("1. Sort the list alphabetically by Name");
            System.out.println("2. Sort the list alphabetically by Surname");
            System.out.println("3. sort the list reverse alphabetically by Surname");
            System.out.println("4. Exit");

            System.out.println("Please select an option: ");

            //abro un try catch porque el scanner puede arrojar excepciones
            try{

                //crea una instancia del objeto scanner para leer por consola
                Scanner scanner = new Scanner(System.in);

                //lee por consola la siguiente linea
                String option = scanner.nextLine();

                    switch (option) {
                        case "1":
                            // imprime la siguiente linea para separar las listas
                            System.out.println("============List============");
                            //ordena la lista pasada por parametro, toma como referencia la funcion lambda para hacer la comparacion y ordenar por los nombres de los objetos persona
                            Collections.sort(personaList,
                                    (Persona p1, Persona p2) -> p1.getName().compareTo(p2.getName())
                            );
                            //imprime la lista de personas ordenada
                            personaList.forEach((persona) -> System.out.println("Name: " + persona.getName() + " Surname: " + persona.getSurname()));
                            //el valor de la variable isMenuOpened pasa a false para poder cerrar el bucle do while
                            isMenuOpened = false;
                            break;
                        case "2":
                            // imprime la siguiente linea para separar las listas
                            System.out.println("============List============");
                            //ordena la lista pasada por parametro, toma como referencia la funcion lambda para hacer la comparacion y ordenar por los apellidos de los objetos persona
                            Collections.sort(personaList,
                                    (Persona p1, Persona p2) -> p1.getSurname().compareTo(p2.getSurname())
                            );
                            //imprime la lista de personas ordenada
                            personaList.forEach((persona) -> System.out.println("Name: " + persona.getName() + " Surname: " + persona.getSurname()));
                            //el valor de la variable isMenuOpened pasa a false para poder cerrar el bucle do while
                            isMenuOpened = false;
                            break;
                        case "3":
                            // imprime la siguiente linea para separar las listas
                            System.out.println("============List============");
                            //ordena la lista pasada por parametro, Collections.reverseOrder toma como referencia la funcion lambda para hacer la comparacion y ordenar inversamente por los apellidos de los objetos persona
                            Collections.sort(personaList,
                                    Collections.reverseOrder((Persona p1, Persona p2) -> p1.getSurname().compareTo(p2.getSurname()))
                            );
                            personaList.forEach((persona) -> System.out.println("Name: " + persona.getName() + " Surname: " + persona.getSurname()));
                            //el valor de la variable isMenuOpened pasa a false para poder cerrar el bucle do while
                            isMenuOpened = false;
                            break;
                        case "4":
                            System.out.println("See you next time. . . ");
                            //el valor de la variable isMenuOpened pasa a false para poder cerrar el bucle do while
                            isMenuOpened = false;

                            break;
                        default:
                            System.out.println(option + " is not an option, " + option);
                    }

                //cierro la instancia del objeto scanner
                scanner.close();
            } catch(Exception e) {
                e.printStackTrace();
            }

        }while(isMenuOpened);

    }
}
