package stream_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LxDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list1,"费佳欣,23","雷汝鑫,16","奚榕润,22","乐文昊,24","云甜,20","陈杨,18");
        Collections.addAll(list2,"杨幂,24","章冰枫,21","杨钰莹,25","昌瑞辰,26","杨里,19","云溶溶,22");
        // 1
        list1.stream().filter(name -> name.split(",")[0].length() == 3)
                .limit(2).forEach(name-> System.out.println(name));
        System.out.println("=-------------------------------------------------=");
        // 2
        list2.stream().filter(name->name.split(",")[0].startsWith("杨"))
                .skip(1).forEach(name-> System.out.println(name));
        // 3
        System.out.println("=-------------------------------------------------=");
        Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());

        // 4
//        Stream<stream_.Actor> actorStream = concatStream.map( name->new Actor(name.split(",")[0],
//                Integer.parseInt(name.split(",")[1])));

        // 4.2
        List<Actor> list = concatStream.map(name -> new Actor(name.split(",")[0],
                Integer.parseInt(name.split(",")[1]))).collect(Collectors.toList());
        for (Actor actor: list){
            System.out.println(actor);
        }


        System.out.println("=-------------------------------------------------=");
        // 5
     /*   ArrayList<Actor> aList = new ArrayList<>();
        actorStream.forEach(actor->aList.add(actor));
        Iterator<Actor> iterator = aList.iterator();
        while (iterator.hasNext()){
            Actor actor = iterator.next();
            System.out.println(actor);
        }*/


    }
}

