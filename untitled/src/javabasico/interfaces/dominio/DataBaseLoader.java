package javabasico.interfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{

    @Override
    public void remove() {
        System.out.println("Data was remove from database");
    }

    @Override
    public void load() {
        System.out.println("Loading data from database");
    }

    @Override
    public void print() {
        System.out.println("Here are all data from database");
    }

    @Override
    public void checkPermission() {
        System.out.println("Overriding default method of DataLoader interface");
    }
}
