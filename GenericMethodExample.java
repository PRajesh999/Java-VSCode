class Dog{
    String name;
    int age;
    Dog(){}
    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "This is " + name + "(" + age + ")";
    }
}

public class GenericMethodExample {

    static <A> void printArray(A[] arr){
        for(A  val : arr){
            System.out.println(val);
        }
        System.out.println();
    }

    // ... ->  It is valid in java to create a single method for different parameters. 
    // static <S> void printArray(S ... a){
    //     for(S val : a){
    //         System.out.println(val);
    //     }
    //     System.out.println();
    // }

    public static void main(String[] args) {
        Integer[] a = {10, 30, 2, 17};
        Character[] c = {'a', 'p', 's', 'c'};
        Dog[] d = {new Dog("Chinnu",2), new Dog("Lucky",1)};

        printArray(a);
        printArray(c);
        printArray(d);
    }
}