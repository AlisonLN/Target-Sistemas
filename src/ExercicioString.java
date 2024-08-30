import java.util.Scanner;

public class ExercicioString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        verificaStringConteinsA(name);
    }

    private static void verificaStringConteinsA(String name) {

        int sum = 0;
        for (int i = 0; i < name.length(); i++){
            if(name.charAt(i) == 'a' || name.charAt(i) == 'A'){
                sum += 1;
            }
        }
        if (sum == 0) {
            System.out.println("A Palavra  " + name + " Não possui letras A");
        }else {
            System.out.println("A Palavra  " + name + " possui "  + sum + " letras A");
        }

    }
}
