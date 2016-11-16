package com.example.administrator.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/11.
 */
public class SandBox {
    public boolean hasAlpha() {
        return true;
    }

    public boolean add(String object) {
        System.out.println("SandBox.add");
        return mGreeting.add(object);
        //*************************************
        //
        //*************************************
    }

    public List<String> getGreeting() {
        return mGreeting;
    }

    public void setGreeting(List<String> greeting) {
        mGreeting = greeting;
    }

    public SandBox() {

    }

    private List<String> mGreeting = new ArrayList<String>();

    @Override
    public String toString() {
        return "SandBox{" + "mGreeting=" + mGreeting + '}';
    }
    public  String greetings (String greet){
        return "Hello"+ greet;
    }
}
