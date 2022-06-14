import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[0].length ; j++){
                 arr[i][j] = scan.nextInt();
            }
        }

        int minr = 0;
        int minc = 0;
        int maxr = arr.length-1;
        int maxc = arr[0].length-1;
        int tne = n * m;

        while(tne>0){
            for (int i = minr, j = minc ; i <= maxr && tne>0 ;i++){
                System.out.println(arr[i][j]);
                tne--;
            }
            minc++;
            for (int i = maxr, j = minc ; j <=maxc && tne>0;j++){
                System.out.println(arr[i][j]);
                tne--;
            }
            maxr--;

            for (int i = maxr, j = maxc ; i >= minr && tne>0 ;i--){
                System.out.println(arr[i][j]);
                tne--;
            }
            maxc--;
            for (int i = minr, j = maxc ; j >= minc && tne>0;j--){
                System.out.println(arr[i][j]);
                tne--;
            }
            minr++;
        }
    }
}
