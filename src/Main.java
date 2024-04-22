public class Main {

    public static void main(String[] args) {
        printSomeMessage("Hello git lection");

        printName("Nikita");
        printSurname("Some surname");

        Person person = new Person(1997,"Some name");
        System.out.println(person.toString());
    }

    public static void printSomeMessage(String message){
        System.out.println(message);
    }

    public static void printName(String name){
        System.out.println("Name is " + name);
    }

    public static void printSurname(String surname){
        System.out.println("Surname is " + surname);
    }


}
