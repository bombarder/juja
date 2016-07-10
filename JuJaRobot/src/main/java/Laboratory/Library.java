package Laboratory;

public class Library {

    String result = "";

    public String getIssueWithCountPagesMoreN(Issue[] catalog, int barrierCountPages) {
        for (int i = 0; i < catalog.length ;i++) {
            if (catalog[i].getCountPages() > barrierCountPages){
                result = result + catalog[i].toPrint();
            }
        }
        return result;
    }
}
