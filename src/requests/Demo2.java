package requests;

//extract method from selection to get String processStrings(String[] args)
public class Demo2 {
    public static void main(String[] args) {
        int arrayLength = args.length;
        System.out.println("Processing " + arrayLength + " strings");
        //selection start
        StringBuilder sb = new StringBuilder();
        sb.append(arrayLength).append(":");
        boolean first = true;
        for (String arg : args) {
            if (first) {
                sb.append("\n");
                first = false;
            }
            sb.append(arg);
        }
        //selection end
        System.out.println("Strings");
        System.out.println(sb.toString());
    }
}
