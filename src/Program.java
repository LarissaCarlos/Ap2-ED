import java.util.Scanner;

public class Program {

        public static void main(String[] args) {
            List list = new List();
            Scanner scanner = new Scanner(System.in);
            int choice = 0;
            while (choice != 7) {
                System.out.println("Escolha uma opção:");
                System.out.println("1. Inserir elemento no início da lista");
                System.out.println("2. Inserir elemento no fim da lista");
                System.out.println("3. Remover elemento do início da lista");
                System.out.println("4. Remover elemento do fim da lista");
                System.out.println("5. Obter valor do elemento em uma posição específica da lista");
                System.out.println("6. Imprimir lista completa");
                System.out.println("7. Imprimir lista completa de trás para frente");
                System.out.println("8. Sair");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Digite o valor a ser inserido no início da lista:");
                        int valueAtBeginning = scanner.nextInt();
                        list.insertAtBeginning(valueAtBeginning);
                        break;
                    case 2:
                        System.out.println("Digite o valor a ser inserido no fim da lista:");
                        int valueAtEnd = scanner.nextInt();
                        list.insertAtEnd(valueAtEnd);
                        break;
                    case 3:
                        list.removeFromBeginning();
                        break;
                    case 4:
                        list.removeFromEnd();
                        break;
                    case 5:
                        System.out.println("Digite a posição do elemento:");
                        int position = scanner.nextInt();
                        int valueAtPosition = list.getValueAtPosition(position);
                        if (valueAtPosition != -1) {
                            System.out.println("Valor na posição " + position + ": " + valueAtPosition);
                        }
                        break;
                    case 6:
                        System.out.println("Lista completa:");
                        list.printForward();
                        break;
                    case 7:
                        System.out.println("Lista completa de trás para frente:");
                        list.printReverse();
                        break;
                    case 8:
                        System.out.println("Saindo do programa.");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            }

            scanner.close();
        }

}
