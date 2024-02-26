package interfaces.dominio;

public interface DataLoader {
    void load();
    void print();

    default void checkPermission(){
        System.out.println("Performing the database check");
    }
}
