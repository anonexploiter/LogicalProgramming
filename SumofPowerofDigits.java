public class SumofPowerofDigits {
    public static void main(String[] args) {
        int input1 = 123;
        String  str = String.valueOf(input1);
        int sum = 1;
        for (int i = 0; i < str.length()-1; i++) {
            int digit  = Integer.parseInt(String.valueOf(str.charAt(i)));
            int pow = Integer.parseInt(String.valueOf(str.charAt(i+1)));
            sum += Math.pow(digit, pow);
        }

        System.out.println(sum);    

    }
}
