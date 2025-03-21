import java.util.*;
public class methods_level3_Question13 {
    public static int[][] randomMatrix(int rows, int columns){
        int[][] matrix= new int[rows][columns];
        Random rand= new Random();
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                matrix[i][j]= rand.nextInt(10);

            }
        }
        return matrix;

    }
    public static int[][] additionOfMatrix(int rows, int columns){
        int[][] firstMatrix = randomMatrix(rows, columns);
        int[][] secondMatrix = randomMatrix(rows, columns);
        int[][] sumMatrix = new int[rows][columns];
        if (rows==columns) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                }
            }
        }
        else{
            throw new ArithmeticException("Matrix addition cannot be performed with array of different sizes");
        }
        return sumMatrix;
    }
    public static int[][] subtractionOfMatrix(int rows, int columns){
        int[][] firstMatrix=randomMatrix(rows,columns);
        int[][] secondMatrix=randomMatrix(rows,columns);
        int[][] differenceMatrix= new int[rows][columns];
        if (rows==columns) {
        for(int i=0; i<rows;i++) {
            for (int j = 0; j < columns; j++) {
                differenceMatrix[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
            }
        }
        }
        else{
            throw new ArithmeticException("Matrix Subtraction cannot be performed with array of different sizes");
        }
        return differenceMatrix;
    }
    public static int[][] productOfMatrix(int rows, int columns){
        int[][] firstMatrix=randomMatrix(rows,columns);
        int[][] secondMatrix=randomMatrix(rows,columns);
        int[][] productMatrix= new int[rows][columns];
        if (rows==columns) {
        for(int i=0; i<rows;i++) {
            for (int j = 0; j < columns; j++) {
                productMatrix[i][j] = firstMatrix[i][j] * secondMatrix[j][i];
            }
        }
        }
        else{
            throw new ArithmeticException("Matrix multiplicaton cannot be performed with array of different sizes");
        }
        return productMatrix;
    }
    public static int[][] transposeOfMatrix(int [][] matrix, int rows, int columns){
        int[][] firstMatrix=matrix;
        int[][] transposeMatrix= new int[columns][rows];
        for(int i=0; i<rows;i++){
            for(int j=0; j<columns;j++){
                transposeMatrix[j][i]=firstMatrix[i][j];
            }
        }
        return transposeMatrix;
    }
    public static int[][] twoCrossTwoMatrix(){
        int[][] twoCrossTwoMatrixArray= new int[2][2];
        Random rand= new Random(10);
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                twoCrossTwoMatrixArray[i][j]= rand.nextInt();

            }
        }
        return twoCrossTwoMatrixArray;
    }
    public static int[][] threeCrossThreeMatrix() {
        int[][] threeCrossThreeMatrixArray = new int[3][3];
        Random rand = new Random(10);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                threeCrossThreeMatrixArray[i][j] = rand.nextInt();

            }
        }
        return threeCrossThreeMatrixArray;
    }


    public static int determinantOf2x2Matrix(int [][] twoCrossTwoMatrixArray){
        int determinant2x2=(twoCrossTwoMatrixArray[0][0]*twoCrossTwoMatrixArray[1][1])-(twoCrossTwoMatrixArray[0][1]*twoCrossTwoMatrixArray[1][0]);
        return determinant2x2;
    }
    public static int determinantOf3x3Matrix(int [][]threeCrossThreeMatrixArray){
        int x=threeCrossThreeMatrixArray[0][0] *(threeCrossThreeMatrixArray[1][1]*threeCrossThreeMatrixArray[2][2])-(threeCrossThreeMatrixArray[2][1]*threeCrossThreeMatrixArray[1][2]);
        int y= threeCrossThreeMatrixArray[0][1]*(threeCrossThreeMatrixArray[1][0]*threeCrossThreeMatrixArray[2][2])-(threeCrossThreeMatrixArray[2][0]*threeCrossThreeMatrixArray[1][2]);
        int z= (threeCrossThreeMatrixArray[0][2]*threeCrossThreeMatrixArray[2][1])-(threeCrossThreeMatrixArray[2][0]*threeCrossThreeMatrixArray[1][1]);
        int determinant3x3= x-y+z;
        return determinant3x3;
    }
    public static double[][] inverseOf2x2Matrix(int determinant2x2, int[][] twoCrossTwoMatrixArray){
        double [][] inverse2x2MatrixArray= new double[2][2];
        if(determinant2x2!=0){
            inverse2x2MatrixArray[0][0] = (twoCrossTwoMatrixArray[1][1])/ determinant2x2;
            inverse2x2MatrixArray[0][1] = (-twoCrossTwoMatrixArray[1][0]) /determinant2x2;
            inverse2x2MatrixArray[1][0] = (-twoCrossTwoMatrixArray[0][1]) /determinant2x2;
            inverse2x2MatrixArray[1][1] = (twoCrossTwoMatrixArray[0][0]) /determinant2x2;
        }
        else {
            throw new ArithmeticException("Matrix is singular");
        }
        return inverse2x2MatrixArray;
    }

    public static double[][] inverseOf3x3Matrix(int[][] threeCrossThreeMatrixArray, int determinant3x3) {
        double[][] adjacentMatrix = new double[3][3];

        adjacentMatrix[0][0] =  (threeCrossThreeMatrixArray[1][1] *threeCrossThreeMatrixArray[2][2] - threeCrossThreeMatrixArray[1][2] * threeCrossThreeMatrixArray[2][1]);
        adjacentMatrix[0][1] = -(threeCrossThreeMatrixArray[1][0] * threeCrossThreeMatrixArray[2][2] - threeCrossThreeMatrixArray[1][2] * threeCrossThreeMatrixArray[2][0]);
        adjacentMatrix[0][2] =  (threeCrossThreeMatrixArray[1][0] * threeCrossThreeMatrixArray[2][1] - threeCrossThreeMatrixArray[1][1] * threeCrossThreeMatrixArray[2][0]);

        adjacentMatrix[1][0] = -(threeCrossThreeMatrixArray[0][1] * threeCrossThreeMatrixArray[2][2] - threeCrossThreeMatrixArray[0][2] * threeCrossThreeMatrixArray[2][1]);
        adjacentMatrix[1][1] =  (threeCrossThreeMatrixArray[0][0] * threeCrossThreeMatrixArray[2][2] - threeCrossThreeMatrixArray[0][2] * threeCrossThreeMatrixArray[2][0]);
        adjacentMatrix[1][2] = -(threeCrossThreeMatrixArray[0][0] * threeCrossThreeMatrixArray[2][1] - threeCrossThreeMatrixArray[0][1] * threeCrossThreeMatrixArray[2][0]);

        adjacentMatrix[2][0] =  (threeCrossThreeMatrixArray[0][1] * threeCrossThreeMatrixArray[1][2] - threeCrossThreeMatrixArray[0][2] * threeCrossThreeMatrixArray[1][1]);
        adjacentMatrix[2][1] = -(threeCrossThreeMatrixArray[0][0] * threeCrossThreeMatrixArray[1][2] - threeCrossThreeMatrixArray[0][2] * threeCrossThreeMatrixArray[1][0]);
        adjacentMatrix[2][2] =  (threeCrossThreeMatrixArray[0][0] * threeCrossThreeMatrixArray[1][1] - threeCrossThreeMatrixArray[0][1] * threeCrossThreeMatrixArray[1][0]);

        double[][] inverse3x3MatrixArray = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse3x3MatrixArray[i][j] = adjacentMatrix[i][j] / determinant3x3;
            }
        }

        return inverse3x3MatrixArray;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the row.");
        int rows=sc.nextInt();
        System.out.println("Enter the row.");
        int columns=sc.nextInt();
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("Random Matrix");
        int[][] matrix= randomMatrix(rows,columns);
        for (int i=0; i<rows; i++){
            for(int j=0; j<columns;j++){
                System.out.println("element "+(i)+(j)+" "+matrix[i][j]);
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("Addition of 2 matrices");
        int[][]sumMatrix=additionOfMatrix(rows,columns);
        for (int i=0; i<rows; i++){
            for(int j=0; j<columns;j++){
                System.out.println("element "+(i)+(j)+" "+sumMatrix[i][j]);
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("subtraction of 2 matrices");
        int[][] differenceMatrix=subtractionOfMatrix(rows,columns);
        for (int i=0; i<rows; i++){
            for(int j=0; j<columns;j++){
                System.out.println("element "+(i)+(j)+" "+differenceMatrix[i][j]);
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("product of 2 matrices");
        int[][] productMatrix=productOfMatrix(rows, columns);
        for (int i=0; i<rows; i++){
            for(int j=0; j<columns;j++){
                System.out.println("element "+(i)+(j)+" "+productMatrix[i][j]);
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("transpose of a matrix");
        int[][]transposeMatrix=transposeOfMatrix(matrix,rows,columns);
        for (int i=0; i<rows; i++){
            for(int j=0; j<columns;j++){
                System.out.println("element "+(i)+(j)+" "+transposeMatrix[i][j]);
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");
        int[][] twoCrossTwoMatrixArray=twoCrossTwoMatrix();
        int[][] threeCrossThreeMatrixArray= threeCrossThreeMatrix();
        int determinant2x2 =determinantOf2x2Matrix(twoCrossTwoMatrixArray);
        System.out.println("The determinant of the 2x2 matrix is "+determinant2x2);
        System.out.println("--------------------------------------------------------------------------------------------------------");
        int determinant3x3 =determinantOf3x3Matrix(threeCrossThreeMatrixArray);
        System.out.println("The determinant of the 3x3 matrix is "+determinant3x3);
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("inverse of a 2x2 Matrix");
        double[][]inverse2x2MatrixArray=inverseOf2x2Matrix(determinant2x2,twoCrossTwoMatrixArray);
        for(int i=0; i<2;i++){
            for(int j=0; j<2;j++){
                System.out.println("element "+i+j+" "+inverse2x2MatrixArray[i][j]);
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");
        double[][] inverse3x3MatrixArray=inverseOf3x3Matrix(threeCrossThreeMatrixArray,determinant3x3);
        System.out.println("inverse of a 3x3 Matrix");
        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                System.out.println("element "+i+j+" "+inverse3x3MatrixArray[i][j]);
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");

    }
}
