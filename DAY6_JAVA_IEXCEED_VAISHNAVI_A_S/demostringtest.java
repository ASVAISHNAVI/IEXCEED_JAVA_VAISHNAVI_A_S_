class stringconcat

{

    public String concatstring()

	{

	  String str="iexceed";

	  for(var i=0;i<10;i++)

		{

	  		str+="technology";

		}

	  return str;

	}
 
    public String concatstringwithbuffer()

	{

	  StringBuffer sb=new StringBuffer("iexceed");

	  for(var i=0;i<100000;i++)

		{

	 		 sb.append("technology");

		}

	  return sb.toString();
 
	}	

}
 
class demostringtest

{

    public static void main(String asd[])

	{

	    stringconcat st=new stringconcat();

	    // long stm=System.currentTimeMillis();

	    System.out.println(st.concatstring());

	    // System.out.println(System.currentTimeMillis()-stm);

            // long stmb=System.currentTimeMillis();

	    System.out.println(st.concatstringwithbuffer());

	    // System.out.println(System.currentTimeMillis()-stmb);
        


	}

}

 