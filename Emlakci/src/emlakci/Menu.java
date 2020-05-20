
package emlakci;

import java.util.Scanner;

public class Menu {
    boolean klima ;
    int pencere ;
    Scanner scanner = new Scanner(System.in);

    public Menu() {


        String islemler = "Denizli'nin en güvenilir emlakçısına hoşgeldiniz...\n"
            + "2 oda 1 salon için 1'e\n"
            + "3 oda 1 salon için 2'ye\n"
            + "4 oda 1 salon için 3 'e .\n"
            + "Çıkış için q ya basınız ";

        while (true) {
            System.out.println(islemler);
            System.out.print("Hangi daireyi istiyorsunuz  : ");
            String sekil_turu = scanner.nextLine();
            Daire daire = null;
            if (sekil_turu.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            } else if (sekil_turu.equals("1")) {
                klimaVePencere();
                daire = new IkiOda(pencere, klima);
                daire.fiyatHesapla();
                System.out.println("İki odalı bir salonlu daireniz "+daire.hesap+" TL'dir.Bizi tercih ettiğiniz için teşekürler.");
                break ;
            } else if (sekil_turu.equals("2")) {
                klimaVePencere();
                daire = new UcOda(pencere, klima); 
                daire.fiyatHesapla();
                System.out.println("Üç oda bir salonlu daireniz "+daire.hesap+" TL'dir.Bizi tercih ettiğiniz için teşekürler.");
                break ;

            } else if (sekil_turu.equals("3")) {
                 klimaVePencere("Ucuz fiyata dört oda bir salon aldınız.");
                 daire = new DortOda(pencere, klima);
                 daire.fiyatHesapla();
                 System.out.println("Dört odalı bir salonlu daireniz "+daire.hesap+" TL'dir.Bizi tercih ettiğiniz için teşekürler.");
                 break ;


            } else {
                System.out.println("Geçersiz İşlem....");
            }

        }
    }private void klimaVePencere(){
         while(true){
            System.out.println("Klima istiyor musunuz ? (evet veya hayir)");
            String klima = scanner.nextLine();
            if (klima.equals("evet")) {
                this.klima = true ;
                break ;
            }else if(klima.equals("hayir")) {
                this.klima = false ;
                break ;
            }System.out.println("Lütfen evet veya hayir yazınız.");
         }
         while(true){
            System.out.println("Pencere sayısını giriniz ? (2 ile 10 arası olsun)");
            int pencere = scanner.nextInt();
            if (pencere <=10 && pencere>=2) {
                this.pencere = pencere ;
                break ;
            }System.out.println("Lütfen 2 ile 10 arasında bir sayı yazınız.");
         }
            
    }
    private void klimaVePencere(String parali){
         while(true){
            System.out.println("Klima istiyor musunuz ? (evet veya hayir)");
            String klima = scanner.nextLine();
            if (klima.equals("evet")) {
                this.klima = true ;
                break ;
            }else if(klima.equals("hayir")) {
                this.klima = false ;
                break ;
            }System.out.println("Lütfen evet veya hayir yazınız.");
         }
         while(true){
            System.out.println("Pencere sayısını giriniz ? (2 ile 10 arası olsun)");
            int pencere = scanner.nextInt();
            if (pencere <=10 && pencere>=2) {
                this.pencere = pencere ;
                break ;
            }System.out.println("Lütfen 2 ile 10 arasında bir sayı yazınız.");
         }System.out.println(parali);
            
    }
}
