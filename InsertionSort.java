public class InsertionSort {
    public static void insertion(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;

            while (prev>=0&&arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;
                
            }
            arr[prev+1]=curr;
        }
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");}
        
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,6,7,2,8,1};
        insertion(arr);

    }
}
