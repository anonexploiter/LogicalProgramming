public class EncodingThreeString {
    public static void main(String[] args) {
        String input1 = "John";
        String input2 = "Johny";
        String input3 = "Janardhanan";
        String[] str = {input1 , input2, input3};
        int n = 0;
        String first = "" ,middle = "" ,last= "";
        for(int i = 0;i<3;i++){
            if(str[i].length()%3==0){
            n = str[i].length()/3;
            first +=str[i].substring(0,n);
            middle +=str[i].substring(n,str[i].length()-n);
            last +=str[i].substring(str[i].length()-n,str[i].length());
            }

            if(str[i].length()%3==1){
            n = str[i].length()/3;
            first +=str[i].substring(0,n);
            middle +=str[i].substring(n,str[i].length()-n);
            last +=str[i].substring(str[i].length()-n,str[i].length());
            }

            if(str[i].length()%3==2){
            n = str[i].length()/3;
            first +=str[i].substring(0,n+1);
            middle +=str[i].substring(n+1,str[i].length()-n-1);
            last +=str[i].substring(str[i].length()-n-1,str[i].length());
            }
            

        }
        System.out.println(first);
        System.out.println(middle);
        System.out.println(last.toUpperCase());
       
        
        
    }
        
    }
    
