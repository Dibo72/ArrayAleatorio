import java.util.Scanner;
public class ArrayAleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int media = 0;

        System.out.println("Digite um numero: ");
        int longitud = sc.nextInt();
        int[] aleatorio = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            aleatorio[i] = (int)(Math.random()*100);
        }

        for (int i = 0; i < longitud; i++) {
            System.out.print(aleatorio[i] + " ");
        }

        for (int i = 0; i < longitud; i++) {
            media += aleatorio[i];
        }
        System.out.println();
        media=media/longitud;
        System.out.println("Media: " + media);

        System.out.println();

        System.out.println("Mayores que la media");
        for (int i = 0; i < longitud; i++) {
            if(aleatorio[i]>media){
                System.out.print(aleatorio[i] + " ");
            }
        }
    }
}