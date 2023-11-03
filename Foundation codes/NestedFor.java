class NestedFor
  {
    public static void main(String args[])
    {
     for(int i=1;i<=3;i++)  //outer for
       {
         for(int j=1;j<=3;j++) //inner for
           {
             System.out.println("i = "+i+"  j = "+j);
           }
       }
    }
  }