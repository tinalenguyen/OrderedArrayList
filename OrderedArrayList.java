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


}
