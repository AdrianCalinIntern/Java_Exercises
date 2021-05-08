package arraysExercices;

public class Arrays {
    public static void main(String[] args) {

        double[] leftVar = {100.0d, 25.4d, 10.19d};
        double[] rightVar = {150.0d, 2.4d, 1.19d};
        //char[] op = {'d', 'a', 's', 'm'};
        //double[] result = new double[op.length];

        
    }
    static double myMethod(char op, double leftVar, double rightVar){
        double result;
        switch (op){
            case 'd':
                result = leftVar - rightVar;
                break;
            case 'a':
                result = leftVar + rightVar;
                break;
            case 's':
                result = leftVar * rightVar;
                break;
            case 'm':
                result = leftVar % rightVar;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + op);
        }
        return result;
    }


}
