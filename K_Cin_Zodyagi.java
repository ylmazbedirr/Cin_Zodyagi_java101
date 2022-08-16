import java.util.Scanner;
public class K_Cin_Zodyagi {
    public static void main(String[] args) {

        int kalan = 0;
        int yil;

        Scanner input = new Scanner(System.in);

        System.out.print("Dogum Yiliniz :");
        yil = input.nextInt();

        kalan = yil % 12;

        if (kalan == 0){
            System.out.print("Maymun");
        }
        if (kalan == 1){
            System.out.print("Horoz");
        }
        if (kalan == 2){
            System.out.print("Kopek");
        }
        if (kalan == 3){
            System.out.print("Domuz");
        }
        if (kalan == 4){
            System.out.print("Fare");
        }
        if (kalan == 5){
            System.out.print("Okuz");
        }
        if (kalan == 6){
            System.out.print("Kaplan");
        }
        if (kalan == 7){
            System.out.print("Tavsan");
        }
        if (kalan == 8){
            System.out.print("Ejderha");
        }
        if (kalan == 9){
            System.out.print("Yilan");
        }
        if (kalan == 10){
            System.out.print("At");
        }
        if (kalan == 11){
            System.out.print("Koyun");
        }

    }
}
