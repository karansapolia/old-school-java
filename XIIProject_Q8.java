import java.io.*;//input-output library files imported
class XIIProject_Q8//class declaration
{
    public static void main(String args[])throws IOException//main method declaration with method signature
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));//buffer activated
        String file="club.txt";
        FileWriter fw=new FileWriter(file);//object created
        BufferedWriter bw=new BufferedWriter(fw);//buffer activated
        PrintWriter pw=new PrintWriter(bw);//will write data to notepad file
        pw.println("Member_No."+" "+"Name"+" "+"Year_of_Joining"+" "+"City");
        System.out.println("Input the details of any three members and find the number of members registered in a specific year");
        for(int i=0;i<3;i++)//logic for inputting and storing inputted data to notepad file
        {
            System.out.println("Enter member number.");
            int number=Integer.parseInt(in.readLine());
            System.out.println("Enter member's first name.");
            String name=in.readLine();
            System.out.println("Enter Year of joining.");
            int year=Integer.parseInt(in.readLine());
            System.out.println("Enter city of residence.");
            String city=in.readLine();
            pw.println(number+" "+name+" "+year+" "+city);//writing data to notepad file
        }
        pw.close();
        bw.close();
        fw.close();
        System.out.println("Input an year to find the number of members who joined that year.");
        String find_year=in.readLine();//FileWriter, BufferedWriter and PrintWriter closed
        int count=0,year_member=0;String file_year="";
        FileReader fr=new FileReader("club.txt");//object of FileReader created
        BufferedReader br=new BufferedReader(fr);//buffer activated
        String text;
        while((text=br.readLine())!=null)//logic to read and display data from the file to the terminal window
        {
            for(int i=0;i<text.length();i++)
            {
                if(text.charAt(i)==' ')//counting the number of spaces so as to ascertain the number of the word
                count++;
                if(count==2)//logic to extract the third word in the row
                {
                    if(text.charAt(i+1)!=' ')
                    file_year+=text.charAt(i+1);
                    else if(file_year.compareTo(find_year)==0)
                    year_member++;
                }
            }
            count=0;file_year="";
        }
        System.out.println("Number of members registered in year "+find_year+" are "+year_member);
        br.close();
        fr.close();//FileReader and BufferedReader closed
    }//method
}//class