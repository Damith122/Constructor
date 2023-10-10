public class Programming {

    String name;

    Programming(){
        System.out.println("Constructor called");
        name= "Programmer";

    }

    public static void main(String[] args) {

        Programming damith = new Programming();
        System.out.println("Name is : " + damith.name);

    }

}
