class QuickSort
{
     int partition(int array[],int low, int high)
    {
        int pivot=array[high];
        int i=low-1;
        
        for(int j=low;j<high;j++)
        {
            if(array[j]<=pivot)
            {
                i++;
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        
        int temp=array[i+1];
        array[i+1]=array[high];
        array[high]=temp;
        
        return (i+1);
          
    }
    
    void display(int array[])
    {
        int n=array.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    
    
    void quicksort(int array[],int low,int high)
    {
        if(low<high)
        {
            int p=partition(array,low,high);
            
            quicksort(array,low,p-1);  //left side
            quicksort(array,p+1,high);  //right side
        }
    }
    
   public static void main(String[] args)
    {
        QuickSort obj = new QuickSort();
        int[] array={45,12,0,-6,3,-2,10};
        int size=array.length;
        obj.quicksort(array,0,size-1);

        obj.display(array);
        
    }
  }