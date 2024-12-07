package com.test3.demo4;

public class Person {
    private int age;
    private String name;

    public Person() {

    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void keepPet(Dog d, String something){
//        System.out.println("年龄为"+getAge()+"的"+getName()+"养了一只"+d.getAge()
//                +"岁"+d.getColor()+ "的猫");
//        d.eat(something);
//    }
//
//    public void keepPet(Cat c, String something){
//        System.out.println("年龄为"+getAge()+"的"+getName()+"养了一只"+c.getAge()
//                +"岁"+c.getColor()+ "的猫");
//        c.eat(something);
//    }

    public void keepPet(Animal a, String something) {
        if (a instanceof Cat) {
            Cat c = (Cat) a;
            System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + c.getAge()
                    + "岁" + c.getColor() + "的猫");
            c.eat(something);
        } else if (a instanceof Dog) {
            Dog d = (Dog) a;
            System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + d.getAge()
                    + "岁" + d.getColor() + "的猫");
            d.eat(something);

        }
    }
}


