class call
{
  synchronized  public void callme(String msg)
	{
      System.out.print("[");
	  System.out.print(msg);
	  System.out.print("]");
	  display();
	}
 
    public void display()
	{
	  for(var i=0;i<10;i++)
	 	System.out.print(i);
	}
  }
 
 
class caller extends Thread
{
    call obj;
    String str;
  
 
    caller(call obj,String str)
	{
	   this.str=str;
	   this.obj=obj;
	//    this.start();
	}
 
    public void run()
	{
	   obj.callme(str);
	}
}
 
class p3
{
    public static void main(String asd[]) throws Exception 
	{
	   call obj=new call();
    	   caller c1=new caller(obj,"one");
	
	   caller c2=new caller(obj,"two");
	   
	   caller c3=new caller(obj,"three");
       c1.start();

       c1.join();
       c2.start();
       c2.join();
       c3.start();
	   c3.join();
	 
   	}
  }