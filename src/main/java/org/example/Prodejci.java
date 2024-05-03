package org.example;

public class Prodejci {
    private String jmeno;
    private String narozeni;
    private double smlouvy;
    private double mrkev;
    private String mesto;
    private String spz;
    private double spotreba;
    private String IP;

    public Prodejci(String jmeno, String narozeni, double smlouvy, double mrkev, String mesto, String spz, double spotreba, String IP){
        this.jmeno=jmeno;
        this.narozeni=narozeni;
        this.smlouvy=smlouvy;
        this.mrkev=mrkev;
        this.mesto=mesto;
        this.spz=spz;
        this.spotreba=spotreba;
        this.IP=IP;
    }

    public double getMrkev(){
        return this.mrkev;
    }
    public double getSmlouvy(){
        return this.smlouvy;
    }

    public String getJmeno(){
        return this.jmeno;
    }
    public String getNarozeni(){
        return this.narozeni;
    }
    public String getMesto(){
        return this.mesto;
    }
    public String getSpz(){
        return this.spz;
    }
    public String getIP(){
        return this.IP;
    }

    public double getSpotreba() {
        return this.spotreba;
    }

    public double prumerNaSmlouvu(){
        return getMrkev()/getSmlouvy();
    }

    @Override
    public String toString() {
        return this.jmeno+"/"+this.narozeni+"/"+this.smlouvy+"/"+this.mrkev+"/"+this.mesto+"/"+this.spz+"/"+this.spotreba+"/"+this.IP;
    }
}
