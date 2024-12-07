package objectStream;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;

    private static final long serialVersionUID = -1043242252245546888L;
    private int age;
    private transient String address;


    public Student() {
    }

    public Student(String name, int age,String address) {
        this.name = name;
        this.address=address;
        this.age = age;

    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "other.Student{name = " + name + ", age = " + age + ", address = " + address + "}";
    }
}
