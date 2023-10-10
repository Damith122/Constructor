public class Sum {

    int i;
    int j;

    Sum(){
        j=10;
        i=20;
        System.out.println("Constructor called 1st");

    }

    public static void main(String[] args) {

        Sum s = new Sum();
        System.out.println("Value of :" + (s.i+s.j));

    }

}
