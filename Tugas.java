import java.util.LinkedList;

public class Tugas {
    public static void main(String[] args) {
        

        // Nama : Johansyah
        // NIM : 052518915
        // Prodi : Sistem Informasi
        //UPBJJ Jakarta

        // Soal No 1
        //Deklarasi Variabel tipe data integer

        int StrukturBaris;
        StrukturBaris = 21;
        System.out.println("Vabel integer :" + StrukturBaris);

        // Soal No 2
        //Deklarasi Tipe Data string dengan nama KataBaru

        String KataBaru = "Deklarasi Tipe Data String";
        System.out.println("Variabel Baru :" + KataBaru);

        // Soal No 3
        // Membuat Array 1 dimensi

        int[] empatAngka = {07,10,20,23};
        System.out.println("isi Array tersebut");
        for(int angka : empatAngka)
        {
            System.out.println(angka + "");
        }
        System.out.println();

        // Soal No 4
        // Membuat array dua dimensi

        String [][] Angka = {
            {"1","3","5"},
            {"14","19","20"},
            {"22","27","29"}
        };

        System.out.println("Isi array Angka :");
        for (int i = 0; i < Angka.length; i++)
        {
            for (int j = 0; j < Angka[i].length; j++)
            {System.out.println(Angka[i][j]);}
        }
        System.out.println();

        // Soal No. 5
        // deklarasi LinkedList

        LinkedList<Integer> ListAngka = new LinkedList<>();
        ListAngka.add(22);
        ListAngka.add(19);
        ListAngka.add(44);
        ListAngka.add(60);
        ListAngka.add(72);

        System.out.println("isi LinkedList dari ListAngka" + ListAngka);






























    }
}