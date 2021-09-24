package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javafx.application.Application;
import javafx.stage.Stage;
//Вычислить стоимость 10-минутного разговора в зависимоси от кода города
public class Task7 extends Application {

  public static void main(String[] args) {
    launch(args);
  }{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
      String n = reader.readLine();
      int num = Integer.parseInt(n);

      double price=0;

      if (num==905){
        price=4.15;
      }
      if (num==194){
        price=1.98;
      }
      if (num==491){
        price=2.69;
      }
      if (num==800){
        price=5.00;
      }

      price=price*10;
      System.out.println(price);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void start(Stage primaryStage) {

  }
}
