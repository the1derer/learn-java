package exceptions;

class ExceptionDemoNotHandled {
    public static void main(String[] args) {

        int x = 10/0; // ArithmeticException will be generated here as '/' by zero is not allowed

        System.out.println("This will not be printed");
    }
}

//-----------------------------------------------------

class ExceptionDemoHandled {
    public static void main(String[] args) {

        try {

            int x = 10/0; // ArithmeticException will be generated here as '/' by zero is not allowed

            System.out.println("This will not be printed"); // This line will skipped
            
        } catch (ArithmeticException e/* Predicted by programmer by seeing statement in 'try' block */) { // 'catch' block should immediately follow 'try' block.
            System.out.println("This will be printed");
        }
    }
}

/*
 * RULE: If a matching 'catch' block is found then all those lines which are coming b/w line on which exception is generated and a 'catch' block will be skippped.
 */