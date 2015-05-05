package holding;

//: innerclasses/Sequence.java
// Holds a sequence of Objects.

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private final static int OBJECT_SIZE = 1;
    private Object[]         items;
    private int              next        = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        } else {
            //当长度超过后新建数组，并复制内容
            Object[] temps = items;
            items = new Object[items.length + OBJECT_SIZE];
            System.arraycopy(temps, 0, items, 0, temps.length);
            items[next++] = x;
        }
    }

    //内部类，实现接口Selector
    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length)
                i++;
        }
    }
    
    //通过这个返回新建的Selector对象
    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 16; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
} /*
   * Output: 0 1 2 3 4 5 6 7 8 9
   */// :~
