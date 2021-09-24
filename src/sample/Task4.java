package sample;
//если число положительное, прибавить 1, если отрицательное - вычесть 2, если 0 - заменить на 10.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javafx.application.Application;
import javafx.stage.Stage;

public class Task4 extends Application {

  public static void main(String[] args) {
    launch(args);
  }{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
      String n = reader.readLine();
      int num = Integer.parseInt(n);
      if (num>0){
        num=num+1;
      } else if (num<0){
        num=num-2;
      } else {
        num=10;
      }
      System.out.println(num);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void start(Stage primaryStage) {

  }
}
