// import java.util.Arrays;

public class ShellSort {
    void shellsort(int array[],int size)
    {
        for(int interval=size/2;interval>0;interval=interval/2)
        {
            for(int i=interval;i<size;i++)
            {
                int temp=array[i];
                    int j;   
                for(j=i;j>=interval && array[j-interval]>temp;j=j-interval)
                {
                    array[j]=array[j-interval];
                }
            array[j]=temp;
            }
        }
    }
    public static void main(String args[])
    {
        int array[]={12,4,7,15,2,1,0};
        int size=array.length;
        ShellSort obj=new ShellSort();
        obj.shellsort(array,size);

        for(int i:array)
        System.out.print(i + " ");
    }
}
