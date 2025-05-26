class java{
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        String[] res=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                res[i]="Even";
            }else res[i]="Odd";
        }
        for(String i: res){
            System.out.print(i+" ");
        }
        
    }
}