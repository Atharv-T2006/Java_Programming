import java.util.*;

class AgeInvalid extends Exception
{
    public AgeInvalid(String str){
        super(str);
    }
}
class UserDefined
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sobj.nextInt();
     try
     {
        if(age < 18)
        {
           throw  new AgeInvalid("You are under age");
        }
        else
        {
            System.out.println("You can attend session");
        }
    }
    catch(AgeInvalid aobj)
    {
        System.out.println("Inside catch "+aobj);
    }
    
    }
}
