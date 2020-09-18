import java.util.Scanner;

public class Kadai03 {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        //Scannerクラスで入力を受け付け、半径の読み込み
        System.out.println("数字を入力してください");
        double radius = scanner.nextDouble();

        //インスタンス化しCircleクラスのコンストラクタを呼び出す
        Circle circle = new Circle(radius);

        //Circleクラスで作成した円の面積の計算のメソッドを呼び出す
        double areaOfCircle = circle.area();
        System.out.println("円の面積は " + areaOfCircle);

       //Circleクラスで作成した円周の計算のメソッドを呼び出す
        double lengthOfCircle = circle.length();
        System.out.println("円周の長さは" + lengthOfCircle);

       //インスタンス化しSphereクラスのコンストラクタを呼び出す
        Sphere sphere = new Sphere(radius);

       //Sphereクラスで作成した球の体積の計算のメソッドを呼び出す
        double volumeOfBall = sphere.volume();
        System.out.println("球の体積は" + volumeOfBall);

       //Sphereクラスで作成した球の表面積の計算のメソッドを呼び出す
        double areaOfSurfaceOfBall = sphere.areaOfSurface();
        System.out.println("球の表面積は" + areaOfSurfaceOfBall);

        //Scannerメソッドをクローズ
        scanner.close();
    }
}
