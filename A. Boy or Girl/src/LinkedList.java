public class LinkedList {
    AlphabetNode head;

    public void addNode(char letter) {
        if (!search(letter)) {
            AlphabetNode newNode = new AlphabetNode(letter);
            if (this.head == null)
                this.head = newNode;
            else {
                AlphabetNode iterator = this.head;
                while (iterator.next != null) {
                    iterator.next = iterator;
                }
                iterator.next = newNode;
            }
        }
    }

    public boolean search(char letter) {
        if (this.head == null) {
            return false;
        }
        AlphabetNode iterator = this.head;
        while (iterator != null) {
            if (iterator.letter == letter) {
                return true;
            }
            iterator = iterator.next;
        }
        return false;
    }

    public int length() {
        int length = 0;
        AlphabetNode iterator = this.head;

        while (iterator != null) {
            length++;
            iterator = iterator.next;
        }
        return length;
    }

}
