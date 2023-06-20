public class GetAdditionThroughString {
     public static void main(String[] args) {
        String input1 = "The Weather is good";
        String[] word = input1.split("\\s"); //split the string by whitespaces
        int sum =0;
        for(int i = 0; i < word.length; i++) {
            sum += word[i].length(); //adding the splitted string
        }
        
        int temp = 0;
        while(sum>0){
            temp += sum%10; //splitting the integer by last digit
            sum/=10;
        }        

        System.out.println(temp);//adding the integer
}
}
