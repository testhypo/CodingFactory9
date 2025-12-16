package gr.aueb.cf.cf9.ch17;

/**
 * Defines a class {@link Node}
 * with only one field int.
 */
public class Node {
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
