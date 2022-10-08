import java.util.Scanner;
public class AtmService {

    static Scanner s = new Scanner(System.in);


    static void myVersamento() {
        Atm atm = new Atm();
        atm.getSaldo();

        System.out.println("inserire importo...");
        int importoVersamento = atm.setVersamento(s.nextInt());

        if (importoVersamento < atm.getSaldo()) {
            System.out.println("operazione riuscita");

        } else {
            System.out.println("operazione non riuscita \n continuare? \n 1)Si \n 2)No");
            int risposta= s.nextInt();
            switch (risposta){
                case 1:
                    System.out.println("Inserire l'importo da versare...");
                    int importoVersamento2 = atm.setVersamento(s.nextInt());
                    if(importoVersamento2<atm.getSaldo()){
                        System.out.println("operazione riuscita");

                    }else{
                        System.out.println("operazione non riusciota");
                    }
                    break;
                case 2:
                    System.out.println("grazie per aver scelto..."); break;
            }
        }
    }

    static void myPrelievo() {
        Atm atm = new Atm();
        atm.getSaldo();

        System.out.println("inserire importo da prelevare...");
        int importoPrelievo = atm.setPrelievo(s.nextInt());
        if (importoPrelievo > atm.getSaldo()) {
            System.out.println("operazione non riuscita \n continuare? \n 1)Si \n 2)No");
            int risposta= s.nextInt();
            switch(risposta) {
                case 1:
                    System.out.println("Inserire l'importo da prelevare...");
                    int importoPrelievo2 = atm.setPrelievo(s.nextInt());
                    if (importoPrelievo2 < atm.getSaldo()) {
                        System.out.println("operazione riuscita");
                    } else {
                        System.out.println("Operazione non riuscita");
                    }
                    break;
                case 2:
                    System.out.println("Grazie per aver scelto...");
                    break;
            }

        } else {
            System.out.println("operazione non riuscita");}

    }
    public void mySaldo(){
        Atm atm =new Atm();
        atm.getSaldo();
        System.out.println(atm.getSaldo());
    }
}