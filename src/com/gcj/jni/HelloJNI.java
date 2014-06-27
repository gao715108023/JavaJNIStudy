package com.gcj.jni;

public class HelloJNI {

    static {
        //System.loadLibrary("goodluck");
        System.load("/Users/gaochuanjun/Workspaces/MyEclipse 10/JavaJNIStudy/src/libgoodluck.so");
    }

    public native static int get();

    public native static void set(int i);

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HelloJNI helloJNI = new HelloJNI();
        helloJNI.set(10);
        System.out.println(helloJNI.get());
    }
}