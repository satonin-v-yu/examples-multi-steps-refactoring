package requests;

import java.util.ArrayList;
import java.util.List;

//Replace collection parameter with return value (big_presentation.pdf 105 page)
public class Demo11 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        callee(ints);
    }

    private static void callee(List<Integer> ints) {
        System.out.println(ints);
    }
}
