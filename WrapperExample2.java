class Cat{
    String name;
    int age;
    Cat(){}
    Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "This is " + name + "(" + age + ")";
    }
}

public class WrapperExample2 {

    // static void printArray(Integer A[]){
    //     for(Integer val : A){
    //         System.out.println(val);
    //     }
    //     System.out.println();
    // }

    // static void printArray(Character C[]){
    //     for(Character val : C){
    //         System.out.println(val);
    //     }
    //     System.out.println();
    // }

    // static void printArray(Cat cats[]){
    //     for(Cat val : cats){
    //         System.out.println(val);
    //     }
    //     System.out.println();
    // }

    static <S> void printArray(S[] arr){
        for(S  val : arr){
            System.out.println(val);
        }
        System.out.println();
    }

    // For every type we need to overload the method to overcome this problem we use Generic Method.

    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40 ,50};
        Character[] charr = {'a', 'b', 's'};

        printArray(arr);
        printArray(charr);

        //Cat c = new Cat("Alice", 7);
        Cat[] c = {new Cat("Alice",7),new Cat("Bob",6)};
        printArray(c);
    }
}