public class SelectionSort {
    public static void main(String[] args) {
        int a[]={10,50,30,70,25,5};

        for(int i=0;i<a.length-1;i++){
            int index=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[index]){
                    index=j;
                }
            }
            int temp=a[i];
            a[i]=a[index];
            a[index]=temp;
        }
        for(int k=0;k<a.length;k++){
            System.out.println(a[k]);
        }
    }
}
