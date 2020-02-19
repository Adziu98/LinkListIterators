package com.piechowicz.adam2;


import static com.piechowicz.adam2.Main.printList;

public class listaTest {


    public static void main(String[] args) {
        Main test = new Main();
        test.wstawNaPoczatek("test");
        test.wstawNaPoczatek("test1");
        test.wstawNaPoczatek("test2");
        test.wstawNaPoczatek(10);
        test.wstawNaPoczatek(10);
        test.wstawNaPoczatek(10);
        printList(test);
    }

}
