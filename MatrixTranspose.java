import java.util.Scanner;
public class MatrixTranspose {
    public static void main(String[] args){
           Scanner obj=new Scanner(System.in);
           System.out.println("Mention the size of an array");
           int row=obj.nextInt();
           int col=obj.nextInt(); 
           int[][] array=new int[row][col];
      System.out.println("Input the elements of array");
      for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            array[i][j]=obj.nextInt();
        }
      }
      
      for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            System.out.print(array[i][j]+" ");
        }
        System.out.println();
      }

      System.out.println("Transpose of this matric ");

      for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            System.out.print(array[j][i]+" ");

           }
           System.out.println();
    }
           

    }
    
}
