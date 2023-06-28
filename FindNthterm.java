/*Form the series such that the gap between c and its next element (say d) should be the same as the gap between a and b. Similarly, the gap between c’s next element (d) and d’s next element (say e) should be the same as the gap between b and c.
Find and return the Nth element.
Example1- If the three numbers are a=1, b=3, c=6 and N=17
The series will be formed as below –
1, 3, 6, 8, 11, 13, 16, 18, 21, 23, 26, 28, 31, 33, 36, 38, 41
17 th number in the series is 41 */


public class FindNthterm{
    public static void main(int input1 , int input2 ,int input3, int input4) {

        int firstG = input2 - input1; 
        int secondG = input3 - input2;
        int output = input1;
        for(int i = 0; i < input4;++i ){
            if(i%2==1){
                output+=firstG;
            }
            else{
                output+=secondG;
            }
        }
        System.out.println(output);
    }
}