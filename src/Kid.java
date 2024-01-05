public final class Kid extends Parent {
    private String hobby;

    public String getHobby() {
        return hobby;
    }

    public Kid(String name,int age, String work, int salary, String hobby) {
        super(name,age, work, salary);
        this.hobby = hobby;
    }
    public Kid(String name,int age, String work, String hobby, int salary){
        super(name,age,work,salary);
        this.hobby=hobby;
    }

    @Override
    public void tells(String whoGoesToWork) {
        super.tells(whoGoesToWork+" goes to work");
    }

    @Override
    public String getInfo() {
        return super.getInfo()+
                "\nHobby "+hobby;
    }
}
