package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E extends Comparable>{

    E first;
    E second;

    Pair(E first, E second){
        this.first = first;
        this.second = second;
    }

    E getFirst(){
        return this.first;
    }

    E getSecond(){
        return this.second;
    }

    E min(){
        if (first.compareTo(second) > 0){
            return second;
        } else {
            return first;
        }
    }

    E max(){
        if (second.compareTo(first) > 0){
            return second;
        } else {
            return first;
        }
    }

}
