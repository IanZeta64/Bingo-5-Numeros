import java.util.Random;
import java.util.Scanner;

public class BingoTesteUnico {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] cartela = new int[5];
        int[] cont = new int[5];
        boolean bingo = false;

        for(int i = 0; i< cartela.length; i++){
            cartela[i] = new Random().nextInt(20);
            System.out.print( cartela[i] + "\t" );
        }
        System.out.println();

        do {
            System.out.println("Entre com os numeros sorteados para conferencia: ");
            int sorteado = sc.nextInt();
            for (int i = 0; i < cartela.length; i++) {
                if (sorteado == cartela[i]) {
                    cont[i] = 1;
                    System.out.printf("Numero %d sorteado!%n", cartela[i]);
                }
            }
            int somaCont = cont[0] + cont[1] + cont[2]+ cont[3] + cont[4];
            if (somaCont == 5) {
             bingo = true;
            }
        }while(!bingo);
        System.out.println("BINGO!!!");
        }
    }

