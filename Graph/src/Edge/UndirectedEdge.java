package Edge;

public class UndirectedEdge<T extends Comparable<? super T>> implements Comparable<UndirectedEdge<T>>{
    
    public final T object1;
    public final T object2;
    public final double weight;
    
    public UndirectedEdge(T o1, T o2, double length){
        object1 = o1;
        object2 = o2;
        weight = length;
    }

    @Override
    public int compareTo(UndirectedEdge<T> o) {
        int difference = object1.compareTo(o.object1);
        if(difference == 0){
            difference = object2.compareTo(o.object2);
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
