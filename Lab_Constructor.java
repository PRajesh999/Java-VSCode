class Lab_Constructor { 
    private Lab_Constructor()  { 
        System.out.println("Default Constructor"); 
        System.out.println("Welcome to Guest"); 
    } 
    private Lab_Constructor(String name)  { 
    System.out.println("Parameterized Constructor"); 
    System.out.println("Welcome to "+name); 
    } 
    public static void main(String[] args) {
        Lab_Constructor c1 = new Lab_Constructor();
        Lab_Constructor c2 = new Lab_Constructor("Anand");
    }
}