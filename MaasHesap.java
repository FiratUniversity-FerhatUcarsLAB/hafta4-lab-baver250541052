Ad Soyad: [Baver Katar]
 * Ogrenci No: [250541052]
 * Tarih: [06.11.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan geometrik hesapları alır ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

  public class MaasHesap {
    public static void main(String[] args) throws Exception {
        double temelMaas = 3000;
        double zamOrani = 0.10;
        double yeniMaas = temelMaas + (temelMaas * zamOrani);
        double vergiOrani = 0.15;
        double vergiMiktari = yeniMaas * vergiOrani;
        double netMaas = yeniMaas - vergiMiktari;

        System.out.println("Yeni Maaş: " + yeniMaas);
        System.out.println("Vergi Miktarı: " + vergiMiktari);
        System.out.println("Net Maaş: " + netMaas);
    }
}

