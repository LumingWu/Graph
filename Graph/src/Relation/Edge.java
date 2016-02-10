package Relation;

/**
 * This Edge stores two vertices of any type. The type may be Integer, String, or Vertex.
 * Head and tail are the two vertices. If this edge is treated as directed edge, then head is the predecessor and
 * tail is the successor.
 * @author Luming Wu
 * @param <T> 
 */
public class Edge<T>{
    
    private final T _head;
    private final T _tail;
    
    public Edge(T head, T tail){
        _head = head;
        _tail = tail;
    }
    
    /**
     * Get the head of the Edge.
     * @return T
     */
    public T head(){
        return _head;
    }
    
    /**
     * Get the tail of the Edge.
     * @return T
     */
    public T tail(){
        return _tail;
    }
    
}
