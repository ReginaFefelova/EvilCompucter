
public class Main {
    public static void main(String[] args) {
        Greeting.robCO();
        Logic.first(false);
        Logic.second();
        Logic.third();
        famousPerson.ask();
        Dance.dance();
        SmoothText.print("\nНасколько хорошо вы знаете известных людей и двигаетесь, я понял\nНо насколько знакомы с самыми известными лицами?\nНазовите ФИО следующих личностей ГУИМЦ\n");
        for (TheBestPersons person : TheBestPersons.values()) {
            person.show(person.ordinal());

        }
    }
}
