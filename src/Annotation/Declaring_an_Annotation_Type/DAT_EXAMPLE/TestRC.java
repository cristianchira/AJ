package Annotation.Declaring_an_Annotation_Type.DAT_EXAMPLE;



public class TestRC {
    public static void main(String arg[]) {
        new TestRC().performRetention();
        new TestRC().performDocumented();

    }
    @Crunchify_Retention (returnSomething="Hello retention test")
    public void performRetention() {
        System.out.println("Testing annotation 'Crunchify_Retention'");
    }
    @Crunchify_Documented(writeDocument="Hello document")
    public void performDocumented() {
        System.out.println("Testing annotation 'Crunchify_Documented'");
    }
}