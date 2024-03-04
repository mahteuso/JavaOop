package javabasico.cursojava.dominio;

public class Estudante {
    protected String name;
    protected int age;
    protected char sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Estudante(String nameEstudante){
        name = nameEstudante;
    }

    public void imprimiEstudante(){
        System.out.println("Name: "+this.name+"\nAge: "+this.age+"\nsex: "+this.sex );
    }
}
