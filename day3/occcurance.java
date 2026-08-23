public class occurance{

     static int occurance(int a[]){
        
         for(int i=0;i<a.length;i++){
                 for(int j=i+1;j<a.length;j++){
                       if(a[i]==a[j]){
                             return a[i];
                           
                       }
                 }
         }
       return -1;
     }


    public static void main(String[] args){
            

             int a[]={1,2,2,3,4,3};
      
         int occ=occurance(a);
      System.out.println(occ);
      




}
}
