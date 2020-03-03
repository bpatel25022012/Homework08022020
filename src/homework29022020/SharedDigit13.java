package homework29022020;

import java.lang.String;
public class SharedDigit13 {



    public static boolean hasSharedDigit(int number1,int number2){
        if(number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99)
            return false;
        while(number1 > 0){
            int secondNumber = number2;
            int firstNumber = number1;
            while (secondNumber > 0 ){
                if(firstNumber%10 == secondNumber% 10){
                    return true;
                }
                secondNumber /= 10;
            }
            number1 /= 10;
        }
        return false;

    }

    public static void main(String[] args) {
        hasSharedDigit(12, 23);
    }
}