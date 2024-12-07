package stream_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三-男-19","云清妍-女-18","黄尚-男-17","吴涵涵-男-20",
                "苏昕蕊-女-23", "韦欣源-男-22","窦汝鑫-男-20");

        List<String> ls1 = list.stream().filter(name -> name.split("-")[1].equals("男"))
                .collect(Collectors.toList());

        list.stream().filter(name->name.split("-")[1].equals("女"))
                .collect(Collectors.toSet());

        Map<String, Integer>  map = list.stream().filter(name -> name.split("-")[1].equals("男"))
                .collect(Collectors
                        .toMap(new Function<String, String>() {
                                   @Override
                                   public String apply(String name) {
                                       return name.split("-")[0];
                                   }
                               },
                                new Function<String, Integer>() {
                                    @Override
                                    public Integer apply(String name) {
                                        return Integer.parseInt(name.split("-")[2]);
                                    }

                                })
                );


        Map<String, Integer> map2 = list.stream().filter(name -> name.split("-")[1].equals("女"))
                .collect(Collectors
                        .toMap(name -> name.split("-")[0], name -> Integer.parseInt(name.split("-")[2])));


        System.out.println(map2);
    }
}
