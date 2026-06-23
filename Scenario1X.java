
class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run method");
    }

}

class Scenario1X
{
    public static void main(String[] args)
    {
        System.out.println("Main thread is running.....");
        Demo dobj = new Demo();
        Thread tobj = new Thread(dobj);
        tobj.start();
        

    
    }
    
}
