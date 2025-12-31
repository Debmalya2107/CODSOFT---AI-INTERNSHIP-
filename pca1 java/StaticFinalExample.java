// StaticFinalExample.java
class StaticFinalExample {
    
    // Static variable
    static int count = 0;
    
    // Final variable (constant)
    final int MAX_VALUE;
    
    // Static final variable (constant shared by all)
    static final String COLLEGE_NAME;
    
    // Static block → initialize static final variable
    static {
        COLLEGE_NAME = "Tech University";
    }
    
    // Constructor → initialize final variable
    StaticFinalExample(int max) {
        MAX_VALUE = max;
        count++;   // increase count for every object
    }
    
    void display() {
        System.out.println("MAX_VALUE = " + MAX_VALUE);
        System.out.println("COLLEGE_NAME = " + COLLEGE_NAME);
        System.out.println("Objects created = " + count);
    }
    
    public static void main(String[] args) {
        StaticFinalExample obj1 = new StaticFinalExample(100);
        obj1.display();
        
        StaticFinalExample obj2 = new StaticFinalExample(200);
        obj2.display();
    }
}