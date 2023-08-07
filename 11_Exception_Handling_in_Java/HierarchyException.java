package Exception_Handling_in_Java;


// 👉 public String getMessage():

public class ExceptionMessageExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            String errorMessage = e.getMessage();
            System.out.println("Error message: " + errorMessage);
        }
    }
}

// 👉 public Throwable getCause():

public class ExceptionCauseExample {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("nonexistent.txt");
        } catch (FileNotFoundException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                System.out.println("Cause: " + cause);
            }
        }
    }
}


// 👉 public void printStackTrace():

public class PrintStackTraceExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}

// 👉 public StackTraceElement[] getStackTrace():

public class GetStackTraceExample {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException("Custom exception");
        } catch (IllegalArgumentException e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement element : stackTrace) {
                System.out.println("at " + element.getClassName() +
                                   "." + element.getMethodName() +
                                   "(" + element.getFileName() +
                                   ":" + element.getLineNumber() + ")");
            }
        }
    }
}
// 👉 public Throwable fillInStackTrace():

public class FillInStackTraceExample {
    public static void main(String[] args) {
        try {
            throw new CustomException("Custom message");
        } catch (CustomException e) {
            Throwable updatedException = e.fillInStackTrace();
            updatedException.printStackTrace();
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
