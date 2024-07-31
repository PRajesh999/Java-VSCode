import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList<ReferenceType> name = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        // ArrayList<Cat> cats = new ArrayList<>();

        // add() method -> to add new element to arraylist
        arr.add(10);
        arr.add(20);
        arr.add(7);
        System.out.println(arr);

        // get(index) method -> to access an element at index
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));

        //to check length of the array list -> size()
        System.out.println(arr.size());

        // add(index, element) -> used to insert element at a specific  position in arraylist
        arr.add(0,77);
        System.out.println(arr);

        // set(index, element) ->  used to set the value of the element at the specific index
        arr.set(2,9);
        System.out.println(arr);

        // remove() 
        Integer n = 9;
        arr.remove(n); // You need to pass an index or object here not int 
        System.out.println(arr);
    }
}