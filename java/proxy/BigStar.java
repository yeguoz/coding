package proxy;

public class BigStar {
    private String name;

    public BigStar() {
    }

    public BigStar(String name) {
        this.name = name;
    }

    public void sing(String name){
        System.out.println("鸡哥唱了"+name);
    }

    public void dance(String name){
        System.out.println("鸡哥跳了"+name);


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

    public String toString() {
        return "BigStar{name = " + name + "}";
    }
}
