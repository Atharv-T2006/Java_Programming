
class Base 
{
    public int i;
   
    public Base()
    {
        System.out.println("inside base constructor");
        this.i=11;
        

    }

    public void fun()
    {
        System.out.println("Inside Base fun");
    }
}

class Derived extends Base
{
    public int i;

    public Derived()
    {
        System.out.println("Inside Derived constructor");
        this.i=21;
    }

    public void gun()
    {
      System.out.println("Inside Derived gun");
      System.out.println("value of i inside base : "+ this.i);
      System.out.println("value of i inside derived : "+ super.i);
      



    }
}
class ThisSuperXX
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();
        dobj.gun();

    }
}