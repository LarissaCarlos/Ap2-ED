public class List<String> {


        int length;
        Node start;
        Node end;

        public void DoublyLinkedList() {
            this.start = null;
            this.end = null;
        }

        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            if (start == null) {
                start = newNode;
                end = newNode;
            } else {
                newNode.next = start;
                start.prev = newNode;
                start = newNode;
            }
            ++this.length;
        }

        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (start == null) {
                start = newNode;
                end = newNode;
            } else {
                end.next = newNode;
                newNode.prev = end;
                end = newNode;
            }
        }

        public void removeFromBeginning() {
            if (start == null) {
                System.out.println("A lista está vazia.");
            } else {
                if (start == end) {
                    start = null;
                    end = null;
                } else {
                    start = start.next;
                    start.prev = null;
                }
            }
        }

        public void removeFromEnd() {
            if (end == null) {
                System.out.println("A lista está vazia.");
            } else {
                if (start == end) {
                    start = null;
                    end = null;
                } else {
                    end = end.prev;
                    end.next = null;
                }
            }
        }

        public int getValueAtPosition(int position) {
            if (position < 0 || start == null) {
                System.out.println("Posição inválida ou a lista está vazia.");
                return -1;
            }

            Node currentNode = start;
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
        
        public void printReverse() {
            if (end == null) {
                System.out.println("A lista está vazia.");
            } else {
                Node currentNode = end;
                while (currentNode != null) {
                    System.out.print(currentNode.data + " ");
                    currentNode = currentNode.prev;
                }
                System.out.println();
            }
        }

    public void printForward() {
    }
}
