import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TulisFile {

    public static void main(String[] args) {
        int Total,bayar;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Total pesanan : ");
        Total = input.nextInt();
        System.out.println("Masukkan total yang dibayar: ");
        bayar = input.nextInt();
        int kembalian = bayar - Total;
        System.out.println("kembalian : "+kembalian);

        String fileName = "src/struk.txt";
        String fileContent1 = "Total pesanan   : "+Total+"\n";
        String fileContent2 = "Total Bayar     : "+bayar+"\n";
        String fileContent3 = "Total kembalian : "+kembalian+"\n" ;


        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(fileContent1);
            fileWriter.write(fileContent2);
            fileWriter.write(fileContent3);
            fileWriter.close();

            System.out.println("Struk sudah dicetak");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan!!!" + e.getMessage());
        }
    }
}