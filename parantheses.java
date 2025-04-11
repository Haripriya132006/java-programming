import java.util.*;
public class parantheses {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("enter the paranthesis: ");
        String string1=input.nextLine();

        char[] stack=new char[50];
        int j=0;

        for(int i=0 ;i<string1.length();i++){
            char ch= string1.charAt(i);
            System.out.println(ch);
            if (ch=='('||ch=='{' ||ch=='['){
                stack[j]=ch;
                System.out.println("character at " + j +" "+ch);
                j++;
                
            }

            if (ch==')'){
                if (j==0){
                    System.out.println("invalid");
                    return;
                }
                if (stack[--j]=='('){
                    stack[j]=' ';

                }
                else{
                    System.out.println("invalid");
                    return;
                }
            }
            if (ch=='}'){
                if (j==0){
                    System.out.println("invalid");
                    return;
                }
                if (stack[--j]=='{'){
                    stack[j]=' ';

                }
                else{
                    System.out.println("invalid");
                    return;
                }
            }
            if (ch==']'){
                if (j==0){
                    System.out.println("invalid");
                    return;
                }
                if (stack[--j]=='['){
                    stack[j]=' ';

                }
                else{
                    System.out.println("invalid");
                    return;
                }
            }
        }
        if(j==0){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }

    }
}
