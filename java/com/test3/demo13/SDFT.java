package com.test3.demo13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SDFT {
    public static void main(String[] args) throws ParseException {
        String startStr = "2023年11月11日 0:0:0";
        String endStr = "2023年11月11日 0:10:0";
        String xj = "2023年11月11日 0:01:00";
        String xp = "2023年11月11日 0:11:00";

        SimpleDateFormat sdf1  = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date start = sdf1.parse(startStr);
        Date end = sdf1.parse(endStr);
        Date xjxd = sdf1.parse(xj);
        Date xpxd = sdf1.parse(xp);

        if(xjxd.getTime() >= start.getTime() && xjxd.getTime() <= end.getTime()){
            System.out.println("小贾参加上秒杀活动");
        }else {
            System.out.println("小贾mei参加上秒杀活动");
        }
        if(xpxd.getTime() >= start.getTime() && xpxd.getTime() <= end.getTime()){
            System.out.println("小皮参加上秒杀活动");
        }else {
            System.out.println("小皮mei参加上秒杀活动");
        }

    }
}
