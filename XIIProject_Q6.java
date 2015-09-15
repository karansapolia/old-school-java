import java.io.*;//input-output library files imported
class XIIProject_Q6//class declaration
{
    int i=1,x,y,gcd=0;
    protected void input()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));//buffer activated
        System.out.println("Input the two numbers whose GCD is to be found out.");
        x=Integer.parseInt(in.readLine());
        y=Integer.parseInt(in.readLine());
        if(x<y)//logic for functino calling and argument passing
        recursion(x,i);
        else
        recursion(y,i);
        System.out.println("G.C.D. of "+x+" and "+y+" is "+gcd+".");
        i=1;x=0;y=0;gcd=0;//re-intialising values to allow re-use of the same object
    }//method
    private void recursion(int b,int a)//recursive function 
    {
        while(a<=b)//logic for finding gcd
        {
            if(((x%a)==0)&&(y%a==0))
            gcd=a;
            recursion(b,++a);
        }
    }//method
}//class
        