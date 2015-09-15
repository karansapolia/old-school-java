import java.io.*;//input-output library files imported
class XIIProject_Q4//class declaration
{
    private int queue[]=new int[10];//array reference declared and array initialised
    private int i,front=0,end=0,choice=0,element;//instance variables
    protected void input()throws IOException//function to input user choice and perform the desired operation
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));//buffer activated
        do//logic for menu production and user-choice determination
        {
            System.out.println("Given a Queue of maximum size 10, make a choice:-");
            System.out.println("1. Insert an element into the Queue");
            System.out.println("2. Delete an element");
            System.out.println("3.Display the Queue");
            System.out.println("4. Exit Program"+"\n");
            choice=Integer.parseInt(in.readLine());
            switch(choice)
            {
                case 1:
                System.out.println("Input element of type integer"+"\n");
                element=Integer.parseInt(in.readLine());
                insert(element);
                break;
                case 2:
                delete();break;
                case 3:
                display();break;
                case 4:
                break;
                default:
                System.out.println("Input a valid choice"+"\n");
                break;
            }
        }while(choice!=4);
    }//method
    private void insert(int i)//function to insert an element into the queue
    {
        if(end==10)//logic for insertion
        System.out.println("Queue full. Insertion not possible."+"\n");
        else
        {queue[end]=i;end++;}
    }//method
    private void delete()//method to delete the first element of the queue
    {
        if(end==0)//logic for deletion
        System.out.println("Queue empty. Deletion not possible."+"\n");
        else
        {
            for(i=0;i<end;i++)
            {queue[i]=queue[i+1];}
            end--;
        }
    }//method
    public void display()//method to display the queue
    {
        for(i=0;i<end;i++)
        {
            System.out.print(queue[i]+" ");
        }
        System.out.println("\n");
    }//method
}//class