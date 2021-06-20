
public class TestQuiz {
	public static void main(String[] args) {
		//test inheritance dan abstract
		Meja panasonik= new AnakMeja();
	 		panasonik.mejaKerja();
	 		panasonik.jenis();
	 		panasonik.jenis2();
	 		panasonik.produk();
	 		panasonik.produk(10, "A", "green");
	 	
	 	System.out.println("============");
	 	//test inheritance dan abstraction
		Meja napolin= new GrandChildMeja();
			napolin.mejaKerja();
			napolin.mejaSantai();
			napolin.produk(10, "20 %");
		System.out.println("============");
		
		//test abstraction
		AnakMeja maspion= new AnakMeja();
			maspion.mejaKerja();
			maspion.mejaSantai();
			
		System.out.println("============");
		
		GrandChildMeja napolly= new GrandChildMeja();
			//test polimorphism dan inheritance
			napolly.mejaKerja();
			napolly.mejaSantai();
			napolly.produk(50000, 100000);
			napolly.produk(6, "10 %");
			napolly.produk("bagus");
	}
}
