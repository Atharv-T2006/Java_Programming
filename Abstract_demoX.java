abstract class Demo
{
    public int i,j;
    public int Add(int a, int b)
    {
        return a+b;
    }
    public abstract int sub(int a , int b);
   
}
class Hello extends Demo
{
         
}
class Abstract_demox
{
    public static void main(String[] args)
    {
       Hello hobj=new Hello();
        
    }
}