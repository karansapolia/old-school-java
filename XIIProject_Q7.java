import java.io.*;//input-output library files imported
class XIIProject_Q7//base class declaration
{
    int emp_no; double basic_pay,hra,da;
    public void input(int a, double b)//method to assign user inputted values to base class variables
    {
        emp_no=a;
        basic_pay=b;
    }//method
    public void show()
    {
        System.out.println("XIIProject_Q7.show() called");
        System.out.println("Employee Number: "+emp_no+" , Basic Pay: "+basic_pay);
    }//method
};//class
class b extends XIIProject_Q7//child class declaration
{
    public void input(int a, double b, double c)//method to assign user inputted values to current and parent class variables
    {
        emp_no=a;
        basic_pay=b;
        hra=c;
    }//method
    public void show()
    {
        super.show();//base class method call
        System.out.println("b.show() called");
        System.out.println("H.R.A. : "+hra);
    }//method
};//class
class c extends b//grand-child class declaration
{
    public void input(double d)//method to assign uer-inputted value to grand-parent class variable
    {
        da=d;
    }//method
    public void show()
    {
        System.out.println("c.show() called");
        System.out.println("D.A. : "+da);
    }//method
};//class

        
    