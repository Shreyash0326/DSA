import java.util.HashSet;
import java.util.Scanner;

public class SetMatrixZeros {
    
public static void setZeros(int [][]arr){
    
    int n = arr.length;
    int m = arr[0].length;
    HashSet<Integer> row = new HashSet<>();
    HashSet<Integer> col = new HashSet<>();

    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++) {
            if(arr[i][j] == 0) {
                row.add(i);
                col.add(j);
            }
        }
    }

    for(int i=0; i<n; i++){
        if(row.contains(i)) {
            for(int j = 0; j<m; j++){
                arr[i][j] = 0;
            }
        } 
    }

    for(int j=0; j<m; j++){
        if(col.contains(j)) {
            for(int i=0; i<n; i++){
                arr[i][j] = 0;
            }
        }
    }

    for(int i=0; i<n; i++) {
        System.out.println();
        for(int j=0; j<m; j++) {
            System.out.print(arr[i][j]);
        }
    }
}

   
    
 

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int  n =sc.nextInt();
    int m = sc.nextInt();
    int [][] arr = new int[n][m];
    

    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++) {
            arr[i][j] = sc.nextInt();
        }
    }
    
   setZeros(arr);
}
}
