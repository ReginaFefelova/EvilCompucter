import java.io.Serializable;

public enum Persons implements Serializable{
    DIRECTOR_ONE("""
            
            """);
    private String person;
    Persons(String person) {this.person = person;}
    public void show()
    {
        System.out.println(person);
    }
}