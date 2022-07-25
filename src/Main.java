public class Main {
    public static void main(String[] args) {
        int[] test= {1, 3, 1, 4, 23};
        AltKumeKontrolu a=new AltKumeKontrolu();
        boolean altKumeVarMi=a.siraliAltKumeVarMi(test,8);
        if(altKumeVarMi){
            System.out.println("Sirali bir alt kume mevcut.");
        }else {
            System.out.println("Sirali bir alt kume mevcut degil.");

        }
    }
}