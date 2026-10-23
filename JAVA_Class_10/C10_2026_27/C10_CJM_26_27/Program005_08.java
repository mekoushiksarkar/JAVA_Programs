// Using method

class R_c
{
  int fact(int n)
  {   
      if(n==0)
        return(1);
      else
        return(n*fact(n-1));
  }
  public static void main(String[]args)
  {
    int k=5,f;
    R_c ob=new R_c();
    f=ob.fact(k);
    System.out.println("Fact="+f);
  }
}


// o/p

// Fact=120