import java.util.ArrayList;
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

}
