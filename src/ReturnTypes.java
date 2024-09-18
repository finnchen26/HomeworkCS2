public class ReturnTypes {
    public static void main(String[] args) {
        ReturnTypes myReturnTypes = new ReturnTypes();
    }

    public ReturnTypes(){
        System.out.println("5 + 8 = " + add(5,8));
        System.out.println("10 - 8 = " + subtract(10, 8));
        System.out.println("5 * 8 = " + multiply(5, 8));
        System.out.println("10 / 2 = " + divide(10, 2));
        System.out.println("12 % 5 = " + remainder(12, 5));
        System.out.println("3 ^ 2 = " + exponent(3, 2));
    }

    public int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    public int subtract(int a, int b){
        int reduction = a - b;
        return reduction;
    }

    public int multiply(int a, int b){
        int product = a * b;
        return product;
    }

    public int divide(int a, int b){
        int quotient = a / b;
        return quotient;
    }

    public int remainder(int dividend, int divisor){
        int remainder = dividend % divisor;
        return remainder;
    }

    public int exponent(int base, int exponent){
        int power = 1;
        for (int x = 0; x < exponent; x++){
            power *= base;
        }
        return power;
    }

}
