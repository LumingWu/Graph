package Graph;

import Relation.Edge;
import Relation.Adjacency;
import Relation.WeightedEdge;
import Vertex.Vertex;
import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

    public static ArrayList<Edge> parseEdge(ArrayList<Vertex> vertices) {
        return null;
    }

    /**
     * Use this method to parse a LinkedList of Edge to a sorted ArrayList of
     * Node. O(ElogN)
     * @param edges
     * @return Node ArrayList
     */
    public static ArrayList<Vertex> parseVertices(LinkedList<WeightedEdge<String>> edges) {
        ArrayList<Vertex> nodes = new ArrayList<Vertex>();
        int index1, index2;
        WeightedEdge<String> edge;
        Vertex vertex1, vertex2;
        while (!edges.isEmpty()) {
            edge = edges.pop();
            index1 = binarySearch(nodes, (String)edge.head());
            index2 = binarySearch(nodes, (String)edge.tail());
            if (index1 < 0) {
                if (index2 < 0) {
                    vertex1 = new Vertex((String)edge.head());
                    vertex2 = new Vertex((String)edge.tail());
                    insert(nodes, vertex1);
                    insert(nodes, vertex2);
                    vertex1.adjacencies().add(new Adjacency(vertex2, edge.weight()));
                    vertex2.adjacencies().add(new Adjacency(vertex1, edge.weight()));
                } else {
                    vertex1 = new Vertex((String)edge.tail());
                    vertex2 = nodes.get(index2);
                    insert(nodes, vertex1);
                    vertex1.adjacencies().add(new Adjacency(vertex2, edge.weight()));
                    vertex2.adjacencies().add(new Adjacency(vertex1, edge.weight()));
                }
            } else if (index2 < 0) {
                vertex1 = nodes.get(index1);
                vertex2 = new Vertex((String)edge.tail());
                insert(nodes, vertex2);
                vertex1.adjacencies().add(new Adjacency(vertex2, edge.weight()));
                vertex2.adjacencies().add(new Adjacency(vertex1, edge.weight()));
            } else {
                vertex1 = nodes.get(index1);
                vertex2 = nodes.get(index2);
                vertex1.adjacencies().add(new Adjacency(vertex2, edge.weight()));
                vertex2.adjacencies().add(new Adjacency(vertex1, edge.weight()));
            }
        }
        return nodes;
    }

    private static int binarySearch(ArrayList<Vertex> vertices, String name) {
        int left = 0;
        int right = vertices.size() - 1;
        
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (name.compareTo(vertices.get(middle).toString()) < 0) {
                right = middle - 1;
            } else if (name.compareTo(vertices.get(middle).toString()) > 0) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static void insert(ArrayList<Vertex> vertices, Vertex vertex) {
        vertices.add(vertex);
        int index = vertices.size() - 1;
        while (index != 0 && vertices.get(index).toString().compareTo(vertices.get(index - 1).toString()) < 0) {
            exchange(vertices, index, index - 1);
            index = index - 1;
        }
    }
    
    private static void exchange(ArrayList<Vertex> vertices, int i, int j){
        Vertex temp = vertices.get(i);
        vertices.set(i, vertices.get(j));
        vertices.set(j, temp);
    }

}
