import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k,sonuc=0;
        Scanner input=new Scanner(System.in);
        k=input.nextInt();
        for(int veri=0;veri<=k;veri++){
            if(veri%3==0&&veri%4==0){
                sonuc=sonuc+veri;

            }

        }
        sonuc=sonuc/2;
        System.out.print("Sonuc:"+sonuc);

    }
}