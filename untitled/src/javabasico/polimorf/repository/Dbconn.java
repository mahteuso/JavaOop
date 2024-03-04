package javabasico.polimorf.repository;

public class Dbconn implements Repo{
    @Override
    public void save() {
        System.out.println("Saving in database");
    }

    @Override
    public void delete() {
        System.out.println("Deleting of database");
    }
}
