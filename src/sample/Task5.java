package sample;
// ввести три числа, вывести минимальное из них
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javafx.application.Application;
import javafx.stage.Stage;

public class Task5 extends Application {

  public static void main(String[] args) {
    launch(args);
  }{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
      String n1 = reader.readLine();
      int num1 = Integer.parseInt(n1);
      String n2 = reader.readLine();
      int num2 = Integer.parseInt(n2);
      String n3 = reader.readLine();
      int num3 = Integer.parseInt(n3);

      int num = num1;
      if (num2 < num) {
        num = num2;
        if (num3 < num) {
          num = num3;
        }
        System.out.println(num);

      }
    }
      catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void start(Stage primaryStage) {

  }
}
