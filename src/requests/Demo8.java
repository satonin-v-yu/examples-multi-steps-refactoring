package requests;

//Convert boolean param to enum (big_presentation.pdf 75 page)
public class Demo8 {
    //enum Orientation { VERTICAL, HORIZONTAL}

    private static void split(boolean vertical) {
        if (vertical) {
            System.out.println("vertical");
        }
        else {
            System.out.println("horizontal");
        }
    }

    public static void main(String[] args) {
        split(true);
        split(false);
    }
}
