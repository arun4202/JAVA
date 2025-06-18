public class Main {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        if(a > b && a > c) {
            System.out.println(a + " is largest");
        } else if(b > c) {
            System.out.println(b + " is largest");
        } else {
            System.out.println(c + " is largest");
        }
    }
}

public class PrintNumbersWhile {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 20) {
            System.out.println(i);
            i++;
        }
    }
}

public class CheckEquality {
    public static void main(String[] args) {
        int a = 10, b = 20;
        if(a == b) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("a is not equal to b");
        }
    }
}

public class OddEvenNumbers {
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++) {
            if(i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }
    }
}
public class LargestOfThree {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        if(a >= b && a >= c) {
            System.out.println(a + " is largest");
        } else if(b >= a && b >= c) {
            System.out.println(b + " is largest");
        } else {
            System.out.println(c + " is largest");
        }
    }
}

public class EvenNumbersWhile {
    public static void main(String[] args) {
        int i = 10;
        while(i <= 100) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while(i <= 10);
    }
}

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153, sum = 0, temp = num;
        while(temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        if(sum == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}

public class PrimeCheck {
    public static void main(String[] args) {
        int num = 7;
        boolean isPrime = true;
        if(num <= 1) isPrime = false;
        for(int i = 2; i <= num / 2; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}

public class PalindromeCheck {
    public static void main(String[] args) {
        int num = 121, reversed = 0, temp = num;
        while(temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        if(num == reversed) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}

public class EvenOddSwitch {
    public static void main(String[] args) {
        int num = 5;
        switch(num % 2) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
        }
    }
}

public class GenderSwitch {
    public static void main(String[] args) {
        char gender = 'M';
        switch(gender) {
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}


public class LargestNumberIfElse {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        if(a > b && a > c) {
            System.out.println(a + " is largest");
        } else if(b > c) {
            System.out.println(b + " is largest");
        } else {
            System.out.println(c + " is largest");
        }
    }
}
