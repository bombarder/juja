package ua.com.juja.a7_polymorph.asd;

import ua.com.juja.a6_oop.FIO;

/**
 * Created by indigo on 31.07.2015.
 */
public class Owner {
    private FIO fio;

    public Owner(FIO fio) {
        this.fio = fio;
    }

    public String toString() {
        return fio.toString();
    }
}
