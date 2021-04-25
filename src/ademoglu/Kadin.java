package ademoglu;

import java.util.ArrayList;
import java.util.List;

public class Kadin extends Insan{

	
	static boolean alisverisSeverMi;
	
	private Erkek sevdigiErkek;
	
	private boolean iliskisiVar;
	
	private List<Erkek> tanidigiErkekler;
	
	private boolean kabulEttiMi;
	
	private boolean evlenecekMi;
	
	private boolean herseyYolunda;

	
	public Kadin(String ad, String soyad, int yas, String burc, medeniHal bekar) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		this.burc = burc;
		this.medeniHali=bekar;
		setTanidigiErkekler(new ArrayList<>());
	}
	
	

	@Override
	public void yemek() {
		System.out.println(this.ad + " yemek yedi, doydu ve \"Elhamdulillah\" dedi");
		
	}

	@Override
	public void icmek() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ihtiyacGidermek() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void tanimak(Object o) {
		getTanidigiErkekler().add((Erkek) o);
		System.out.println("Tanistigimiza memnun oldum "+((Erkek) o).ad);
		
	}



	@Override
	public boolean sevmek(Object o, boolean sevdiMi) {
		Erkek erkek = (Erkek) o;
	 
		if(sevdiMi) {
			
			setSevdigiErkek(erkek);
			
		}else {
			System.out.println(erkek.ad+" sevilen erkek degil");
		}
		return sevdiMi;
	}



	public List<Erkek> getTanidigiErkekler() {
		return tanidigiErkekler;
	}



	public void setTanidigiErkekler(List<Erkek> tanidigiErkekler) {
		this.tanidigiErkekler = tanidigiErkekler;
	}



	public Erkek getSevdigiErkek() throws Exception {
		if(sevdigiErkek!=null) {
			return sevdigiErkek;
		}else{
			throw new Exception("Sevdigi kimse yok");
		}
		
	}
/**
 * Odun interface i kullanilarak bu erkegin ozelliklerini tasiyan bir odun olusturuldu.
 * @param erkek
 * @return
 */
	public Odun odunBuYaa(Erkek erkek) {
		Odun odun = new Erkek(erkek.ad, erkek.soyad, erkek.yas, erkek.burc, medeniHal.BEKAR);
		System.out.println("Ayse icinden der: "+erkek.ad +" tam bi odun yaa");
		return odun;
		
	}


	public void setSevdigiErkek(Erkek sevdigiErkek) {
		System.out.println(sevdigiErkek.ad+" sevilen erkek olarak belirlendi");
		this.sevdigiErkek = sevdigiErkek;
	}
	
	public boolean isKabulEttiMi() {
		return kabulEttiMi;
	}



	public void setKabulEttiMi(boolean kabulEttiMi) {
		this.kabulEttiMi = kabulEttiMi;
	}



	public boolean isIliskisiVar() {
		return iliskisiVar;
	}



	public void setIliskisiVar(boolean iliskisiVar) {
		this.iliskisiVar = iliskisiVar;
	}

	public boolean isEvlenecekMi() {
		return evlenecekMi;
	}



	public void setEvlenecekMi(boolean evlenecekMi) {
		this.evlenecekMi = evlenecekMi;
	}



	public boolean isHerseyYolunda() {
		return herseyYolunda;
	}



	public void setHerseyYolunda(boolean herseyYolunda) {
		this.herseyYolunda = herseyYolunda;
	}
	
	
	
	
	
	

}
