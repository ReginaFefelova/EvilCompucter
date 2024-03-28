
public class Main {
    public static void main(String[] args) {
        Greeting.robCO();
        Logic.first(false);
        Logic.second();
        Logic.third();
        famousPerson.ask();
        Dance.dance();
        for (Persons person : Persons.values()) {
            person.show(person.ordinal());
        }
    }
}
