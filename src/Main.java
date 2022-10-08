import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        Atm atm =new Atm();
        atm.getSaldo();

        System.out.println("che operazione si vuole effettuare? \n 1)versamento \n 2)prelievo \n 3)saldo");
        int risposta1 =s.nextInt();

        switch (risposta1){
            case 1: AtmService.myVersamento();  break;
            case 2: AtmService.myPrelievo();break;
            case 3: System.out.println(atm.getSaldo());break;
        }
        System.out.println("continnuare con altre operazionni? \n 1)Si \n 2)No");
        int risposta2 =s.nextInt();
        switch(risposta2){
            case 1:  System.out.println("che operazione si vuole effettuare? \n 1)versamento \n 2)prelievo \n 3)saldo");
                int risposta =s.nextInt();

                switch (risposta){
                    case 1: AtmService.myVersamento();  break;
                    case 2: AtmService.myPrelievo();break;
                    case 3: System.out.println(atm.getSaldo());break;
                }break;
            case 2:
                System.out.println("stampare la ricevuta? \n 1)Si \n 2)No");
                int risposta3 = s.nextInt();
                switch (risposta3){
                    case 1: System.out.println("Stampa in corso \n Grazie per aver scelto..."); break;
                    case 2: System.out.println("Grazie per aver scelto...");
                }}
        System.out.println("stampare la ricevuta? \n 1)Si \n 2)No");
        int risposta3 = s.nextInt();
        switch (risposta3){
            case 1: System.out.println("Stampa in corso \n Grazie per aver scelto..."); break;
            case 2: System.out.println("Grazie per aver scelto...");
        }
    }
}
