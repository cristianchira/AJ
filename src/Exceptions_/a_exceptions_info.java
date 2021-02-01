package Exceptions_;

/*                                   Exception

An exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions.
Objects of type Throwable and its subtypes can be sent up the stack with the throw keyword and caught with
try…catch statements.

    Order of exceptions is from specific to generic in order to avoid compilation errors.

 ------------------------------------------------- Throwable: ---------------------------------------------------------

    Exception ---------------------------------------------------------------------------------------------------------

         is the superclass of all the exceptions from which ordinary programs may wish to recover.
          RuntimeException is a direct subclass of Exception.
          RuntimeException is the superclass of all the exceptions which may be thrown for many reasons during expression
          evaluation, but from which recovery may still be possible.
          RuntimeException and all its subclasses are, collectively, the run-time exception classes.

    RuntimeException (Unchecked errors)          IOException SQLException         AWTException       InterruptedExceptions
      - ArithmeticException                          -EOFException
      - NullPointerException                         -FileNotFoundException
      - ClassCastException                           -InterruptedIOException
      - EnumConstantNotPresentException              -InvalidPropertiesFormatException
      - InterruptIOException                         -UnknownServiceException
      - IllegalStateException                        -UnsupportedDataTypeException
      - IndexOutOfBoundException                     -UnsupportedEncodingException
      -ArrayIndexOutOfBoundException
      -StringIndexOutOfBoundException
      -SecurityException


    Error---------------------------------------------------------------------------------------------------------------

         is the superclass of all the exceptions from which ordinary programs are not ordinarily expected to recover.
         Error and all its subclasses are, collectively, the error classes.

    Unchecked errors classes-------------------------------------------------------------------------------------------
        AbstractMethodError
        AssertionError
        BootstrapMethodError
        ClassCircularityError
        ClassFormatError
        Error
        ExceptionInInitializerError
        IllegalAccessError
        IncompatibleClassChangeError
        InstantiationError
        InternalError
        LinkageError
        NoClassDefFoundError
        NoSuchFieldError
        NoSuchMethodError
        OutOfMemoryError
        StackOverflowError
        ThreadDeath
        UnknownError
        UnsatisfiedLinkError
        UnsupportedClassVersionError
        VerifyError
        VirtualMachineError


   Unchecked exception classes -----------------------------------------------------------------------------------------

   What are:
        are the exceptions that are not checked at compile time.
   Which are:
        are the run-time exception classes and the error classes.

   Checked exception classes-------------------------------------------------------------------------------------------

   What are:
        are the exceptions that are checked at compile time.
        If some code within a method throws a checked exception,
        then the method must either handle the exception or it must specify the exception using throws keyword
        are all exception classes other than the unchecked exception classes.
   Which are:
        That is, the checked exception classes are Throwable and all its subclasses other than RuntimeException and its
        subclasses and Error and its subclasses.

         https://www.benchresources.net/exception-hierarchy-in-java/

   Note that a subclass of Throwable cannot be generic -----------------------------------------------------------------


 --------------------------------------What happens when a method throws an exception?----------------------------------

       If a method is declared with the throws keyword then any other method that wishes to call that method must either
       be prepared to catch it or declare that itself will throw an exception. It can happen, even with checked exceptions.
       And sometimes it can break logging.


* */
