
class Base 
{
    public int i;
    public int j;

    public Base()
    {
        System.out.println("inside base constructor");
        this.i=0;
        this.j=0;

    }

    protected void finalize()
    {
        System.out.println("Inside finalize method of Base");
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
        this.x=0;
    }

    protected void finalize()
    {
        System.out.println("Inside finalize method of Derived");
    }

    public void gun()
    {
      System.out.println("Inside Derived gun");

    }
}
class SingleGC
{
    public static void main(String A[])
    {
        System.out.println("Inside main");
        Derived dobj = new Derived();
        
        System.out.println("value of i " + dobj.i);
        System.out.println("value of j " + dobj.j);
        System.out.println("value of x " + dobj.x);

        dobj.fun();
        dobj.gun();

        dobj = null;    //for deallocation of memory

        System.gc();
        
          System.out.println("End of main");

    }
}