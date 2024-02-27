package polimorf.repository;

public class File implements Repo{
    @Override
    public void save() {
        System.out.println("Saving to file");
    }

    @Override
    public void delete() {
        System.out.println("Delete file");
    }
}
