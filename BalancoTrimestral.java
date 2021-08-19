public class BalancoTrimestral{
    public static void main(String args[]){
        int gastosJaneiro=15000;
        int gastosFevereiro=23000;
        int gastosMarco=17000;
        int gastosTrimestre= gastosJaneiro + gastosFevereiro + gastosMarco;
        int gastosMensal= gastosTrimestre/3;
        System.out.println("O total do gasto Trimestral foi de " + gastosTrimestre);
        System.out.println("Sendo assim a média do gasto mensal foi de " + gastosMensal);
    }
}