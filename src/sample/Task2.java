package sample;
//Найти сумму цифр трехзначного числа
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javafx.application.Application;
import javafx.stage.Stage;

public class Task2 extends Application {

  public static void main(String[] args) {
    launch(args);
  }{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
      String n = reader.readLine();
      int num = Integer.parseInt(n);
      int sum=0;
      for(int i=1; i<4; i++){
        sum=sum+num%10;
        num=num/10;
      }
      System.out.println(sum);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void start(Stage primaryStage) {

  }
}
