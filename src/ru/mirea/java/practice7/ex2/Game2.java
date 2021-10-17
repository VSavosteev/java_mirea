package ru.mirea.java.practice7.ex2;

import java.util.ArrayDeque;
import java.util.Queue;

public class Game2 {
    Queue<Integer> fp, sp;

    public Game2(String fp, String sp) {
        this.fp = new ArrayDeque<>();
        this.sp = new ArrayDeque<>();
        for(int i = 0; i < 5; i ++){
            this.fp.add(Integer.parseInt(fp.substring(i, i+1)));
            this.sp.add(Integer.parseInt(sp.substring(i, i+1)));
        }
    }

    public String play(){
        int count = 0;
        while(!fp.isEmpty() && !sp.isEmpty() && count < 106){
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
        System.out.println(new Game2("13579", "24680").play());
        System.out.println(new Game2("67890", "12345").play());
        System.out.println(new Game2("13029", "42685").play());
    }

}
