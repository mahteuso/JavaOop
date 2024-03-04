package javabasico.interfaces.test;

import javabasico.interfaces.dominio.DataBaseLoader;

public class DataTest01 {
    public static void main(String[] args) {
        DataBaseLoader data01 = new DataBaseLoader();
        data01.load();
        data01.print();

        data01.checkPermission();
    }
}
