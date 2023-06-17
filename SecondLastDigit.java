public class SecondLastDigit {
    public static int main(String[] args) {
        int input1 = 2244;
        int i = (input1 % 100) /10;
        if (i<0){
            i = -1 * i;
            return i;
        }

        else if (input1< 10 && input1> -10){
            return -1;
        }

        else  {
            return i;
        }
        
    }
    
}
