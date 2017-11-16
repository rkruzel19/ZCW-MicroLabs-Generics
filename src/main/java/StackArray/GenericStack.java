package StackArray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;

    public GenericStack() {
        //elements = new E[];
        elements = (E[]) new ArrayList<E>().toArray();
    }

    public void push(E element){
        elements = Arrays.copyOf(elements, elements.length + 1);
        elements[elements.length - 1] = element;
    }

    public E pop() throws IndexOutOfBoundsException{
        E elementRemoved = elements[elements.length - 1];
        elements = Arrays.copyOf(elements, elements.length - 1);
        return elementRemoved;
    }

    public boolean isEmpty(){
        if (elements.length == 0){
            return true;
        } else {
            return false;
        }
    }

}
