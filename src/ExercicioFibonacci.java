import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer number = sc.nextInt();

        verificaFibonacci(number);

    }

    private static void verificaFibonacci(Integer number) {

        List<Integer> fibo = new ArrayList<>();
        fibo.add(0);
        fibo.add(1);
        Integer position = 2;
        boolean estaNaLista = false;

        while (estaNaLista == false){
            fibo.add(fibo.get(position - 2)+ fibo.get(position - 1));
            if (fibo.get(position) == number){
                System.out.println(" O número informado pertence");
                estaNaLista = true;
            }
            else if (number < fibo.get(position)){
                System.out.println("O número informado não pertence");
                estaNaLista = true;
            }
            position += 1;
        }
    }

}