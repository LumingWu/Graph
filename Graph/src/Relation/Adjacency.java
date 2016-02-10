package Relation;

import Vertex.Vertex;

/**
 * Vertex property Adjacency.
 * @author Luming Wu
 * @param <V> 
 */
public class Adjacency<V extends Vertex>{
    
    private final V _target;
    private final double _weight;
    
    public Adjacency(V target, double weight){
        _target = target;
        _weight = weight;
    }
    
    /**
     * Get the adjacent vertex.
     * @return Vertex
     */
    public V target(){
        return _target;
    }
    
    /**
     * Get the weight of the adjacency.
     * @return double
     */
    public double weight(){
        return _weight;
    }
    
}
