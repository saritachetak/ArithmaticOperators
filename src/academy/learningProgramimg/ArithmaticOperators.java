package academy.learningProgramimg;

public class ArithmaticOperators {
    public static void main(String[] args) {
        int unaryOperator = 10;
        int abc = 20;

        System.out.println("unary operator value is=" + unaryOperator);
//        System.out.println("unary operator value is=" + unaryOperator++);
//        System.out.println("unary operator value is=" + unaryOperator);
        System.out.println("unary operator value is=" + ++unaryOperator);

        System.out.println("unary operator value is=" + unaryOperator);

        System.out.println("unary operator value is=" + ++abc);


        int result = 3-(2+2)*(2+3); //bodmas

        //3-4*2+3
        //3-8+3
        //-5+3
        //2

        System.out.println("print result = "+result);

        result = 4/2+1-4*2+10;

        System.out.println("print result = "+result);

        int a = 4;

        int b = 3-2*--a;//a = a-1

        //3-2*3
        //3-6
        //-3

        a = 4;
        b = 3-2*a--;//

        //

        System.out.println("print b = "+b);
        System.out.println(a);
    }
}
