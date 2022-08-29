import java.util.Scanner;

public class siralama {
    public static void main(String [] args) {
        int a,b,c;
    Scanner input= new Scanner(System.in);
        System.out.print("1.SAYISI GİRİNİZ:");
        a= input.nextInt();
        System.out.print("2.SAYIYI GİRİNİZ:");
        b= input.nextInt();
        System.out.print("3.SAYIYI GİRİNİZ:");
        c= input.nextInt();

        if(a>b){
            if (b>c){System.out.print("a>b>c");}
            if (c>b&&a>c){System.out.print("a>c>b");}}
        if (b>a){
            if (a>c){System.out.print("b>a>c");}
            if(c>a&&b>c){System.out.print("b>c>a");}}
        if (c>a) {
            if(a>b){System.out.print("c>a>b");}
            if(b>a&&c>b){System.out.print("c>b>a");}}

    }
}
