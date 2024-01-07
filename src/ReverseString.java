public class ReverseString
{
    public static void main(String[] args) {
        String Reverse="";
        String name="shital";

        for(int i=name.length()-1 ;i>=0;i--)
        {
            Reverse+= name.charAt(i);

        }
        System.out.println("Reversed string is " +Reverse);
    }

}
