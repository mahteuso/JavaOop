package interfaces.test;

import interfaces.dominio.DataBaseLoader;
import interfaces.dominio.DataLoader;

public class DataTest01 {
    public static void main(String[] args) {
        DataBaseLoader data01 = new DataBaseLoader();
        data01.load();
        data01.print();

        data01.checkPermission();
    }
}
