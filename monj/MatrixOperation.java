package monj;

public class MatrixOperation {
    public int [][] dotMatrix(int[][] a,int [][]b) {
        int [][] c = new int[3][3];
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                for(int k=0;k<3;k++) {
                    c[i][j]+= a[i][k]*b[k][j];
                }
            }
        }
        return c;
    }
    public void printResult(int [][] a){
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] a = {{1, 2, 1}, {1, 1, 0}, {2, 2, 1}};
        int[][] b = {{1, 2, 2}, {1, 2, 0}, {1, 0, 1}};

        MatrixOperation m = new MatrixOperation();
        int[][]result = m.dotMatrix(a, b);
        m.printResult(result);
    }
}
