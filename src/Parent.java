public class Parent extends Elder {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public Parent(String name,int age, String work, int salary) {
        super(name,age, work);
        this.salary = salary;
    }
    public void tells(String whoGoesToWork){
        System.out.println(whoGoesToWork+" goes to work");
    }
    public final void tells(){
        System.out.println("Parent request his son to ");
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nSalary "+salary;
    }
}
