package Vertex;

import Relation.Adjacency;
import java.util.LinkedList;

public class Vertex implements Comparable<Vertex>{
    
    private String _name;
    private LinkedList<Adjacency> _adjacencies = new LinkedList<Adjacency>();
    
    public Vertex(String name){
        _name = name;
    }
    
    public LinkedList<Adjacency> adjacencies(){
        return _adjacencies;
    }
    
    @Override
    public String toString(){
        return _name;
    }
    
    /**
     * Compare vertex by name.
     * @param o
     * @return negative if less than, 0 if equal, and positive if bigger than. 
     */
    @Override
    public int compareTo(Vertex o) {
        return _name.compareTo(o.toString());
    }
    
}
