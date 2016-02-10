package Vertex;

public class WeightedVertex extends Vertex{
    
    private Vertex _predecessor = null;
    private Vertex _successor = null;
    private double _weight = Double.POSITIVE_INFINITY;

    public WeightedVertex(String id, double weight){
        super(id);
        _weight = weight;
    }
    public WeightedVertex(String id) {
        super(id);
    }
    
    public double weight(){
        return _weight;
    }
    
    public void setWeight(double weight){
        _weight = weight;
    }
    
    public Vertex predecessor(){
        return _predecessor;
    }
    
    public void setPredecessor(Vertex predecessor){
        _predecessor = predecessor;
    }
    
    public Vertex successor(){
        return _successor;
    }
    
    public void setSuccessor(Vertex successor){
        _successor = successor;
    }
}
