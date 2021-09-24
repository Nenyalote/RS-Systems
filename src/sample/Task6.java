package sample;
//Ввести число и вывести его описание
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javafx.application.Application;
import javafx.stage.Stage;

public class Task6 extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
      String n = reader.readLine();
      int num = Integer.parseInt(n);

      if(num==0){
        System.out.println("Нулевое число");
      }

      if(num<0){
        if(num%2==0){
          System.out.println("Отрицательное четное число");
        } else{
          System.out.println("Отрицательное нечетное число");
        }
      }

      if(num>0){
        if(num%2==0){
          System.out.println("Положительное четное число");
        } else{
          System.out.println("Положительное нечетное число");
        }
      }

    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}
