import java.util.Scanner;

public class calculadora{
    public static void main(String[] args) {

        int num1;
        int num2;
        int operacao;

        System.out.println("escolha um número");
        Scanner entradaUsuario1 = new Scanner(System.in);
        num1 = entradaUsuario1.nextInt();

        System.out.println("escolha outro número");
        Scanner entradaUsuario2 = new Scanner(System.in);
        num2 = entradaUsuario2.nextInt();

        System.out.println("escolha a operação");
        Scanner entradaUsuario3 = new Scanner(System.in);
        operacao = entradaUsuario3.nextInt();

        if (operacao == 1){
            System.out.println("o resultado é " + (num1+num2));
}else if (operacao == 2){
    System.out.println("o resultado é " + (num1-num2));
}else if (operacao == 3){
    System.out.println("o resultado é " + (num1*num2));
}else if (operacao == 4){
    System.out.println("o resultado é " + (num1/num2));
}

    System.out.println("fim de calculo");

    }  
}
