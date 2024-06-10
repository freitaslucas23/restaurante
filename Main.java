import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//obj
        Scanner scanner = new Scanner(System.in);
// lista de convidados
        List<String> convidados = new ArrayList<>();
        convidados.add("carla");
        convidados.add("leticia");
        convidados.add("alailton");
        convidados.add("lucas");

// criando lista mesa
        List<java.lang.Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

//criando lista cardapio
        List<String> cardapio = new ArrayList<>();
        cardapio.add("1.hamburguer");
        cardapio.add("2.x-burguer");
        cardapio.add("3.x-egg");
        cardapio.add("4.x-tudo");

//entrada
        System.out.print("olá \n");
        System.out.print("qual é seu nome? \n");
        String nome = scanner.nextLine();
        if (convidados.contains(nome)){
            System.out.print("nome na lista, seja Bem vindo \n");
        }else {
            System.out.print(" nome fora da lista, faça sua reserva \n");
            System.exit(1);
        }


// mesas lista + entrada
        System.out.print("mesa\n");


        for (Integer elemento : lista){
            System.out.print(elemento);
            System.out.println();
        }
        int mesa = scanner.nextInt();
            if (mesa <1){
                System.out.println("impossivel, outro ");
                System.exit(1);
            } else if (mesa > 5) {
                System.out.print("impossivel, outro ") ;
                System.exit(1);

            } else {
                System.out.println("bela escolha");
            }

// cardapio
        System.out.print("faça seu pedido:\n");
        System.out.print(cardapio);
        System.out.println();
        int pedido = scanner.nextInt();
        if (pedido < 1) {
            System.out.print("impossivel");
            System.exit(1);
        }else if (pedido > 4) {
            System.out.print("impossivel");
            System.exit(1);
        }else {
            System.out.print("seu pedido de um " + pedido + " foi anotado ...");

        }
    }
}

