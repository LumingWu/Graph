package Vertex;

import Relation.Adjacency;
import java.util.ArrayList;
import java.util.LinkedList;

public class WeightedVertex implements Comparable<WeightedVertex>{
    
    public double weight = Double.POSITIVE_INFINITY;
    public String name;
    public Vertex predecesspr = null;
    public Vertex successor = null;
    public ArrayList<Adjacency> staticAdjacencies = new ArrayList<Adjacency>();
    public LinkedList<Adjacency> activeAdjacencies = new LinkedList<Adjacency>();

    public WeightedVertex(String id) {
        name = id;
    }
    
    @Override
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(WeightedVertex o) {
        return name.compareTo(o.name);
    }
}
