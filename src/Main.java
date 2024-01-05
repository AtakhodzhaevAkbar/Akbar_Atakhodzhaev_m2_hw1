public class Main {
    public static void main(String[] args) {
        Parent parent= new Parent("John",50,"Businessman",2000);
        System.out.println(parent.getInfo());
        parent.tells();
        parent.tells("John");
        Kid kid = new Kid("Louis",25,"Police Officer",1200,"Volleyball");
        System.out.println(kid.getInfo());
        kid.tells("Louis");
        Kid kid1=new Kid("Dave",29,"Proffesional Racer","Autosport",1800);
        System.out.println(kid1.getInfo());
        kid1.tells("Dave");
    }
}