package oops.constructor.init_block;

// -----------------------------------------------------------

// In-It block

/*
 * In-It block is always executed before every constructor.
 * You can have >1 In-It block in single class. And they are executed in the order in which they are defined in a class
 */

class InitBlock {
    int x;

    {
        x =10; // OR `this.x = 10`
        System.out.println("init block");
    }

    InitBlock() {
        System.out.println(x + " default");
    }

    InitBlock(int x) {
        System.out.println(x + " parameterzided constructor");
    }

    {
        System.out.println("Second init block");
    }

    public static void main(String[] args) {
        new InitBlock();
        new InitBlock(10);
        new InitBlock();
    }

}

/*
 * RULES:
 * 
 * No constructor chaining ---> complete code of 'IN-IT' block is inserted in every constructor as a first line by the compiler.
 * Constructor chaining ---> complete code of 'IN-IT' block is inserted in that constructor as 1st line in which there is no `this()` as a 1st line.
 */

// Note: If you want a common task in every constructor put the  task in 'IN-IT' block
