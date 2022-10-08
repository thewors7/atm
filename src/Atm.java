public class Atm {
    private int saldo = 1000;  //saldo contabile

    private int prelievo; //prelievo

    private int versamento; //versamento



    public int getPrelievo() {
        return prelievo;
    }

    public int setPrelievo(int prelievo) {
        this.prelievo = prelievo;
        return prelievo;
    }
    public int getVersamento() {
        return versamento;
    }

    public int setVersamento(int versamento) {
        this.versamento = versamento;
        return versamento;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
