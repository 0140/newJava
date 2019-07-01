package CollectionsEx.singly_linked;

/*
 * https://crunchify.com/a-simple-singly-linked-list-implementation-in-java/
 * http://www.sanfoundry.com/java-program-implement-singly-linked-list/
 * 
 */
public class CrunchifyNode<V> {
    // instance variables
    private V element;
    private CrunchifyNode<V> next;
 
    // constructor first
    public CrunchifyNode() {
        this(null, null); 
    }
 
    public CrunchifyNode(V element, CrunchifyNode<V> next) {
        this.element = element;
        this.next = next;
    }
 
    public V getElement() {
        return element;
    }
 
    public CrunchifyNode<V> getNext() {
        return next;
    }
 
    public void setElement(V element) {
        this.element = element;
    }
 
    public void setNext(CrunchifyNode<V> next) {
        this.next = next;
    }
 
}