package ademoglu;

import java.util.Scanner;
import ademoglu.Cocuk.cins;
/**
 * Abstract class Insan, cinsiyet farketmeksizin gelen gecer insan activitelerini duzenleyen ve iki cinsin de ortak yaptigi ve aldigi 
 * kararlari icerek sinif. Erkek ve Kadin siniflari bu Insan sinifini "extend" ederek buradaki butun abstract methodlari kendi methoduymus
 * gibi kullanabiliyor buna da inharitance deniyor. 
 * @author cagrikahraman
 *
 */
public abstract class Insan {
	
	String ad;
	String soyad;
	int yas;
	String burc;
	medeniHal medeniHali;
	static boolean herseyYolunda;
	Scanner myObj = new Scanner(System.in); 
	
	public boolean isHerseyYolunda() {
		return herseyYolunda;
	}

	public static void setHerseyYolunda(boolean kadinHerseyYolunda, boolean erkekHerseyYolunda) {
		//Kadin.setHerseyYolunda(kadinHerseyYolunda, erkekHerseyYolunda);
		if(kadinHerseyYolunda && erkekHerseyYolunda)
		herseyYolunda = true;
		else
			herseyYolunda = false;
	}

	public enum medeniHal{
		BEKAR, EVLI, DUL
	}
	
	
	
	public static boolean insanAldanirMi = true;
	
	public static boolean sevenKiskanirMi;
	
	public static Cocuk ikiGonulBirOlunca(Kadin kadin, Erkek erkek) throws Exception {
		Cocuk cocuk;
		if(kadin.medeniHali==medeniHal.EVLI && erkek.medeniHali==medeniHal.EVLI && 
				erkek.getSevdigiKadin()==kadin && kadin.getSevdigiErkek()==erkek) {
			System.out.println("Iki gonul bir olunca samanlik seyran olur");
			
			 cocuk = new Cocuk("Hayat", cins.KIZ);
		}else {
			return null;
		}
		
		return cocuk;
	}
	
	public abstract void yemek();
	
	public abstract void icmek();
	
	public abstract void ihtiyacGidermek();
	
	public static void tanismak(Kadin kadin, Erkek erkek) {
		
		System.out.println("Merhaba ben "+erkek.ad);
		System.out.println("Merhaba ben "+kadin.ad);
		
		kadin.tanimak(erkek);
		
		erkek.tanimak(kadin);
		
		
	}
	
	public abstract void tanimak(Object o);
	public abstract boolean sevmek(Object o, boolean sevdiMi);
	
	public static void alisverisYapmak(Kadin kadin) {
		
	}
	
	public static void beraberYemekYemek(Kadin kadin, Erkek erkek) {
		System.out.println(kadin.ad +" ve "+erkek.ad +" berber yemek yediler.");
		kadin.yemek();
		erkek.yemek();
		
	}
	
	public static void evleniyor(Kadin kadin, Erkek erkek) {
		kadin.medeniHali=medeniHal.EVLI;
		erkek.medeniHali=medeniHal.EVLI;
		System.out.println(erkek.ad +" ve "+kadin.ad+" evleniyor");
	}


}
