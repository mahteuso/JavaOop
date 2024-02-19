package cursojava.classes;

public class Aluno {
    public String name;
    public int age;
    public String dateBorn;
    public String rg;
    public String cpfNumber;

    public Aluno(String firstName, String lastName){
        name = firstName+lastName;
    }
}
