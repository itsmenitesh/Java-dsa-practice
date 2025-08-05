public class q18 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        matrixAddition(matrix1,matrix2);
        matrixMultiplication(matrix1,matrix2);

        matrixTranspose(matrix2);
    }
    static void matrixAddition(int [][] matrix1,int [][]matrix2){
        int [][]add = new int[matrix1.length][matrix1[0].length];
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j< matrix1[0].length;j++){
                add[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }

        for(int i=0;i<add.length;i++){
            for(int j=0;j<add[0].length;j++){
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void matrixMultiplication(int [][] matrix1,int [][]matrix2){
        int [][]multi = new int[matrix1.length][matrix1[0].length];
        if(matrix1.length!=matrix2.length){
            System.out.println("size is not same multiplication not possible");
            return;
        }
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j< matrix2[0].length;j++){
                for(int k=0;k<matrix1[0].length;k++){
                    multi[i][j] += matrix1[i][k]+matrix2[k][j];
                }
            }
        }

        for(int i=0;i<multi.length;i++){
            for(int j=0;j<multi[0].length;j++){
                System.out.print(multi[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void matrixTranspose(int [][]matrix2){
        int [][]transpose = new int[matrix2.length][matrix2[0].length];

        for(int i=0;i<matrix2.length;i++){
            for(int j=0;j< matrix2[0].length;j++){
                transpose[j][i]=matrix2[i][j];
            }
        }

        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
}
