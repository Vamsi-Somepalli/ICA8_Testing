import java.util.Scanner;

//    @author-Vamsi Krishna Somepalli____vsomepal@asu.edu
//    @Version 1
@SuppressWarnings("unused")
public class urinals {
    public static void main(String[] args) {
        urinals Urnals = new urinals();
        Scanner Scn = new Scanner(System.in);
        System.out.println("Enter your choice\n1.Keyboard\n2.File Input");
        int Choice=Scn.nextInt();
        if(Choice==1)
        {
            System.out.println("Enter input");
            String io = Scn.next();
            int urnCount= Urnals.countUrinals(io);
            System.out.println(urnCount);
        }else{
            Urnals.openFile("src/main/resources/urinals.dat");
        }

    }

    static boolean GoodString(String s) {
        boolean isvalid = true;
        String[] str = s.split("");
        int len= str.length;
        for(int i=0;i<len-1;i++)
        {
           int a=Integer.parseInt(String.valueOf(str[i]));
           int b=Integer.parseInt(String.valueOf(str[i+1]));
           if(a==1 && b==1){
               isvalid = false;
               break;
           }
        }
        return isvalid;
    }

    public void getString() {

        System.out.println ("Not yet implemented");
    }
    public void openFile(String Path){

    }
    public int countUrinals(String str){
        urinals obj=new urinals();
        boolean isvalid=obj.GoodString(str);
        if(!isvalid)
            return -1;
        String[] s=str.split("");
        int count=0;
        int len=s.length;
        int status[]=new int[len];
        for(int i=0;i<len;i++)
        {
            status[i]=Integer.parseInt(String.valueOf(s[i]));
        }
        if(len==1){
            if(status[0]==0){
                count=1;
                status[0]=1;
            }
        }
        else {
            int i=0;
            if(status[i]==0 && status[i+1]!=1){
                status[i]=1;
                count++;
            }
            for(i=1;i<len-1;i++){
                if(status[i]==0 && status[i-1]!=1 && status[i+1]!=1){
                    status[i]=1;
                    count++;
                }
            }
            if(status[i]==0&&status[i-1]!=1) {
                count++;
                status[i] = 1;
            }
        }
        return count;
    }
}
