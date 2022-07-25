public class AltKumeKontrolu {
    boolean siraliAltKumeVarMi(int[] sayilar, int ulasilacakToplam) {
        int toplam=0;
        boolean resultFound=false;

        for (int i = 0; i < sayilar.length; i++) {
            toplam=0;

            for (int j = i; i + j < sayilar.length; j++) {
                toplam += sayilar[j];
                if (toplam == ulasilacakToplam) {
                    resultFound=true;
                    break;
                }
                else if(toplam>ulasilacakToplam){
                    resultFound=false;
                    break;
                }

            }
            if(resultFound){
                break;
            }

        }

        return resultFound;
    }



}
