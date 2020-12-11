import java.util.ArrayList;
import java.lang.IllegalArgumentException;
public class NoNullArrayList<T> extends ArrayList<T>{
//override set and both add methods
//add two constructors

    public NoNullArrayList(){
//default
      super();

    }
    public NoNullArrayList(int startingCapacity){
//startingcapacity
      super(startingCapacity);
    }

    public boolean add(T element){
//overrides add; appends to end of the list
      if (element==null) throw new IllegalArgumentException("The element is null");
      return super.add(element);
    }

    public void add(int index, T element){
//overrides add; adds the element at a certain index
      if (element==null) throw new IllegalArgumentException("The element is null");
      super.add(index, element);
    }

    public T set(int index, T element){
//override set
      if (element==null) throw new IllegalArgumentException("The element is null");
       
      return super.set(index, element);


    }
}
