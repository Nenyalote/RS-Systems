package sample;
//считать число и вывести его последнюю цифру

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javafx.application.Application;
import javafx.stage.Stage;

public class Task1 extends Application {

  public static void main(String[] args) {
    launch(args);
  }{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
      String n = reader.readLine();
      int num = Integer.parseInt(n);
      int res=num%10;
      System.out.println(res);
    } catch (IOException e) {
      e.printStackTrace();
    }


  }

  @Override
  public void start(Stage primaryStage) {

  }
}
