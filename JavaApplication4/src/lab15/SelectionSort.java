/*
 *Author: Ahmed Alharbi
 * Date: 04/07/2024
 *Project overview: Sort an array using Selection 
 *sort method
 *
 *Resources:
 *1-Chapter 07: Arrays( Nicholas M. Stiffler).
 *
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] num = {1,12,32,12,11,0};
        for (int i = 0; i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        SelectionSort(num);
        System.out.println();
        for (int i = 0; i<num.length;i++){
            System.out.print(num[i]+" ");
        }

    }
    public static int[] SelectionSort(int[] array){
        int[] num = array.clone();
        int i,j;
        int smallest;
        int temp;


        for(i= num.length-1;i>0;i-- )
        {
            smallest= 0;
            for (j=1;j<=i;j++)
            {
                if (num[j]<num[smallest])
                {
                    smallest=j;
                }
            }
            temp = num[i];
            num[i] =num[smallest];
            num[smallest]= temp;

        }

        return num;
    }
}