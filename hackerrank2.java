static int B,H;
static boolean flag=true;
static 
{
    Scanner obj =new Scanner(System.in);
    int B = obj.nextInt();
    int H = obj.nextInt();
    obj.close();
    if (B<=0 || H<=0)
    {
        System.out.println("java.lang.Exception:Breadth and height must be positive");
        System.exit(0);
    }
}