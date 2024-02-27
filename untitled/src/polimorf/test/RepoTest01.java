package polimorf.test;

import polimorf.repository.Dbconn;
import polimorf.repository.File;
import polimorf.repository.Memory;
import polimorf.repository.Repo;

public class RepoTest01 {
    public static void main(String[] args) {
        Repo repository = new Dbconn();
        repository.save();
        repository.delete();
        System.out.println("---------------");
        Repo repository2 = new File();
        repository2.save();
        repository2.delete();
        System.out.println("---------------");
        Repo repository3 = new Memory();
        repository3.save();
        repository3.delete();
        System.out.println("---------------");
    }
}
