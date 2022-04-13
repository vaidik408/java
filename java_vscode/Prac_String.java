//import java.util.Scanner;
public class Prac_String 
{
    public static void main(String[] args) 
    {
    /****  user input string ****/
 
        // Scanner sc = new Scanner(System.in);
        //name = sc.nextLine();
        //System.out.println(name);
   
    /****** String methods ******/
    
        String name ="Vaidik";
            
            //size of string
            int value = name.length();
            System.out.println(value);

            //make string in lower case
            String lString = name.toLowerCase();
            System.out.println(lString);
            
            //make string in uppercase           
            String uString= name.toUpperCase();
            System.out.println(uString);

            //Remove spaces in string
            String hii = "  johhny";
            String tString = hii.trim();
            System.out.println(tString);
        
            //printing from particular index
            System.out.println(name.substring(3));

            //printing from particular index to particular index
            System.out.println(name.substring(3,6));

            // replace any character with another 
            System.out.println(name.replace('V','J'));
            System.out.println(name.replace("Vai","Jha"));

            //checks name start and end with given char true or false
            System.out.println(name.startsWith("Vai"));
            System.out.println(name.endsWith("ii"));

            // checks which char is at given index
            System.out.println(name.charAt(3));

            // check which first index is at given char
            System.out.println(name.indexOf("d"));
            System.out.println(name.indexOf('i',3));

            // check which first index is at given char
            System.out.println(name.lastIndexOf("i"));
            System.out.println(name.lastIndexOf('i',3));

            // check given string is equal to input string
            System.out.println(name.equals("Vaidik"));
            System.out.println(name.equals("jhadik"));
            // ignore lower or upper case
            System.out.println(name.equalsIgnoreCase("vaidik"));
    }       

}
