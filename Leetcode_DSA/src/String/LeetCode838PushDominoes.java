package String;

public class LeetCode838PushDominoes {

	public static void main(String[] args) {
		String dominoes="RR.L..RLL..RR";
		System.out.println(pushDominoes(dominoes));

	}
	public static String pushDominoes(String dominoes) {
        char[] domino=dominoes.toCharArray();
        int n=domino.length;
        int[] left=new int[n];
        int leftForce=-1;
        
        for(int i=n-1;i>=0;i--){
            if(domino[i]=='L'){
                leftForce=i;
            }
            else if(domino[i]=='R'){
                leftForce=-1;
            }
            left[i]=leftForce;
        }
        
        int[] right=new int[n];
        int rightForce=-1;
        for(int i=0;i<n;i++){
            if(domino[i]=='R'){
                rightForce=i;
            }
            else if(domino[i]=='L'){
                rightForce=-1;
            }
            right[i]=rightForce;
        }
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<n;i++){
            if(domino[i]=='.'){
                int nextLeft=left[i];
                int nextRight=right[i];
                
                int leftDiff=nextLeft==-1?Integer.MAX_VALUE:Math.abs(nextLeft-i);
                int rightDiff=nextRight==-1?Integer.MAX_VALUE:Math.abs(nextRight-i);
                
                if(leftDiff==rightDiff){
                    sb.append(".");
                }
                else if(leftDiff<rightDiff){
                    sb.append("L");
                }
                else if(leftDiff>rightDiff){
                    sb.append("R");
                }
            }
            else{
                sb.append(domino[i]);
            }
        }
        return sb.toString();
    }
}

