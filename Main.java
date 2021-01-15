import java.util.*;

class Main
{
    public static int t[][]=
    {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    public static int f=0,chk=1;
  public static void main(String[] args)
  {
        Scanner sc=new Scanner(System.in);
        String name[]=new String[2];//name of players
        for(int n=0;n<2;n++)
            {
                System.out.printf("Enter the name of Player %d : ",(n+1));
                name[n]=sc.nextLine();
            }
        for(int i=0;i<3;i++)
            {
             for(int j=0;j<3;j++)
                {
                    System.out.print(" "+t[i][j]+" ");
                    if(j<2)
                    System.out.print(" | ");
                }
                    System.out.println();
                    if(i<2)
                    System.out.println("---------------");
            }
            int toggle=0;
        while(f!=1)
        {
            System.out.print("Enter the position between 1-9 "+name[toggle]+":");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    toggle=display(1,toggle);
                    break;
                case 2:
                    toggle=display(2,toggle);
                    break;
                case 3:
                    toggle=display(3,toggle);
                    break;
                case 4:
                    toggle=display(4,toggle);
                    break;
                case 5:
                    toggle=display(5,toggle);
                    break;
                case 6:
                    toggle=display(6,toggle);
                    break;
                case 7:
                    toggle=display(7,toggle);
                    break;
                case 8:
                    toggle=display(8,toggle);
                    break;
                case 9:
                    toggle=display(9,toggle);
                    break;
            }//end of switch
                chk++;
                if(chk>4&&chk<10)
                {
                    int win=check();
                    if(win==88)
                        System.out.println("Winner: "+name[0]);
                    else if(win==79)
                        System.out.println("Winner: "+name[1]);
                    else
                        continue;
                }
                else if(chk>9)
                {
                    System.out.println("Draw!");
                    f=1;
                }
        }
  }//end of main()

  static int check()
  {
      if
    (
    (t[0][0]==88&&t[0][1]==88&&t[0][2]==88)||
    (t[1][0]==88&&t[1][1]==88&&t[1][2]==88)||
    (t[2][0]==88&&t[2][1]==88&&t[2][2]==88)||
    (t[0][0]==88&&t[1][0]==88&&t[2][0]==88)||
    (t[0][1]==88&&t[1][1]==88&&t[2][1]==88)||
    (t[0][2]==88&&t[1][2]==88&&t[2][2]==88)||
    (t[0][0]==88&&t[1][1]==88&&t[2][2]==88)||
    (t[0][2]==88&&t[1][1]==88&&t[2][0]==88)
    )
    {
        f=1;
        return 88;
    }
    else if
    (
    (t[0][0]==79&&t[0][1]==79&&t[0][2]==79)||
    (t[1][0]==79&&t[1][1]==79&&t[1][2]==79)||
    (t[2][0]==79&&t[2][1]==79&&t[2][2]==79)||
    (t[0][0]==79&&t[1][0]==79&&t[2][0]==79)||
    (t[0][1]==79&&t[1][1]==79&&t[2][1]==79)||
    (t[0][2]==79&&t[1][2]==79&&t[2][2]==79)||
    (t[0][0]==79&&t[1][1]==79&&t[2][2]==79)||
    (t[0][2]==79&&t[1][1]==79&&t[2][0]==79)
    )
    {
        f=1;
        return 79;
    }
    else
    return 0;
    
  }//end of check()
  static int display(int n,int toggle)
  {
       for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {   
            if(t[i][j]==n&&toggle==0)
            {
                System.out.print(" X ");
                    t[i][j]=88;
            }
            else if(t[i][j]==n&&toggle==1)
            {
                System.out.print(" O ");
                t[i][j]=79;
            }
            else if(t[i][j]!=n && (t[i][j]==88||t[i][j]==79))
            {
                System.out.print(" "+(char)t[i][j]+" ");
            }
            else
                System.out.print("   ");
            if(j<2)
                System.out.print(" | ");
        }
        System.out.println();
        if(i<2)
        System.out.println("---------------");
    }
    if(toggle==0)
        return 1;
    else 
        return 0;
  }//end of display()
}//end of class

