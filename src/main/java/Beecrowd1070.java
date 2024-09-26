
import java.util.Scanner;

public class Beecrowd1070 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        //declarar variáveis
        int X,temp=0;
        //ler variável X
        X = scanner.nextInt();
        
        //verificar se o número é ímpar e mostar no console
        do{
           if(X%2!=0){
               System.out.println(X);
               temp++;
           }
           X++;
        }while(temp<6);
    }
}
