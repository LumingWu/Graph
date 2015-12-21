package Relation;

public class Adjacency<T extends Comparable<? super T>> implements Comparable<Adjacency<T>>{
    
    public T target;
    public double weight;
    
    public Adjacency(T object, double length){
        target = object;
        weight = length;
    }

    @Override
    public int compareTo(Adjacency<T> o) {
        int difference = target.compareTo(o.target);
        if(difference == 0){
            return (int)(weight - o.weight);
        }
        else{
            return difference;
        }
    }
}
