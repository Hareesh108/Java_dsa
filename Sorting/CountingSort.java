public class CountingSort {
    void countingsort(int array[],int size)
    {
        int[] output=new int[size+1];
        
        int max=array[0];
        
        for(int i=1;i<size;i++) //for max element calculation
        {
            if(array[i]>max)
                max=array[i];
        }
    
        int[] count=new int[max+1];
        
        for(int i=0;i<max;i++)
        {
            count[i]=0;  //initialization to array elements to zero
        }
        
        for(int i=0;i<size;i++)
        {
            count[array[i]]++;
        }
        
        for(int i=1;i<=max;i++)   //cumulative sum calculations
        {
            count[i]=count[i]+count[i-1];
        }
        
        for(int i=size-1;i>=0;i--)
        {
            output[count[array[i]]-1]=array[i];
            count[array[i]]--;
        }
        for(int i=0;i<size;i++)
        {
            array[i]=output[i];
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
        int[] array={4,0,0,2,4,1};
        int size=array.length;
        CountingSort obj = new CountingSort();
        obj.countingsort(array,size);
        obj.display(array);

    }
}
