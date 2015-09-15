import java.io.*;//input-output library files imported
class XIIProject_Q1//class declaration
{
    public static void main(String args[])throws IOException//main method declaration with method signature
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));//buffer activated
        String file="country.txt";
        FileWriter fw=new FileWriter(file);//object created
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);//will write data to notepad file
        pw.println("Country"+"\t\t"+"Percentage People Owning a PC");
        for(int i=0;i<10;i++)//logic for inputting and storing inputted data to notepad file
        {
            System.out.println("Enter Country");
            String country=in.readLine();
            System.out.println("Enter Percentage of People owning a PC");
            double per=Double.parseDouble(in.readLine());
            if(per<=100)
            pw.println(country+"\t\t"+per);//writing data to notepad file
            else
            System.out.println("Wrong percentage inputted");//error management
        }
        pw.close();
        bw.close();
        fw.close();//FileWriter, BufferedWriter and PrintWriter closed
        FileReader fr=new FileReader("country.txt");//object of FileReader created
        BufferedReader br=new BufferedReader(fr);
        String text;
        while((text=br.readLine())!=null)//logic to read and display data from the file to the terminal window
        {
            System.out.println(text);//priting text to terminal window
        }
        br.close();
        fr.close();//FileReader and BufferedReader closed
    }//method
}//class