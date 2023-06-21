

public class seprator {

    public static void main(String[] args) {
        String string = "system";
        // Extract odd and even position characters from the string
        String odd = "";
        String even = "";
        for (int i = 0; i < string.length(); i++) {
            if ((i+1) % 2 == 0) {
                even += string.charAt(i);
            } else {
                odd += string.charAt(i);
            }
        }

        String result = odd + even;        // Concatenate the odd and even position characters
        System.out.println(odd);
        System.out.println(even);
        System.out.println(result);
    }
}
