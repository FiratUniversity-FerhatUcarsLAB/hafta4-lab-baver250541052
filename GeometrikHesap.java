/*
 * Ad Soyad: [Baver Katar]
 * Ogrenci No: [250541052]
 * Tarih: [06.11.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan geometrik hesapları alır ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

public class GeometrikHesp {
    public static void main(String[] args) throws Exception {
        double pi=3.14;
        double yarıçap=5;
        double dairealanı= pi * yarıçap * yarıçap;
        double daireçevresi= 2 * pi * yarıçap;
        double daireçapı= 2 * yarıçap;
        double kürehacmi= (4/3) * pi * yarıçap * yarıçap * yarıçap;
        double küreyüzeyalanı= 4 * pi * yarıçap * yarıçap;

        System.out.println("Dairenin Alanı: "+dairealanı);
        System.out.println("Dairenin Çevresi: "+daireçevresi);
        System.out.println("Dairenin Çapı: "+daireçapı);
        System.out.println("Kürenin Hacmi: "+kürehacmi);
        System.out.println("Kürenin Yüzey Alanı: "+küreyüzeyalanı);
}
}

