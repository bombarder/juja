package polymorph;

import polymorph.staff.FIO;

public class Owner {
    private FIO fio;

    public Owner(FIO fio) {
        this.fio = fio;
    }

    public String toString() {
        return fio.toString();
    }
}
