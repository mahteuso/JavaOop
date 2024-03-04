package javabasico.polimorf.repository;

public class Memory implements Repo{
    @Override
    public void save() {
        System.out.println("Saving to memory");
    }

    @Override
    public void delete() {
        System.out.println("Deleting from memory");
    }
}
