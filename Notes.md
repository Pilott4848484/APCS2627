# Fundamental Data types and Input

Integers: byte, short, int, long

Floating Point: float, double

Character: char

Boolean: boolean


int: Integer.MIN_VALUE ... Integer.MAX_VALUE

Number Literals: a number that appears in your code
    if it has a decimal, it is a floating point
    if not, it is an integer

Overflow causes incorrect results - no errors.
    Solution: use 'long' (takes up more storage)

Rounding Errors
    occur when exact representation of floating point is not possible

    occurs because of repreating decimals in binary

Constants
    use 'final' (value cannot be changed once initialized)
    example: final double PA_SALES_TAX_RATE = 0.06;

Static
    Do not have an object tied to them
    Can be accesed directly through the class without making an object

Integer division and Modular division
    Floating point division:
        7.0 / 4.0
        7 / 4.0
        7.0 / 4

    If both are integers, remainder is discarded
        7/4 evaluates to 1

    use % operator to get the remainder
        7 % 4 is 3

n % 10 = last digit of n

n / 10 = n withought last digit (the remainder was discarded)

n % 2 = 0 if even, +-1 if odd

Powers and Roots
    Math class contains methods like sqrt, pow, abs
    these are static methods
    use pow for larger powers or variable powers (otherwise use n*n)

Data loss
    You can store any data type into a variable as long as there is no risk of data loss

    int will fit in a double but not backwards (adds 0.0)

    short will fit in an int but not backwards

    allows based on whether or not data loss is possible

Type Casting
    to type cast, put the data type in () before the data

    example:
        double balance = total+tax;
        int dollars = balance; //Error: Cannot assign double to int

        //correct:
        int dollars = (int) balance;

Reading input using Scanner
    Scanner object reads data from user
    Scanner myScan = new Scanner(System.in); // Keyboard

    nextLine() -> reads as String until next '\n'. Discards '\n'
    next() -> reads as String until next whitespace, leaves '\n'