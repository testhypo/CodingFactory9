package gr.aueb.cf.cf9.ch17;

/**
 * In Object's position we could have
 * any data type.
 */
public class FlexibleNode {
    private Object value;

    public FlexibleNode () {

    }

    public FlexibleNode(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
