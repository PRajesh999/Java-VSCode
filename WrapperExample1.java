public class WrapperExample1 {
    public static void main(String[] args) {
        // int a = 10; //primitive type
        // Integer b = 10; //Wrapper class (object)

        // int aa = 10; 
        // Integer bb = aa; //Auto Boxing
        // int c = bb; //Auto Unboxing

        // char arr[] = new char[5]; // primitive
        // Character ar[] = new Character[6]; // Wrapper Class

        Integer array[] = {1,2,3,4,};
        for(Integer val:array ){
            System.out.println(val);
        }

    }
    
}