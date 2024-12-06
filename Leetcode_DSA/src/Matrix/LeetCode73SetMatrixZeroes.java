package Matrix;

public class LeetCode73SetMatrixZeroes {

	public static void main(String[] args) {
		int[][] matrix= {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		setZeroesBetter(matrix);
		
		for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

	}
	
	//Brute-Force
	private static void markRow(int i, int[][] matrix,int m){
        for(int j=0;j<m;j++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
        }
    }

     private static void markCol(int j, int[][] matrix,int n){
        for(int i=0;i<n;i++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
        }
    }
    public static void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    markRow(i,matrix,m);
                    markCol(j,matrix,n);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }
    
    //Better Approach
    
    public static void setZeroesBetter(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        int[] row=new int[n];
        int[] col=new int[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }

}
