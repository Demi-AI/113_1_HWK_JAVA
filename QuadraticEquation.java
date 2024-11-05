/*
+---------------------+
|  QuadraticEquation  |
+---------------------+
| - a: double         |
| - b: double         |
| - c: double         |
+---------------------+
| + QuadraticEquation(a: double, b: double, c: double) |
| + getA(): double    |
| + getB(): double    |
| + getC(): double    |
| + getDiscriminant(): double |
| + getRoot1(): double |
| + getRoot2(): double |
+---------------------+
*/

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;

    // 建構函式
    public QuadraticEquation(double A, double B, double C) {
        this.a = A;
        this.b = B;
        this.c = C;
    }

    // 計算判別式
    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    // 計算根
    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {    // 判別式為非負數,Root1
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        } else {
            return 0; // 判別式為負數，無根
        }
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {    // 判別式為非負數,Root2
            return (-b - Math.sqrt(discriminant)) / (2 * a);
        } else {
            return 0; // 判別式為負數，無根
        }
    }

    public static void main(String[] args) {
        // 取得使用者輸入
        Scanner input = new Scanner(System.in);

        System.out.print("請輸入 a, b, c 的值 (以空格分隔): ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // 創建 QuadraticEquation 物件 : equation 
        //「 equation物件 」使用者輸入的參數：a,b,c, 會傳至 QuadraticEquation 類別裡的建構函式
        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        // 計算判別式
        // 「 equation物件 」計算判別式：引用 QuadraticEquation 類別裡的 getDiscriminant() 方法
        double discriminant = equation.getDiscriminant();

        // 顯示結果
        if (discriminant > 0) {
            System.out.printf("方程式有兩個根,root1: %.2f & root2: %.2f%n", equation.getRoot1(), equation.getRoot2());
        } else if (discriminant == 0) {
            System.out.printf("方程式有一個根,root1: %.2f%n", equation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }

        input.close();
    }
}


