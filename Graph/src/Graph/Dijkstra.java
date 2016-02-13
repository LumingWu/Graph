package Graph;

import Relation.Adjacency;
import Vertex.WeightedVertex;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 *
 * @author Luming Wu
 */ 
public class Dijkstra {
    /**
     * 
     * @param source 
     */
    public static void computePaths(WeightedVertex source){
        source.setWeight(0);
        PriorityQueue<WeightedVertex> q = new PriorityQueue<WeightedVertex>();
        q.add(source);
        while(!q.isEmpty()){
            WeightedVertex u = q.poll();
            for(Adjacency a : u.adjacencies()){
                WeightedVertex v = (WeightedVertex)a.target();
                double distance = u.weight() + a.weight();
                if(distance < v.weight()){
                    q.remove(v);
                    v.setWeight(distance);
                    u.setSuccessor(v);
                    v.setPredecessor(u);
                    q.add(v);
                }
            }
        }
    }
    
    public static LinkedList<WeightedVertex> getShortestPath(WeightedVertex target){
        LinkedList<WeightedVertex> path = new LinkedList<WeightedVertex>();
        WeightedVertex v = target;
        while(v != null){
            path.addFirst(v);
            v = (WeightedVertex)v.predecessor();
        }
        return path; 
    }
}
