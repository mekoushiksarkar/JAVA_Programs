// Using method

void add(int b[])
  {
    int i,p=b.length;
    for(i=0;i<p;i++)
      b[i]=b[i]+2;
    System.out.println("Parameters after change:"); 
    for(i=0;i<p;i++)
      System.out.println(b[i]+"\t"); 
    System.out.println(); 
  }
  public static void main(String[]args)
  {
    int a[]={2,4,8,6,15};
    Ref ob=new Ref();
    ob.add(a);
    System.out.println("After:");
    for(int j=0;j<a.length;j++)
    System.out.println(a[j]+"\t"); 
  }
}

// o/p

// Parameters after change:
// 4	
// 6	
// 10	
// 8	
// 17	

// After:
// 4	
// 6	
// 10	
// 8	
// 17	
