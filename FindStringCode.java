public class FindStringCode {
    public static void main(String[] args) {
        String input1 = "WORLD WIDE WEB";
        String[] str = input1.split(" "); //split the string by whitespace and store into an array
        String value = "";
        for (int i = 0; i < str.length; i++) { //creating the index of splitted values 
            int add = 0;
            for (int j = 0; j < str[i].length()/2; j++) { //seprate the words length to 2 by index 
                int first = str[i].charAt(j);
                int last = str[i].charAt(str[i].length()-1-j);
                add += Math.abs(first - last);
            }

            if(str[i].length()%2!=0){ //length of the word is not divisible 2 
                add += (str[i].charAt(str[i].length()/2)-64);
            }
            String val = Integer.toString(add);  //stores value into the variable
            value+= val; //concatenate the string
            

            
        }
            //return Integer.parseInt(value);
            System.out.println(Integer.parseInt(value)); //display the string by type converstion...

    }
}
