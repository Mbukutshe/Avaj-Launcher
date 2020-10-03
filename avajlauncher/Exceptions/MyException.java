package avajlauncher.Exceptions;

public class MyException extends Exception {
    private static final long serialVersionUID = -1928219242566779452L;

    public MyException()
    { 
        super();
    }
    public MyException(String exception)
    { 
        super (exception);
    }
    public MyException(Throwable exception)
    {
        super (exception);
    }
}