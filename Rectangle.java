/*
+-------------------+
|     Rectangle     |
+-------------------+
| - width: double   |
| - height: double  |
+-------------------+
| + Rectangle()     |
| + Rectangle(width: double, height: double) |
| + getArea(): double |
| + getPerimeter(): double |
+-------------------+
*/

public class Rectangle {
    // 寬度與高度
    private double width;
    private double height;

    // 預設建構函式
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    // 以指定寬度與高度的建構函式
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 回傳面積
    public double getArea() {
        return width * height;
    }

    // 回傳周長
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Getter 方法
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // 測試程式
    public static void main(String[] args) {
        // 建立兩個 Rectangle 物件
        Rectangle rect1 = new Rectangle(4.0, 40.0);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        // 顯示矩形的寬度、高度、面積與周長
        System.out.println("矩形 1:");
        System.out.println("寬度: " + rect1.getWidth());
        System.out.println("高度: " + rect1.getHeight());
        System.out.println("面積: " + rect1.getArea());
        System.out.println("周長: " + rect1.getPerimeter());

        System.out.println("\n矩形 2:");
        System.out.println("寬度: " + rect2.getWidth());
        System.out.println("高度: " + rect2.getHeight());
        System.out.println("面積: " + rect2.getArea());
        System.out.println("周長: " + rect2.getPerimeter());
    }
}
