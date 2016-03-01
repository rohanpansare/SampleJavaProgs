package Strings;

import java.util.Scanner;
/**
 * Created by Rohan Pansare on 2/24/2016.
 */
public class AMto24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String[] time1 = time.split(":");
        int val = Integer.parseInt(time1[0]);
        if(val < 12 && time1[time1.length-1].contains("PM")){
            val = val + 12;
        }
        if(val == 12 && time1[time1.length-1].contains("AM")){
            val = val - 12;
        }
        System.out.print(String.format("%02d",val));
        time1[time1.length-1] = time1[time1.length-1].replaceAll("[A-Za-z]","");
        for(int i =1 ; i<time1.length;i++){
            System.out.print(":"+time1[i]);
        }
    }
}
