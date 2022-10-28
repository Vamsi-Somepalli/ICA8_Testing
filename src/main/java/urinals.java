import org.junit.jupiter.api.Test;
//    @author-Vamsi Krishna Somepalli____vsomepal@asu.edu
//    @Version 1
public class urinals {
    public static void main(String[] args) {
        urinals Urnals = new urinals();

        System.out.println(Urnals.GoodString("1100"));


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
    public void openFile(){
        System.out.println ("Not yet implemented");
    }
    public void countUrinals(){
        System.out.println ("Not yet implemented");
    }
}
