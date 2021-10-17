package ru.mirea.java.practice7.ex4;

import java.util.LinkedList;

public class Game4 {
    LinkedList<Integer> fp, sp;

    public Game4(String fp, String sp) {
        this.fp = new LinkedList<>();
        this.sp = new LinkedList<>();
        for(int i = 0; i < 5; i ++){
            this.fp.add(Integer.parseInt(fp.substring(i, i+1)));
            this.sp.add(Integer.parseInt(sp.substring(i, i+1)));
        }
    }


    public String play(){
        int count = 0;
        while(!fp.isEmpty() && !sp.isEmpty() && count <= 106){
            if((fp.peek() > sp.peek() || (fp.peek() == 0 && sp.peek() == 9))
                    && !(fp.peek() == 9 && sp.peek() == 0)){
                fp.add(fp.remove());
                fp.add(sp.remove());

            }else{
                sp.add(sp.remove());
                sp.add(fp.remove());
            }
            count++;
        }
        String res = "";
        if(count >= 106) res += "botva";
        else {
            if (fp.isEmpty()) res += "second ";
            else res += "first ";
            res += count;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Game4("13579", "24680").play());
        System.out.println(new Game4("67890", "12345").play());
        System.out.println(new Game4("13029", "42685").play());
    }

}