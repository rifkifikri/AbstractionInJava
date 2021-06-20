public class GrandChildMeja extends AnakMeja{
	float x=5;
	public void mejaKerja() {
	}
	//eksekusi method kedua, override
	public void mejaSantai() {
		System.out.println("Meja Ruang Tamu");
	}
	//overloading
	public void produk(int total,String diskon) {
		
		if(x<=total) {
			System.out.println("total barang "+total+" anda mendapat diskon "+diskon);
		}else {
			System.out.println("total barang "+total+" anda tidak mendapat diskon");
		}
	}
	public void produk(int total,int cash) {
		System.out.println("====================================");
		System.out.println("total barang = "+total);
		System.out.println("cash = "+ cash);
		System.out.println("kembalian = "+(cash-total));
	}
}
