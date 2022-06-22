import java.util.Arrays;

public class StringSınıfıMetotları {
    public static void main(String[] args) {
        String str="Her zaman aklina koydugunu kolayca ve akillica basaran bir insanim";
        System.out.println(str.charAt(10));
        System.out.println(str.concat("."));
        System.out.println(str.equals("patika"));
        System.out.println(str.indexOf("H"));//ilk bulduğun değerin index numarasını veriyor
        System.out.println(str.length());//stringin boyutunu veriyor.
        System.out.println(str.replace("a","e"));//değiştirir.Önce değiştirmek istediğimiz karakteri seçeriz, sonra olmasnı istediğimizi yazarız.
        String string="kelime";
        String[] sp=string.split("l");
        System.out.println(Arrays.toString(sp));
        System.out.println(str.substring(3,16));//istwnilen aralıktaki stringi almamızı sağlıyor.

        String password="        Parola    ";
        System.out.println(password.trim());//sağındaki solundaki boşlukları siler, kaldırır.
         }
}
