import java.lang.*;
import java.util.*;
public class  To_create_a_2D_Array_and_Copy_the_2D_Array_into_a_single_dimension_array{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows.");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns.");
		int columns= sc.nextInt();
		int n=rows*columns;
		int[] oneDimensionalArray = new int[n];
		int[][] twoDimensionalArray = new int[rows][columns];
		for (int i=0;i<rows;i++){
			for(int j=0; j<columns; j++){
				twoDimensionalArray[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<rows;i++){
			for (int j=0; j<columns; j++){
				System.out.println("row "+i+" column "+j+" " + twoDimensionalArray[i][j]);
			}
		}
		int index=0;
		for (int i=0;i<rows;i++){
			for (int j=0; j<columns; j++){
				oneDimensionalArray[index]=twoDimensionalArray[i][j];
				index++;
			}
			}
		for (int i=0; i<(rows*columns); i++){
				System.out.println(oneDimensionalArray[i]);
			}
		}
}
			