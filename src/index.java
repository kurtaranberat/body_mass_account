import  java.util.Scanner;
public class index {
    public  static  void  main(String[]args ){
        Scanner brt=new Scanner(System.in);
        System.out.print("ağrlığınızı giriniz = ");
       double kg = brt.nextByte();

        System.out.print("boyunuzu  giriniz (metre cinsinden )=");
        double boy  = brt.nextByte();

        double temp = boy*boy;
        double as = kg/temp;
        System.out.println("vucut kitle indeksi degri="+ as);

    }
}
