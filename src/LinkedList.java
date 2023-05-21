class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
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
