public class pattern_using_recursion {
    public static void main(String[] args) {
        triangle(4, 0);
        normaltriangle(4, 0);
        
    }

    static void triangle(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("* ");
            triangle(r, c + 1);
        }else {
            System.out.println();
            triangle(r-1, 0);


        }
    }
    //just call the recursion funtion first
    static void normaltriangle(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            normaltriangle(r, c + 1);
            System.out.print("* ");
        }else {
            normaltriangle(r-1, 0);
            System.out.println();
            
        }
    }


 
}
