public class Reversearray {

   public static void arrReplace(int arr[]){

    for(int i=0,j=arr.length-1;i<(arr.length-1)/2;i++,j--){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        }
        for(int k:arr){
            System.out.print(k+" ");
        }

    }
    
    public static void main(String [] args){

        int[] arr={1,2,3,4,5,6,7};
        arrReplace(arr);
    }
}
