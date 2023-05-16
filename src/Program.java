import java.util.Scanner;

public class Main {

    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    class DoublyLinkedList {
        Node head;
        Node tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }

        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        public void removeFromBeginning() {
            if (head == null) {
                System.out.println("A lista está vazia.");
            } else {
                if (head == tail) {
                    head = null;
                    tail = null;
                } else {
                    head = head.next;
                    head.prev = null;
                }
            }
        }

        public void removeFromEnd() {
            if (tail == null) {
                System.out.println("A lista está vazia.");
            } else {
                if (head == tail) {
                    head = null;
                    tail = null;
                } else {
                    tail = tail.prev;
                    tail.next = null;
                }
            }
        }

        public int getValueAtPosition(int position) {
            if (position < 0 || head == null) {
                System.out.println("Posição inválida ou a lista está vazia.");
                return -1;
            }

            Node currentNode = head;
            int currentPosition = 0;

            while (currentNode != null && currentPosition < position) {
                currentNode = currentNode.next;
                currentPosition++;
            }

            if (currentNode == null) {
                System.out.println("Posição inválida.");
                return -1;
            }

            return currentNode.data;
        }

        public void printForward() {
            if (head == null) {
                System.out.println("A lista está vazia.");
            } else {
                Node currentNode = head;
                while (currentNode != null) {
                    System.out.print(currentNode.data + " ");
                    currentNode = currentNode.next;
                }
                System.out.println();
            }
        }

        public void printReverse() {
            if (tail == null) {
                System.out.println("A lista está vazia.");
            } else {
                Node currentNode = tail;
                while (currentNode != null) {
                    System.out.print(currentNode.data + " ");
                    currentNode = currentNode.prev;
                }
                System.out.println();
            }
        }
    }

    public class Main {
        public void main(String[] args) {
            DoublyLinkedList list = new DoublyLinkedList();
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

}
