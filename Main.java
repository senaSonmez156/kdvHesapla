package kdvHesapla;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		double tutar, kdvOran�=0.18, kdvOran�2=0.8, kdvliTutar, kdvTutar�;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Tutar�n�z� giriniz: ");
		tutar=input.nextDouble();
		kdvTutar�=(tutar<=0 ? 0:tutar>0 && tutar<1000 ? kdvOran�*tutar : kdvOran�2*tutar);
		kdvliTutar=tutar+ kdvTutar�;
		System.out.println(tutar<=0?"Ge�ersiz say� ":"Fi�iniz:" );
		System.out.println("KDV'siz tutar: " + tutar);
		System.out.println("KDV Tutar�: " + kdvTutar�);
		System.out.println("KDV'li Tutar: " + kdvliTutar);
		
		
		
		
		
		

	}

}
