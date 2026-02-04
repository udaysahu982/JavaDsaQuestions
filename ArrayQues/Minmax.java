
public class Minmax{

    public void min(int[] arr){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int i: arr){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        System.out.println("MAx value is = " + max + "\nMin value is = " + min);
    }
    public static void main(String[] args) {
        int arr[]={1,30,4,5,10,4,6};
        Minmax obj=new Minmax();
        obj.min(arr);
    }
}