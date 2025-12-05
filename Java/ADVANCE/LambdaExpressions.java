// Lambda Expressions are used to implement short hand functions in java, they reduce code size.
// - only be implements over functional interface.
public class LambdaExpressions {
    public static void main(String args[]){
        // Previous method using anonymous inner class
        // A a = new A(){
        //     public void task(){
        //         System.out.println("task done !");
        //     };
        // };
        // a.task();

        A a = () -> System.out.println("task done !");
        a.task();
        B b = (i,j) -> System.out.println(i+j);
        b.task(5,3);
        C c = (i, j) -> i+j;
        System.out.println(c.task(7,3));
    }
}
// Functional Interface:- consists of only one single method.
interface A{
    void task();
}
interface B{
    void task(int i, int j);
}
interface C{
    int task(int i, int j);
}