package oppgaver;

class BensinKjøp {
    private String sted;
    private String bensin;
    private double liter;
    private double literPris;
    private String tidspunkt;

    public BensinKjøp(){
        sted = "";
        bensin = "";
        liter = 0;
        literPris = 0;
        tidspunkt = "";
    }

    public BensinKjøp(String sted, String bensin, double liter, double literPris, String tidspunkt){
        this.sted = sted;
        this.bensin = bensin;
        this.liter = liter;
        this.literPris = literPris;
        this.tidspunkt = tidspunkt;
    }

    public String getSted() {
        return sted;
    }

    public String getBensin() {
        return bensin;
    }

    public double getLiter() {
        return liter;
    }

    public double getLiterPris() {
        return literPris;
    }

    public String getTidspunkt() {
        return tidspunkt;
    }

    public void setSted(String sted) {
        this.sted = sted;
    }

    public void setBensin(String bensin) {
        this.bensin = bensin;
    }

    public void setLiter(double liter) {
        this.liter = liter;
    }

    public void setLiterPris(double literPris) {
        this.literPris = literPris;
    }

    public void setTidspunkt(String tidspunkt) {
        this.tidspunkt = tidspunkt;
    }

    public double finnTotalPrisen(){
        double pris = getLiter()*getLiterPris();
        return pris;
    }
}

public class Oppgave3 {
    public static void main(String[] args){
        //BensinKjøp Seb = new BensinKjøp("Oslo","Diesel",100.42,22.24,"13:30");
        BensinKjøp Seb = new BensinKjøp();
        Seb.setSted("Oslo");
        Seb.setBensin("Diesel");
        Seb.setLiter(100.42);
        Seb.setLiterPris(22.24);
        Seb.setTidspunkt("13:30");
        String pris = String.format("%.2f", Seb.finnTotalPrisen());
        System.out.print(pris+" kr");
    }
}