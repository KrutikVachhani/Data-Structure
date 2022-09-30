public class Sort {
    public static void main(String[] args) {
        int a[]={5,10,50,15,20,75,25};

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length-i-1; j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int k=0; k<a.length; k++){
            System.out.println(a[k]);
        }
    }
}
