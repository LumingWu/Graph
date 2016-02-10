/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Graph.Graph;
import Relation.WeightedEdge;
import Vertex.Vertex;
import java.util.ArrayList;
import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luming Wu
 */
public class JUnit {
    
    public JUnit() {
    }
    
    @Test
    public void parseVerticesTest(){
        LinkedList<WeightedEdge<String>> edges = new LinkedList<WeightedEdge<String>>();
        edges.add(new WeightedEdge<String>("A", "B", 3));
        edges.add(new WeightedEdge<String>("B", "C", 2));
        edges.add(new WeightedEdge<String>("A", "C", 1));
        ArrayList<Vertex> vertices = Graph.parseVertices(edges);
        LinkedList<Integer> check = new LinkedList<Integer>();
        if(!((Vertex)vertices.get(0)).toString().equals("A")){
            check.add(0);
        }
        if(!((Vertex)vertices.get(1)).toString().equals("B")){
            check.add(1);
        }
        if(!vertices.get(2).toString().equals("C")){
            check.add(2);
        }
        if(!vertices.get(0).adjacencies().get(0).target().toString().equals("B")){
            check.add(3);
        }
        if(!vertices.get(0).adjacencies().get(1).target().toString().equals("C")){
            check.add(4);
        }
        if(!vertices.get(1).adjacencies().get(0).target().toString().equals("A")){
            check.add(5);
        }
        if(!vertices.get(1).adjacencies().get(1).target().toString().equals("C")){
            check.add(6);
        }
        if(!vertices.get(2).adjacencies().get(0).target().toString().equals("B")){
            check.add(7);
        }
        if(!vertices.get(2).adjacencies().get(1).target().toString().equals("A")){
            check.add(8);
        }
        if(vertices.get(0).adjacencies().get(0).weight() != 3){
            check.add(9);
        }
        if(vertices.get(0).adjacencies().get(1).weight() != 1){
            check.add(10);
        }
        if(vertices.get(1).adjacencies().get(0).weight() != 3){
            check.add(11);
        }
        if(vertices.get(1).adjacencies().get(1).weight() != 2){
            check.add(12);
        }
        if(vertices.get(2).adjacencies().get(0).weight() != 2){
            check.add(13);
        }
        if(vertices.get(2).adjacencies().get(1).weight() != 1){
            check.add(14);
        }
        assertTrue("The list: " + check, check.isEmpty());
    }
}
