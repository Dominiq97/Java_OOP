/**
 *
 * @author Dominic
 */
public class MatrixOperations {
    
     public static double[][] matrixAdd(double m1[][], double m2[][]){
        double [][] matrix = new double[m1.length][m1.length];
        for(int i = 0;i<m1.length;i++){
            for(int j = 0;j<m1.length; j++){
                matrix[i][j] = m1[i][j]+m2[i][j];
            }
        }
        
        return matrix;
    }
    
    public static double matrixDiagSum(double m1[][]){
        int sum= 0;
        for(int i = 0;i<m1.length;i++){
            for(int j = 0;j<m1.length;j++){
                if (i==j){
                    sum += m1[i][j];
                }
            }
        }
        return sum;
    } 
   
    
    public static void main(String[] args) {
        double [][] mat1 = new double[][]{
            {4,2,3,4},
            {5,11,7,8},
            {9,0,3,2},
            {3,4,5,10}
    };
        
        double [][] mat2 = new double[][]{
            {1,54,1,3},
            {0,43,6,3},
            {3,7,4,0},
            {9,5,3,3}
        };
   
            
        
        System.out.println(matrixDiagSum(mat1));
      //  matrixAdd(mat1, mat2);
        /*for(int i = 0;i<mat1.length; i++){
            for (int j = 0; j<mat1.length; j++){
                System.out.print(matrixAdd(mat1, mat2)+" ");
            }
            System.out.println();
        } 
*/
        double sm[][] = new double[mat1.length][mat1.length];
        sm.matrixAdd(mat1,mat2);
        for(int i = 0;i<mat1.length;i++){
            for(int j = 0;j<mat1.length;j++){
                System.out.print(sm[i][j]+" ");
            }
            System.out.println();
        }
        
        
        
        
         
        
    }
    
}