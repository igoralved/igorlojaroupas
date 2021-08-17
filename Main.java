import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        System.out.println("\f");
        System.out.println("Hello");

        Scanner in = new Scanner(System.in);

        int opcao = -1;

        while(opcao != 6){
            System.out.println();
            System.out.println("Escolha: ");
            System.out.println("1=adicionar roupa em cabide");
            System.out.println("2=mostrar roupa em um cabide");
            System.out.println("3=liberar cabide por seu id");
            System.out.println("4=liberar cabide por roupa");
            System.out.println("5=ver cabides e roupas: ");
            System.out.println("6=sair: ");
            System.out.println();

            opcao = in.nextInt();

            switch(opcao){
                case 1:
                    System.out.println();
                    System.out.println("Insira o id do cabide:");
                    System.out.println();
                    Integer idCabidenovo = in.nextInt();
                    System.out.println();
                    System.out.println("Insira o modelo da roupa:");
                    System.out.println();
                    String nomeRoupa = in.next();
                    System.out.println();
                    Controlador.adicionarAoMapa(idCabidenovo, nomeRoupa);
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Insira o modelo da roupa:");
                    System.out.println();
                    String nomeRoupa1 = in.next();
                    System.out.println();
                    Controlador.mostraCabidePorRoupa(nomeRoupa1);
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Insira o id do cabide da roupa:");
                    System.out.println();
                    Integer cabide1 = in.nextInt();
                    System.out.println();
                    Controlador.liberaCabide(cabide1);
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Insira o modelo da roupa:");
                    System.out.println();
                    String nomeRoupa2 = in.next();
                    System.out.println();
                    Controlador.liberaCabide(nomeRoupa2);
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    Controlador.mostraMapa();
                    System.out.println();
                    break;
                case 6:
                    System.out.println();
                    System.out.println("Tchau");
                    System.out.println();
                    break;
                default:
                    System.out.println();
                    System.out.println("Opcao inválida.");
                    System.out.println();
                    break;
            }
        }

    }

}
