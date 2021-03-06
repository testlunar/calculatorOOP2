import java.sql.SQLOutput;

public class Calculator {
    /*
     * @author Diana Umudova
     * Калькулятор ООП
     */


    public static void main(String[] args) throws Exception {

        double num1 = GetData.getDouble();
        double num2 = GetData.getDouble();
        char operator = GetData.getOperator();

        double res = result(num1, num2, operator);
        System.out.printf("Результат = " + num1 + " " + operator + " " + num2 + " = " + "%.2f", res);
    }





        public static double result(double num1, double num2, char operator) throws Exception {


            double result = 0.0;
            switch (operator) {

                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;

                    case '/':

                            if (num2 == 0.0) {
                                throw new Exception("Нельзя делить на ноль");
                            }
                            result = num1 / num2;
                            break;
                default:
                    return result;
            }
            return result;
        }
    }


