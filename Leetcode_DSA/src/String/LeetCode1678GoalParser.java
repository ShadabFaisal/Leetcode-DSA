package String;

public class LeetCode1678GoalParser {

	public static void main(String[] args) {
		System.out.println(interpret("G()(al)"));
	}
	
public static String interpret(String command) {
        
        String s1="";
        for(int i=0;i<command.length();i++){
            char ch= command.charAt(i);
            
            if(ch=='G'){
                s1=s1+ch;
            }
            else if(ch=='(' && command.charAt(i+1)==')'){
                s1=s1+"o";
            }
            else if(ch=='a' && command.charAt(i+1)=='l'){
                s1=s1+"al";
            }
        }
        return s1;
    }

}
