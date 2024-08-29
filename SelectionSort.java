import java.nio.channels.Pipe.SourceChannel;

public class SelectionSort {

    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){

            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={9,6,8,7,4,3,2,10,1};
        selection(arr);
    }
    
}
