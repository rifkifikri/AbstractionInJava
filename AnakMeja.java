
public class AnakMeja extends Meja{
	//eksekusi method pertama
	public void mejaKerja() {
		System.out.println("Meja Kantor");
	}
	public void mejaSantai() {
		
	}
	public void produk(int total,String diskon) {
		
	}
	String jenisnya="meja kantor";
	//overriding
	public void jenis() {
		String nama=this.jenisnya;
		System.out.println(nama);
	}
	public void jenis2() {
		System.out.println("meja santai");
	}
	//overloading
	public void produk() {
		System.out.println("China");
	}
	public void produk(int jumlah,String tipe, String warna) {
		System.out.println("jumlah produk = "+jumlah);
		System.out.println("jenis "+tipe);
		System.out.println("warna "+warna);
	}
	public void produk(String kwalitas) {
		System.out.println("kualitas produk "+kwalitas);
	}
}
