import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

    public OrderedArrayList(){
//default constructor
      super();
    }

    public OrderedArrayList(int startingCapacity){
//starting capacity
      super(startingCapacity);
    }

    public int sorting(T element){
//sorting method?
      int ind = 0 ;
      for (ind=0 ; ind < size(); ){
        if ( element.compareTo(get(ind)) >0) ind++;

      }
      return ind-1;
    }

    public void add(int index, T element){
//find element where it should be inserted and add the element there
      int ind = sorting(element);
      super.add(ind, element);

    }

    public boolean add(T element){
//override add
      int ind = sorting(element);
      super.add(ind, element);
      return true;

    }

    public T set(int index, T value){
//removes element at index and adds new values
      T removed = super.remove(index);
      int ind = sorting(value);
      super.add(ind, value);
      return removed;


    }
}
