package Classes.AnonymousClass;

/*                                           Anonymous classes

    are inner classes with no name. Since they have no name, we can't use them in order to create instances of
    anonymous classes. As a result, we have to declare and instantiate anonymous classes in a single expression
    at the point of use.

       We may either extend an existing class or implement an interface.-----------------------------------------------

        new Book("Design Patterns") {
        @Override
        public String description() {
                return "Famous GoF book.";
        }
    }

      Implement a interface --------------------------------------------------------------------------------------------

     new Runnable() {
         @Override
        public void run() {
        ...
       }
    }

*/