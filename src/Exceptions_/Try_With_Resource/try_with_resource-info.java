package Exceptions_.Try_With_Resource;

 /*                                               try-with-resources

    allows us to declare resources to be used in a try block with the assurance that the resources will be closed
    after the execution of that block.
    Resources has to have implemented Closeable or AutoCloseable interface.

       try (MyResource res = new MyResource()) {
               // use resource here
       } catch (Exception e) {
       // some sol or printstacktrace
       }

    To construct a custom resource that will be correctly handled by a try-with-resources block,
    the class should implement  the Closeable or AutoCloseable interfaces, and override the close method:

   public class MyResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Closed MyResource");
    }
}


 */