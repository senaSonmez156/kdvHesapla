package kdvHesapla;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		double tutar, kdvOraný=0.18, kdvOraný2=0.8, kdvliTutar, kdvTutarý;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Tutarýnýzý giriniz: ");
		tutar=input.nextDouble();
		kdvTutarý=(tutar<=0 ? 0:tutar>0 && tutar<1000 ? kdvOraný*tutar : kdvOraný2*tutar);
		kdvliTutar=tutar+ kdvTutarý;
		System.out.println(tutar<=0?"Geçersiz sayý ":"Fiþiniz:" );
		System.out.println("KDV'siz tutar: " + tutar);
		System.out.println("KDV Tutarý: " + kdvTutarý);
		System.out.println("KDV'li Tutar: " + kdvliTutar);
		
		
		
		
		
		

	}

}
