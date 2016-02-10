package Relation;

/**
 *
 * @author Luming Wu
 * @param <T>
 */
public class WeightedEdge<T extends Comparable<? super T>> extends Edge implements Comparable<WeightedEdge<T>>{
    
    private final double _weight;
    
    public WeightedEdge(T head, T tail, double weight) {
        super(head, tail);
        _weight = weight;
    }
    /**
     * Get the weight of the Edge.
     * @return double
     */
    public double weight(){
        return _weight;
    }
    
    /**
     * Compare edges by weight.
     * @param o
     * @return negative if less than, 0 if equal, and positive if bigger than. 
     */
    @Override
    public int compareTo(WeightedEdge<T> o) {
        return (int)(_weight - o.weight());
    }
}
