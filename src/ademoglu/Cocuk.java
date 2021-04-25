package ademoglu;

public class Cocuk {
	
	String ad;
	cins cinsiyet;
	
	public Cocuk(String ad, cins kiz) {
		super();
		this.ad = ad;
		this.cinsiyet = kiz;
		
		if(kiz==cins.KIZ)
		System.out.println("Tebrikler, nur topu gibi bir kiziniz oldu");
		else
			System.out.println("Tebrikler, nur topu gibi bir oglunuz oldu");
	}
	
	public enum cins{
		KIZ, ERKEK
	}
	
	
	

}
