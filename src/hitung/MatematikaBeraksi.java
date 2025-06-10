package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //mebuat objek
        Matematika ghifan = new Matematika(2,3);
        
        System.out.println("Hasil Penjumlahan : "+ghifan.setPenjumlahan());
        System.out.println("Hasil Pengurangan : "+ghifan.setPengurangan());
        System.out.println("Hasil Perkalian : "+ghifan.setPerkalian());
        System.out.println("Hasil Pembagian : "+ghifan.setPembagian());
    }
}
