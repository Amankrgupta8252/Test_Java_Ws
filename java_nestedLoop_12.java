public class java_nestedLoop_12 {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <= 4; i++) {
            for (int j = (i * (i - 1)) / 2 + 1; j <= (i * (i + 1)) / 2; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 5 || j == 5 || j == i) {
                    System.out.print("0 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        int n = 5;
        int num = 1;
        int end = 15;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print(end);
                    end--;
                } else {
                    System.out.print(num + " ");
                    num++;
                }
            }
            System.out.println();
        }
    }
}
// *********** OUTPUT *********** //

/****
 

1
12
123
1234
12345
123456


1
23
456
78910


1
21
321
4321
54321


0 0 0 0 0
0 0     0
0   0   0
0     0 0
0 0 0 0 0


15
1 14
2 3 13
4 5 6 12
7 8 9 10 11
 
 
****/
