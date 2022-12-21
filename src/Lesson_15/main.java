package Lesson_15;

import org.apache.log4j.Logger;

public class main {
    public static final Logger LOGGER= Logger.getLogger(main.class);
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static int standartfactorial(int x){
        int result =1;
        for (int i = 0; i <=x ; i++) {
            result=result*x;
        }
        LOGGER.error("Call from method standartfactorial");
        return result;
    }
    public static int factorial(int x){
        if(x==1){
            return 1;
        }
        LOGGER.error("Call from method factorial");
        return x*factorial(x-1);
    }
}
