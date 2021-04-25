package ademoglu;

import java.util.Scanner;

import ademoglu.Insan.medeniHal;

public class Hayat {
	
	public static void main(String[] args) throws Exception {
		
		//Scanner class program kullanicisindan interactive komut almaya yarayan bir sinif. 
		@SuppressWarnings("resource")
		 // Create a Scanner object
		Scanner myObj = new Scanner(System.in); 
		
		Kadin ayse = new Kadin("Ayse", "Yilmaz", 25, "Basak", medeniHal.BEKAR);
		
		Erkek  ali = new Erkek("Ali", "Kaya", 25, "Terazi", medeniHal.BEKAR);
		
		
		
		System.out.println("Ali ve Ayse bir arkadas ortaminda karsilasir ve tanisirlar");
		
		Insan.tanismak(ayse, ali);
		
		System.out.println("Aralarindaki muhabbet ilerler, ortak arkadaslar, gecmisten hatiralar..."+ali.ad +" ve "+ayse.ad+
				" iyice kaynasirlar.");
		
		System.out.println("Sizce Ali icin Ayse ile ilgili hersey yolunda mi? Evet yada hayir yazin" );
		boolean alininDurumu= IvirZivir.stringtenBooleanCevirici(myObj.nextLine().toLowerCase());
		
		System.out.println("Sizce Ayse icin Ali ile ilgili hersey yolunda mi? Evet yada hayir yazin" );
		boolean ayseninDurumu= IvirZivir.stringtenBooleanCevirici(myObj.nextLine().toLowerCase());
		
		
	    
	   
		
		ali.setHerseyYolunda(alininDurumu);
		ayse.setHerseyYolunda(ayseninDurumu);
		
		
		Insan.setHerseyYolunda(ayse.isHerseyYolunda(), ali.isHerseyYolunda());
		
		if(Insan.herseyYolunda && !ayse.isIliskisiVar()) {
			//Hersey yolunda olduguna gore Ali Ayseye yemekge cikmayi teklif eder...
			ali.yemegeCikalimMi(ayse);
			if(ayse.isKabulEttiMi()) {
				System.out.println("Evet, Olabilir");
				Insan.beraberYemekYemek(ayse, ali);
				System.out.println("Yemekten sonra uzun uzun gorusen ciftimiz artik kendilerinden emindi...");
				ayse.sevmek(ali, true);
				ali.sevmek(ayse, true);
				
				ali.evlenmeTeklifEdiyor(ayse);
				
				if(ayse.isEvlenecekMi()) {
					Insan.evleniyor(ayse, ali);
				}else {
					System.out.println(ali.ad +" biz ayri dunyalarin insanlariyiz..."
							+ "Sen daha iyilerine layiksin...falan filan iste. Anladin sen onu");
				}
				
				System.out.println("Mutlu ciftimiz mutluluklarina mutluluk katmak istiyorlar...");
				
				Cocuk cocuk=Insan.ikiGonulBirOlunca(ayse, ali);
			}else {
				System.out.println("Maalesef bu aralar cok yogunum");
				ayse.odunBuYaa(ali);
				System.err.println("Tanistigimiza memnun oldum. Hosca kalin... Gule gule...");
			}
			
			
		}else {
			System.err.println("Tanistigimiza memnun oldum. Hosca kalin... Gule gule...");
			
		}
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	}

	
	

}
