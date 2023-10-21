import java.util.Scanner;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int sala[][] = new int[15][15];

        int temp;
        do{
            System.out.print("Digite uma temperatura ambiente: ");
            temp = input.nextInt();
            if (temp<0 || temp>25){
                System.out.println("A temperatura tem que estar entre 0ºC e 25ºC");
            }

        } while (temp<0 || temp>25);

        for (int list[]: sala){
            Arrays.fill(list, temp);
        }

        for (int c=1; c<5;c++){
            int calor;
            int i;
            int j;
            do{
                System.out.print("Digite a temperatura da fonte de calor: ");
                calor = input.nextInt();
                if (calor<45){
                    System.out.println("A fonte de calor precisa ter temperatura maior que 45ºC");
                }
            } while(calor<45);
            do{
                System.out.print("Digite a linha da posição: ");
                i = input.nextInt();
                if (i>sala.length){
                    System.out.println("A linha tem que ser menor que "+sala.length);
                }
            } while(i>sala.length);
            do{
                System.out.print("Digite a coluna da posição: ");
                j = input.nextInt();
                if (j>sala.length){
                    System.out.println("A coluna tem que ser menor que "+sala.length);
                }
            } while(j>sala.length);
            sala[i][j] = calor;
        }
        for (int c=1; c<7; c++){
            int ar;
            int i;
            int j;
            do {
                System.out.print("Digite uma temperatura de ar-condicionado: ");
                ar = input.nextInt();
                if (ar<15 || ar>25){
                    System.out.println("A temperatura do ar-condicionado precisar estar entre 15ºC e 25ºC");
                } 
            } while (ar<15 || ar>25);
            do{
                System.out.print("Digite a linha da posição: ");
                i = input.nextInt();
                if (i>sala.length){
                    System.out.println("A linha tem que ser menor que "+sala.length);
                }
            } while(i>sala.length);
            do {
                System.out.print("Digite a coluna da posição: ");
                j = input.nextInt();
                if (j>sala.length){
                    System.out.println("A coluna tem que ser menor que "+sala.length);
                }
            } while (j>sala.length);
            sala[i][j]=ar;
        }


        for (int i=0; i<sala.length; i++){
            System.out.println();
            for (int j=0; j<sala.length; j++){
                System.out.print(sala[i][j]+" ");
            }
        }



    }
}
