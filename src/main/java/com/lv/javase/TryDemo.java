package com.lv.javase;

public  class TryDemo {
    int i = 0;
    public static void main(String[] args) {
        System.out.println(test1());
    }
    public static int test1() {
        TryDemo tryDemo = new TryDemo();
        tryDemo.i = 100;
        try {
            tryDemo.i  = 200;
            return tryDemo.i;
        } finally {
            tryDemo.i = 300;
        }
    }
}
