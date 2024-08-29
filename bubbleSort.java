public class bubbleSort {
    public static void bubble(int arr[]){
        int s=0;
        for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr.length-1-i;j++){
            if (arr[j]>arr[j+1]) {
                int tem=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=tem;
                s++;
                
            }
         }   
        }
       
        for(int i=0;i<arr.length;i++){
            System.out.print(" " +arr[i]);
        }
      System.out.println();
        System.out.println("total swappin = " +s);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        bubble(arr);
    }
    
}
