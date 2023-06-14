import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();

        try {
            // chamar metodo de contagem
            contar(parametroUm, parametroDois);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm eh maior que parametroDois

        //realizar a impressao dos elementos
    }
}
