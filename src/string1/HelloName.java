package string1;

public class HelloName {
    static void main() {
        HelloName obj = new HelloName();
        System.out.println(obj.helloName("Alice"));
    }
        public String helloName(String name) { return "Hello " + name + "!";
    }

}
