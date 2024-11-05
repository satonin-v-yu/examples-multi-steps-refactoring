package requests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//replace elements.size() == 0 with elements.isEmpty()
public class Demo1 {
    private static String getFirstElement(List<String> elements) {
        if (elements.size() == 0) return null;
        return elements.get(0);
    }

    private static String removeFirstElement(List<String> elements) {
        if (elements.size() == 0) return null;
        return elements.remove(0);
    }

    public static void main(String[] args) {
        System.out.println(getFirstElement(Arrays.asList(args)));
        System.out.println(removeFirstElement(new ArrayList<>(Arrays.asList(args))));
    }
}
