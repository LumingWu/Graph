package Edge;

public class DirectedEdge<T extends Comparable<? super T>> implements Comparable<DirectedEdge<T>>{
    
    public final T source;
    public final T target;
    public final double weight;
    
    public DirectedEdge(T o1, T o2, double length){
        source = o1;
        target = o2;
        weight = length;
    }

    @Override
    public int compareTo(DirectedEdge<T> o) {
        int difference = source.compareTo(o.source);
        if(difference == 0){
            difference = target.compareTo(o.target);
            if(difference == 0){
                return (int)(weight - o.weight);
            }
            else{
                return difference;
            }
        }
        else{
            return difference;
        }
    }
    
}
