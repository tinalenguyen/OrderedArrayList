
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

    public OrderedArrayList(){
//default constructor
      super();
    }

    public OrderedArrayList(int startingCapacity){
//starting capacity
      super(startingCapacity);
    }



    public void add(int index, T element){
//same as other add

      add(element);

    }

    public boolean add(T element){
//override add
      for (int i = 0 ; i < size(); ){
        if (element.compareTo(get(i)) < 0 ) {
          super.add(i, element);
          i = size() + 10;
          return true;
        }
        else i++;
      }
      return (super.add(element));
    }

    public T set(int index, T value){
//removes element at index and adds new values
      T removed = value;
      if (index < size()){
        removed = remove(index);
      }
      add(value);
      return removed;


    }
}
