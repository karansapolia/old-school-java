import java.io.*;//input-output library files imported
class XIIProject_Q2//class declaration
{
    char roman[]={'I','V','X','L'};//char array reference created and array initialised
    int decimal[]={1,5,10,50};//int array reference created and array initialised
    String input="";
    int i=0,j,k,pos=0,decimalt=0,count=0;
    private int roman_pos(char a)//method to find array position of inputted roman numeral and pass the position to 'decimal_no' method
    {
        for(int in=0;in<roman.length;in++)
        {
            if(roman[in]==Character.toUpperCase(a)){
            pos=in;in=0;break;}
        }
        return decimal_no(pos);
     }//method
    private int decimal_no(int in)//method to find corresponding decimal value in array decimal[] at the inputted index position
        {
            j=decimal[in];
            return j;
        }//method
    protected void logic()throws IOException//method to accept user-inputted data and perform conversion operation
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));//buffer activated
        System.out.println("Enter any roman number less than or equal to 50");
        input=in.readLine();
        int length=input.length();
        do//logic for roman to decimal conversion
        {
            k=roman_pos(input.charAt(i));
            if(length==1)//to calculate for "i","x" and "l".
            decimalt=k;
            else//for cases wherein the roman number has more than one digit.
            {
            if((k<roman_pos(input.charAt(i+1)))&&(k==1||k==10)){
            decimalt+=roman_pos(input.charAt(i+1))-k; i++; count=0;}
            else if(k>roman_pos(input.charAt(i+1))){
            decimalt+=k;count=0;}
            else if(k==roman_pos(input.charAt(i+1))){
            decimalt+=k;++count;}
            else 
            count=3;
            if(count>3)//logic to throw error if inputted number is of form "xxxx" or "iiii".
            {System.out.println("Invalid Roman Number");break;}
            i++;
            }
        }while(i<length-1);
        if((length>2)&&(roman_pos(input.charAt(length-1))<=roman_pos(input.charAt(length-2))))//checking for similarity of last two roman numerals
        {
            decimalt+=roman_pos(input.charAt(length-1));
            if(roman_pos(input.charAt(length-1))==roman_pos(input.charAt(length-2)))
            ++count;
        }
        if(count>3)
        {System.out.println("Decimal Number not possible.");}
        else{
        display();decimalt=0;i=0;j=0;k=0;pos=0;count=0;}//re-initialising variable values or object re-use.
        }//method
    private void display()//method to print the corresponding decimal value
    {
        System.out.println(decimalt);
    }//method
}//class
    