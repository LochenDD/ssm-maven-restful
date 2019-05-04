package com.how2java.util;

/**
 * @author red
 * @version 1.00
 * @Date 2019/5/3 16:38
 */
public class Page {
    private int start = 0;
    private int count = 5;
    private int last = 0;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "Page{" +
                "start=" + start +
                ", count=" + count +
                ", last=" + last +
                '}';
    }

    public void calculateLast(int total){
        if(0 != total % count){
            last = total - total % count;
        }else {
            last = total - count;
        }
    }
}
