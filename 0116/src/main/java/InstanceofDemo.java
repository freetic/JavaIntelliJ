public class InstanceofDemo {
    public static void main(String[] args) {
        String original = "Hello, World";
        Object obj = original;
        obj += "!!!";
        System.out.println(obj);
        if(obj instanceof String){
            String another = (String)obj;
            System.out.println(another);
        }else{
            System.out.println("불가");
        }
    }
}
