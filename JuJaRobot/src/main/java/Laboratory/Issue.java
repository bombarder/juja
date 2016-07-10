package Laboratory;

public class Issue {

    private String name;
    private int countPages;

    public Issue(String name, int countPages) {
        this.name = name;
        this.countPages = countPages;
    }

    public String toPrint() {
        return "Issue{" +
                "name=" + name +
                ",countPages=" + countPages +
                "}";
    }
    public String getName() {
        return name;
    }

    public int getCountPages() {
        return countPages;
    }

}
