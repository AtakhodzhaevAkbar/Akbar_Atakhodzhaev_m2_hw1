public class Elder {
    private int age;
    private String work;
    private String name;

    public int getAge() {
        return age;
    }

    public String getWork() {
        return work;
    }

    public Elder(String name,int age, String work) {
        this.age = age;
        this.work = work;
        this.name=name;
    }
    public String getInfo(){
        return "Name "+name+
                "\nAge "+age+
                "\nWork " +work;
    }
}
