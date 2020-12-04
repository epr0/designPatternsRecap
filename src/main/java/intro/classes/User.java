package intro.classes;

public class User {
    //should be private
    public String name;

    public User() {

    }

    public User(String name, int age) { //coupling with age field, changes needs to made in main
        this.name = name; //set the name field of current object this
    }



    public void hello() {
        System.out.println("Hello my name is " + this.name);
    }


}
