package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Prodejci>list = new ArrayList<>();
        Prodejci prodejce1 = new Prodejci("Tomáš",new Datum("1995-05-05"), 15,0.5,"Brno","8BR984",7.5,"192.168.48.39");
        list.add(prodejce1);
        System.out.println(prodejce1);
        System.out.println(prodejce1.prumerNaSmlouvu());
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Pro vytvoření prodejce zadejte jméno, pro ukončení programu napiště stop");
            String input = scanner.nextLine();
            if(input.equals("stop")){
                break;
            }
            String narozeni = "";
            do{
                System.out.println("Narození: (formát YYYY-MM-DD)");
                narozeni=scanner.nextLine();
            }while(!narozeni.matches("\\d{4}-\\d{2}-\\d{2}"));
            System.out.println("Počet smluv: ");
            String smlouvy = scanner.nextLine();
            double smlouvyDouble = Double.parseDouble(smlouvy);
            System.out.println("Počet tun: ");
            String mrkev = scanner.nextLine();
            double mrkevDouble = Double.parseDouble(mrkev);
            System.out.println("Město: ");
            String mesto = scanner.nextLine();
            System.out.println("SPZ: ");
            String spz = scanner.nextLine();
            System.out.println("Spotřeba: ");
            String spotreba = scanner.nextLine();
            double spotrebaDouble = Double.parseDouble(spotreba);
            System.out.println("IP: ");
            String IP = scanner.nextLine();
            list.add(new Prodejci(input,new Datum(narozeni),smlouvyDouble,mrkevDouble,mesto,spz,spotrebaDouble,IP));
        }

        for (Prodejci prodejci : list) {
            System.out.println(prodejci);
            System.out.println(prodejci.prumerNaSmlouvu());
            System.out.println();
        }
    }
}