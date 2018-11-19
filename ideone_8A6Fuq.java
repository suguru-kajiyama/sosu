import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            String t=time(m);
        
        System.out.println(t);}
    }
    public static String time(int m){
        int h=(60*24+60-m/3);//60
        int hh=h/60%24;
        int mm=h%60;
        String str=""+mm;
        if(mm<10){str="0"+str;}
        str=hh+":"+str;
        if(hh<10){str="0"+str;}
        return str;
    }
}