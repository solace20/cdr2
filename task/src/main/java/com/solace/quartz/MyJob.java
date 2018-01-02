package com.solace.quartz;



import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Geminifly on 2017/1/19.
 */
public class MyJob {
    public void execute(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(sdf.format(new Date()));
    }
}
