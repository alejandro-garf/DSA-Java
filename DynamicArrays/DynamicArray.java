
public class DynamicArray {
    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray(){
        this.array = new Object[capacity];
    }
    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    // Methods

    // Adds Object Data
    public void add(Object data){

    }

    // Inserts Object Data at specefic index 
    public void insert(int index, Object data){

    }

    // delets object data
    public void delete(Object data){

    }

    //search
    public int search(Object data){
        return -1;
    }

    // grows array
    public void grow(){

    }

    // Shrinks array
    public void shrink(){

    }

    // Returns true if array is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // No idea lol, String?
    public String toString() {
        return null;
    }


}