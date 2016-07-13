package polymorph.staff;

public class FIO {

    private String firstName;
    private String secondName;

    public FIO(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String toString(){
        return firstName + " " + secondName;
    }
}
