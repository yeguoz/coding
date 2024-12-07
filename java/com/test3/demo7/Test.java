package com.test3.demo7;

public class Test {
    public static void main(String[] args) {
        BasketballCoach bc = new BasketballCoach("篮球教练",33);

        PingPangCoach ppc = new PingPangCoach("乒乓球教练",40);

        PingPangSporter pps = new PingPangSporter("乒乓学员",20);

        BasketballSporter bs = new BasketballSporter("篮球学员",21);

        bc.teach();
        System.out.println();

        ppc.teach();
        ppc.speakEnglish();
        System.out.println();

        pps.study();
        pps.speakEnglish();
        pps.show();
        System.out.println();

        bs.study();
    }
}
