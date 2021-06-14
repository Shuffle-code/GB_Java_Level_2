public class Calculator {
    private String[] arr;
    private int i;

    public static void main(String[] args) {
        String expr = "1 * 2 - 12 / ( 6 - 3 ) - 4 + 6 + 7";
        Calculator calculator = new Calculator(expr);
        System.out.println(calculator.calculate());
    }

    public Calculator(String expr) {
        this.arr = expr.split(" ");
        this.i = 0;
    }
    public double calculate(){
        double first = multiply();
        while (i < arr.length){
            String operator = arr[i];
            if(!operator.equals("+") && !operator.equals("-")){
                break;
            } else {
                i++;
            }
            double second = multiply();
            if (operator.equals("+")){
                first = first + second; //first += second;
            }else {
                first -= second;
            }

        }
        return first;
    }
    public double multiply(){
//        String[] arr = new String[];

        double first = factor();
//        double first = Double.parseDouble(arr[i++]);
        while (i < arr.length){
            String operator = arr[i];
            if(!operator.equals("*") && !operator.equals("/")){
                break;
            } else {
                i++;
            }
            double second = factor();
//            double second = Double.parseDouble(arr[i++]);
            if (operator.equals("*")){
                first = first * second; //first += second;
            }else {
                first /= second;
            }
        }
        return first;
    }
    public double factor(){
        String next = arr[i];
        double result;
        if (next.equals("(")){
            i ++;
            result = calculate();
            String closingBracket;
            if (i < arr.length){
                closingBracket = arr[i];
            } else {
                throw new IllegalArgumentException("Unexpected end of expression");
            }
            if (closingBracket.equals(")")){
                i++;
                return result;
            }
            throw new IllegalArgumentException("')' expected dut " + closingBracket + "did not have");
        }
        i ++;
        return Double.parseDouble(next);
    }
}

