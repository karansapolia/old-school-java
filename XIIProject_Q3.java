import java.io.*;//input-output library file imported
class XIIProject_Q3//class declaration
{
    private int array[][];//array reference declared
    private int i,j;//variables for running the loop
    private int m,n;//variable to define number of rows and columns of the array
    private int r=0,c=0,s=0,countr=1,k;//variables to define the row, column of the saddle point. counter variable for saddle verifiction
    protected void input()throws IOException//function to accept parameters from the user
    {   
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));//buffer activated
        System.out.println("Input the number of rows and columns in the array");
        m=Integer.parseInt(in.readLine());
        n=Integer.parseInt(in.readLine());
        array=new int[m][n];//array initialised
        System.out.println("Input positive and negative integers to the array in row major form, to find the saddle point");
        for(i=0;i<m;i++)//logic for accepting array members
        {
            for(j=0;j<n;j++)
            {
                System.out.println("Input element belonging to position ("+i+" , "+j+")");
                array[i][j]=Integer.parseInt(in.readLine());
            }
        }
        display_input();//method call
        logic();//method call
    }//method
    private void logic()//function to check for saddle point
    {
        for(i=0;i<m;i++)//logic for finding saddle point using row major element comparison
        {
            s=array[i][0];//initalising saddle point to first element of each row
            for(j=0;j<n;j++)//finding least element of a row
            {
                if(array[i][j]<s)
                {
                    s=array[i][j];countr=1; r=i; c=j;
                }
            }
            for(k=0;k<m;k++)//finding greatest element of a column
            {
                if(array[k][c]>s)
                {
                    countr=0; break;
                }
            }
            if(countr==1)
            System.out.println("Saddle Point "+i+" is "+array[r][c]+" at "+(r+1)+" rows and "+(c+1)+" columns.");
        }
        i=0;j=0;m=0;n=0;r=0;c=0;s=0;countr=1;k=0;//initialising values for reuse with the same object
    }//method
    private void display_input()//function to display the inputted array
    {
        for(i=0;i<m;i++)//araay display logic
        {
            for(j=0;j<n;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }//method
}//class
        
        