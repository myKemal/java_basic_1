import java.util.Scanner;
public class recursif {
    static Scanner scanner = new Scanner(System.in);
    static String ilksayi;
    static String ikincisayi;
    public static void main(String[] args) {
        sayiAl1();
        sayiAl2();
        islem();
        scanner.close();
    }
    public static void islem() {
        System.out.println("Toplama için + 'e basınız...");
        System.out.println("Çarpma için * 'ye basınız...");
        String islem = scanner.nextLine();
        System.out.println("Seçiminiz " + islem);

        if (islem.equals("+")) {
            int sonuc = Integer.parseInt(ilksayi) + Integer.parseInt(ikincisayi);
            System.out.println(ilksayi + " + " + ikincisayi + " = " + sonuc);

        } else if (islem.equals("*")) {
            int sonuc = Integer.parseInt(ilksayi) * Integer.parseInt(ikincisayi);
            System.out.println(ilksayi + " * " + ikincisayi + " = " + sonuc);

        }
        else{
            System.out.println("Geçersiz işlem...");
            islem();
        }
    }



    public static void sayiAl1() {
        System.out.println("İlk sayıyı giriniz:");
        ilksayi = scanner.nextLine();
        if (isInteger(ilksayi, 0)) {
            System.out.println("İlk sayıyı :" + ilksayi);
        } else {
            sayiAl1();
        }
    }
    public static void sayiAl2() {
        System.out.println("İkinci sayıyı giriniz:");
        ikincisayi = scanner.nextLine();
        if (isInteger(ikincisayi, 0)) {
            System.out.println("İkinci sayıyı :" + ikincisayi);
        } else {
            sayiAl2();
        }
    }
    public static boolean isInteger(String str, int index) {
        if (index == str.length()) {
            return true;
        }

        if (!Character.isDigit(str.charAt(index))) {
            return false;
        }

        return isInteger(str, index + 1);
    }

}
