import java.util.Scanner;

public class wicket_keeper extends Batsman {
    private int stumpts;
    private int catches;

    public wicket_keeper(){

    }

    public wicket_keeper(String pname, int pid, int hundred, int fifties, int runs, int catches,int stumpts) {
        super(pname, pid, hundred, fifties, runs);
        this.catches = catches;
        this.stumpts= stumpts;
    }

    public int getCatches() {
        return catches;
    }

    public void setCatches(int catches) {
        this.catches = catches;
    }

    public int getStumpts() {
        return stumpts;
    }

    public void setStumpts(int stumpts) {
        this.stumpts = stumpts;
    }

    @Override
    public void read() {
        super.read();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Stumpts  Catches: ");
        setCatches(sc.nextInt());
        setStumpts(sc.nextInt());

    }

    @Override
    public String toString() {
        return "WKT_Keeper{" +
                "stumpts=" + stumpts +
                ", catches=" + catches +
            '}';
}
}