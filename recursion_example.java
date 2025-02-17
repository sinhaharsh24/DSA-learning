public class recursion_example {
    //Question: why recursion is used ?
    //Ans: it helps in solving complex problem easily you can convert recursion solution into iteration & vice versa
    public static void main(String[] args) {
        //using recursion to print number from 1 to 5;
        print(1);
    }
    static void print(int n) {
        if (n == 5) { //base condition without this base condition it will fill the memory and stack overflow error will happen
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1); //function is calling itself
        //tail recursion
        //last funtion call
    }
}
