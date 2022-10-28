import java.io.*;
import java.util.Scanner;

import static java.lang.System.exit;

//    @author-Vamsi Krishna Somepalli____vsomepal@asu.edu
//    @Version 1
@SuppressWarnings("ALL")
public class urinals {
    public static void main(String[] args) {
        urinals Urnals = new urinals();
        Scanner Scn = new Scanner(System.in);
        System.out.println("Enter your choice\n1.Keyboard\nAny Key.File Input");
        int Choice=Scn.nextInt();
        if(Choice==1)
        {
            System.out.println("Enter input");
            String io = Scn.next();
            int urnCount= countUrinals(io);
            System.out.println(urnCount);
        }else{
            Urnals.openFile("src/main/resources/urinals.dat");
        }

    }

    static boolean GoodString(String s) {
        boolean isvalid = true;
        if(s.contains("11"))
        {
            isvalid = false;
            return isvalid;
        }
        String[] str = s.split("");
        int len= str.length;
        for(int i=0;i<len-1;i++)
        {
           String a=str[i];
           String b=str[i+1];
           if(!((a.equals("1")||a.equals("0")) && (b.equals("1")||b.equals("0")))){
               isvalid = false;
           }
        }
        return isvalid;
    }

    public void openFile(String Path){
        File file = new File(Path);
        String renamedfile = renamefile();
        System.out.println("Outfile is :"+renamedfile);
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
               int urcount = countUrinals(sc.nextLine());
               System.out.println(urcount);
                try {
                    FileWriter writer = new FileWriter(renamedfile, true);
                    BufferedWriter bw=new BufferedWriter(writer);

                    bw.write(Integer.toString(urcount));
                    bw.newLine();
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if(urcount==-1)
                {
                    exit(0);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private String renamefile() {
        int count=1;

        File folder=new File("src/main/resources/rule.txt");
        while(folder.exists()){
            folder= new File("src/main/resources/rule"+count+".txt");
            count++;
        }
        return folder.getPath();
    }

    public static int countUrinals(String str){
        boolean isvalid= GoodString(str);
        if(!isvalid)
            return -1;
        String[] expression=str.split("");
        int count=0;
        int len=expression.length;
        int[] status =new int[len];
        for(int i=0;i<len;i++)
        {
            status[i]=Integer.parseInt(String.valueOf(expression[i]));
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
