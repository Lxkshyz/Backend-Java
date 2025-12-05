class TypeConversion{
    public static void main(String args[]){
        byte b = 3;
        int a = 126;
        b = (byte)a;        // Type - casting OR Explicit conversion
        System.out.println(b);

        byte c = 34;
        int d = 23;
        d = c;              // Type - conversion OR Implicit conversion
        System.out.println(d);
    }
}