package Vertex;

import Relation.Adjacency;
import java.util.ArrayList;
import java.util.LinkedList;

public class Vertex implements Comparable<Vertex>{
    
    public String name;
    public Vertex predecesspr = null;
    public Vertex successor = null;
    public ArrayList<Adjacency> staticAdjacencies = new ArrayList<Adjacency>();
    public LinkedList<Adjacency> activeAdjacencies = new LinkedList<Adjacency>();
    
    public Vertex(String id){
        name = id;
    }

    @Override
    public int compareTo(Vertex o) {
        return name.compareTo(o.name);
    }
}
