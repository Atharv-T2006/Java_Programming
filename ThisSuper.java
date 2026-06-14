
class Base 
{
    public int i;
    public int j;

    public Base()
    {
        System.out.println("inside base constructor");
        this.i=11;
        this.j=21;

    }

    public void fun()
    {
        System.out.println("Inside Base fun");
    }
}

class Derived extends Base
{
    public int x;

    public Derived()
    {
        System.out.println("Inside Derived constructor");
        this.x=51;
    }

    public void gun()
    {
      System.out.println("Inside Derived gun");
      System.out.println("value of i : "+ super.i);
      System.out.println("value of j : "+ super.j);
      System.out.println("value of x : "+ this.x);



    }
}
class ThisSuper
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();
        dobj.gun();

    }
}