//Stars in a grid
public class Pattern1 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//Row number repeated
public class Pattern2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
//1 to n in each row
public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
// Continuous numbers grid
public class Pattern4 {
    public static void main(String[] args) {
        int n = 5, num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
        }
    }
}
//Continuous numbers wrap after 10
public class Pattern5 {
    public static void main(String[] args) {
        int n = 5, num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num + "\t");
                num++;
                if (num > 10) num = 1;
            }
            System.out.println();
        }
    }
} 
//Odd numbers grid
public class Pattern6 {
    public static void main(String[] args) {
        int n = 5, num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num + "\t");
                num += 2;
            }
            System.out.println();
        }
    }
}
// 1 0 1 ...
public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((j % 2) + " ");
            }
            System.out.println();
        }
    }
}
//Right-angle star triangle
public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// 2, 2 4, 2 4 6 ...
public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((j * 2) + " ");
            }
            System.out.println();
        }
    }
}
//I N D I A triangle
public class Pattern10 {
    public static void main(String[] args) {
        String word = "INDIA";
        for (int i = 1; i <= word.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(word.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
// Pyramid
public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("* ");
            System.out.println();
        }
    }
}
// Diamond
public class Pattern12 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int s = n - i; s > 0; s--) System.out.print("  ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("* ");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = n - i; s > 0; s--) System.out.print("  ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("* ");
            System.out.println();
        }
    }
}
// X-shape
public class Pattern13 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int s = n - i; s > 0; s--) System.out.print("  ");
            System.out.print("* ");
            if (i != 1) {
                for (int s2 = 1; s2 <= (2 * i - 3); s2++) System.out.print("  ");
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = n - i; s > 0; s--) System.out.print("  ");
            System.out.print("* ");
            if (i != 1) {
                for (int s2 = 1; s2 <= (2 * i - 3); s2++) System.out.print("  ");
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//Hollow square
public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
//Plus shape
public class Pattern15 {
    public static void main(String[] args) {
        int n = 7, mid = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            if (i == mid) {
                for (int j = 1; j <= n; j++) System.out.print("* ");
            } else {
                for (int j = 1; j <= mid - 1; j++) System.out.print("  ");
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// X pattern
public class Pattern16 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i || j == n - i + 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
// Hollow diamond in square
public class Pattern17 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n || i == j || j == n - i + 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
// Left diagonal hollow
public class Pattern18 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
// Stars and index
public class Pattern19 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("* ");
            System.out.println(i);
        }
    }
}
// Right diagonal hollow
public class Pattern20 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}








