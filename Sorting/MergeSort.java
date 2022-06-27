public class MergeSort {
    
    void merge(int array[],int left,int mid,int right)
    {
        int n1=mid-left+1;
        int n2=right-mid;
        
        int L[]=new int[n1];
        int M[]=new int[n2];
        
        for(int i=0;i<n1;i++)
           L[i]=array[left+i];
        
        for(int j=0;j<n2;j++)
            M[j]=array[mid+1+j];
        
        int i,j,k;
        i=0;
        j=0;
        k=left;
        
       while(i<n1 && j<n2)
       {
           if(L[i]<=M[j])
           {
               array[k]=L[i];
               i++;
           }
           else
           {
               array[k]=M[j];
               j++;
           }
       k++;
       }
       
       while(i<n1)
       {
           array[k]=L[i];
           i++;
           k++;
       }
       
       while(j<n2)
       {
           array[k]=M[j];
           j++;
           k++;
       }
           
    }
    
    
    void mergesort(int array[],int l, int r)
    {
        if(l<r)
        {
            int m=(l+r)/2;
            
            mergesort(array,l,m);
            mergesort(array,m+1,r);
            
            merge(array,l,m,r);
        }
    }
    
    void display(int array[])
    {
        int n=array.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    
    
    public static void main(String[] args)
    {
        int[] array={45,12,0,-6,3,-2,10};
        MergeSort obj=new MergeSort();
        obj.mergesort(array,0,array.length-1);
        obj.display(array);
    }
}
