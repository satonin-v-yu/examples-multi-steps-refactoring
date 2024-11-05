package requests;

//how to get void processRequest(String attr1, String attr2)
public class Demo7 {
    record RequestObject(String attr1,
                         String attr2,
                         String attr3,
                         String attr4) { }

    private static void processRequest(RequestObject payload) {
        System.out.println("I only use " + payload.attr1 + " and " + payload.attr2);
    }

    public static void main(String[] args) {
        RequestObject payload = new RequestObject("hello", "world", "used?", "used?");
        processRequest(payload);
    }
}
