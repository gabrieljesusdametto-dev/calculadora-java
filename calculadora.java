import java.util.Scanner;

public class calculadora{
    public static void main(String[] args) {
    
        float num1;
        float num2;
        int operacao;
    
        System.out.println("escolha um número");
        Scanner entradaUsuario = new Scanner(System.in);
        num1 = entradaUsuario.nextInt();
    
        System.out.println("escolha outro número");
        num2 = entradaUsuario.nextInt();

        System.out.println("escolha a operação"+"\n"+"1.adição"+"\n"+"2.subtração"+"\n"+"3.multiplicação"+"\n"+"4.divisão");
        operacao = entradaUsuario.nextInt();

        switch(operacao){
            case 1:
                System.out.println("O resultado é "+(num1+num2));
                break;
            case 2:
                System.out.println("O resultado é "+(num1-num2));
                break;
            case 3:
                System.out.println("O resultado é "+(num1*num2));
                break;
            case 4:
                System.out.println("O resultado é "+(num1/num2));
                break;
            default:
                System.out.println("operação inválida");
        }
    }
}
