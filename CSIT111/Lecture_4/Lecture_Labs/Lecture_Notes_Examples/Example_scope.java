package UOW.CSIT111.Lecture_4.Lecture_Labs.Lecture_Notes_Examples;

public class Example_scope {
    // field are visible to all methods of the class
    private static int cV;
    public static void main(String[] args)
    {
        int a=0, b=1, c=0; 
        cV = 1; //cV is visible everywhere within the class
        c = calc(a, b); // local a,b,c are visible only 
        // inside the main() method
    }
    
    public static int calc(int j, int k){
        int a=0, b = 5;
        cV = a; //cV is visible everywhere within the class
        return ( j+k/b ); // formal parameters j, k
        // and local variables a, b
        // are visible only localy
        
    }
}
