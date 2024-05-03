package org.example;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Prodejci {
    private final String jmeno;
    private final Datum narozeni;
    private final double smlouvy;
    private final double mrkev;
    private final String mesto;
    private final String spz;
    private final double spotreba;
    private final String IP;

    public Prodejci(String jmeno, Datum narozeni, double smlouvy, double mrkev, String mesto, String spz, double spotreba, String IP){
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
    public Datum getNarozeni(){
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
