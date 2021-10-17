package ru.mirea.java.practice7.ex1;

import java.util.Stack;

public class Game1 {
    Stack<Integer> fp, sp;

    public Game1(String fp, String sp) {
        this.fp = new Stack<>();
        this.sp = new Stack<>();
        for(int i = 4; i >= 0; i --){
            this.fp.push(Integer.parseInt(fp.substring(i, i+1)));
            this.sp.push(Integer.parseInt(sp.substring(i, i+1)));
        }
    }

    private void pushBack(Stack<Integer> s, Integer item){
        Stack<Integer> ns = new Stack<>();
        while (!s.isEmpty())
            ns.push(s.pop());
        s.push(item);
        while (!ns.isEmpty())
            s.push(ns.pop());
    }

    public String play(){
        int count = 0;
        while(!fp.isEmpty() && !sp.isEmpty() && count <= 106){
            if((fp.peek() > sp.peek() || (fp.peek() == 0 && sp.peek() == 9))
                    && !(fp.peek() == 9 && sp.peek() == 0)){
                pushBack(fp, fp.pop());
                pushBack(fp, sp.pop());
            }else{
                pushBack(sp, sp.pop());
                pushBack(sp, fp.pop());
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
        System.out.println(new Game1("13579", "24680").play());
        System.out.println(new Game1("67890", "12345").play());
        System.out.println(new Game1("13029", "42685").play());
    }

}