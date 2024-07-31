public class StringBufferExamples {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);
        sb.append(123); //appends 123 at the end of hello
        System.out.println(sb);

        sb.append(12.45);  //appends 12.45 at the end of hello
        System.out.println(sb);

        sb.setCharAt(0, 'p');  //replaces the char at 0th index with 'p'
        System.out.println(sb);

        sb.deleteCharAt(0);  //removes the character at 0th index
        System.out.println(sb);

        sb.insert(1, "pq");
        System.out.println(sb);
        
        String outpuString = new String(sb);
        System.out.println(outpuString.length());
    }
}
