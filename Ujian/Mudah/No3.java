public class No3 {
    public static void main(String[] args) {
        int angkatan = 33;
        String julukan = "Wikusama";
        String sekolah = "Moklet";

        
        for (int nomorUrut = 50; nomorUrut >= 1; nomorUrut--) {
            
            System.out.println("No: " + nomorUrut);
            System.out.println("Saya angkatan " + angkatan);
            System.out.println("Saya anak " + sekolah);
            System.out.println("Saya anak " + julukan);
            System.out.println();
        }

        System.out.println("Program selesai. Semua data telah ditampilkan.");
    }
}

