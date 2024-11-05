package requests;

//record Bean(prefix, infix, suffix)
public class Demo6 {
    public void combineBean() {
        String prefix = "before";
        String infix  = "middle";
        String suffix = "after";

        String merged = prefix + infix + suffix;
        System.out.println("merged = " + merged);
    }
}
