class Swapnt {
    public static void main(String args[]) {
        int a = 10,b = 5;
        a^=b;
        b^=a;
        a^=b;
        System.out.println("After Swapping: " + a + " " + b); 
    }
}