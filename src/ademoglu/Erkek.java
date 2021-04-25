package ademoglu;

import java.util.ArrayList;
import java.util.List;

public class Erkek extends Insan implements Odun{
	
	private List<Kadin> tanidigiKadinlar;
	
	private Kadin sevdigiKadin;
	
	private boolean herseyYolunda;
	
	public void evlenmeTeklifEdiyor(Kadin kadin) throws Exception {
		System.out.println(this.ad +" evlenme teklif ediyor...");
		if(kadin.getSevdigiErkek() != null && kadin.getSevdigiErkek().equals(this)) {
			kadin.setEvlenecekMi(true);
			System.out.println(kadin.ad+" teklifi kabul ediyor");
		}else {
			kadin.setEvlenecekMi(false);
		}
	}
	

	public Erkek(String ad, String soyad, int yas, String burc, medeniHal bekar) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		this.burc = burc;
		this.medeniHali= bekar;
		setTanidigiKadinlar(new ArrayList<>());
		
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
		getTanidigiKadinlar().add((Kadin) o);
		System.out.println("Tanistigimiza memnun oldum "+((Kadin) o).ad);
		
	}

	@Override
	public boolean sevmek(Object o, boolean sevdiMi) {
		if(sevdiMi) {
			setSevdigiKadin((Kadin)o);
		}
		
		
		// TODO Auto-generated method stub
		return sevdiMi;
	}

	public List<Kadin> getTanidigiKadinlar() {
		return tanidigiKadinlar;
	}

	public void setTanidigiKadinlar(List<Kadin> tanidigiKadinlar) {
		this.tanidigiKadinlar = tanidigiKadinlar;
	}

	public Kadin getSevdigiKadin() throws Exception {
		if(sevdigiKadin!=null) {
			return sevdigiKadin;
		}else{
			throw new Exception("Sevdigi kimse yok");
		}
		
	}

	public void setSevdigiKadin(Kadin sevdigiKadin) {
		System.out.println(this.ad + " "+ sevdigiKadin.ad+"' i seviyor");
		this.sevdigiKadin = sevdigiKadin;
	}
	
	public boolean yemegeCikalimMi(Kadin kadin) throws Exception {
		if(!kadin.isIliskisiVar() && kadin.isHerseyYolunda()) {
			System.out.println(this.ad + ":Eger istersen, beraber bir yemek yiyebilir miyiz?");
			System.out.println("Sizce Ayse bu teklifi kabul etsin mi? Evet yada hayir yazin" );
			boolean kabulEtsinMi= IvirZivir.stringtenBooleanCevirici(myObj.nextLine().toLowerCase());
			kadin.setKabulEttiMi(kabulEtsinMi);
			return true;
		}else {
			System.out.println(this.ad + ": Tanistigimiza memnun oldum yine gorusmek dilegiyle kandine iyi bak...");
			kadin.setKabulEttiMi(false);
			return false;
		}
	}

	public boolean isHerseyYolunda() {
		return herseyYolunda;
	}

	public void setHerseyYolunda(boolean herseyYolunda) {
		this.herseyYolunda = herseyYolunda;
	}

}
