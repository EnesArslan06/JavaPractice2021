package JavaPracticeDay15_KitapYonetimi;

public class Kitap {

	private int no;
	private String kitapAdi;
	private String yazarAdi;
	private int yayinYili;
	private double fiyat;
	
	public Kitap() {
		
	}
	
	public Kitap(int no, String kitapAdi, String yazarAdi, int yayinYili, double fiyat) {
		this.no = no;
		this.kitapAdi = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.yayinYili = yayinYili;
		this.fiyat = fiyat;
	}
	
	public int getNo() {
		return no;
	
	}
	
	@Override
	public String toString() {//bu method objenin fieldslarini yazdirir.
		
		return "Kitap [no=" + no + ", kitapAdi=" + kitapAdi + ", yazarAdi=" + yazarAdi + ", yayinYili=" + yayinYili
				+ ", fiyat=" + fiyat + "]";
	}

	public void setNo(int no) {
		this.no = no;
	
	}
	
	public String getKitapAdi() {
		return kitapAdi;
	
	}
	
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	
	}
	
	public String getYazarAdi() {
	
		
		return yazarAdi;
	}
	
	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	
	}
	
	public int getYayinYili() {
		return yayinYili;
	
		
	}
	
	public void setYayinYili(int yayinYili) {
		this.yayinYili = yayinYili;
	
	
	}
	
	public double getFiyat() {
		return fiyat;
	
	
	}
	
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	
	
	}

	
	
	
	
	
	

}
