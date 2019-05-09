package exo3;

public class ListJava {

    private class Item {
        private int value;
        private Item next;

        private Item(int value) {
            this.value = value;
            this.next = null;
        }
    }
    private Item start;

    public ListJava(int i) {
        start = new Item(i);
    }

    public void add(int i){
        Item tmp = new Item(i);
        tmp.next = this.start;
        start = tmp;
    }

    public void print(ListJava l){
        Item tmp = start;
        while (tmp != null){
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }
}
