package polymorph;

import ua.com.juja.JujaRobot.FIO;

public class Owner {
    private FIO fio;

    public Owner(FIO fio) {
        this.fio = fio;
    }

    public String toString() {
        return fio.toString();
    }
}
