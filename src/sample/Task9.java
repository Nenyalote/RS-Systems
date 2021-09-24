package sample;
//Переставить элементы в обратном порядке
import javafx.application.Application;
import javafx.stage.Stage;

public class Task9 extends Application {

  public static void main(String[] args) {
    launch(args);
  }{
    int[] a= new int[] {15, 10, 51, 6, 5, 3, 10, -34, 0, 32, 56, 12, -24, 52};
    int[] b= new int[a.length];

    for (int i=0; i<a.length; i++){
      b[b.length-i-1]=a[i];
    }

    for (int i=0; i<b.length; i++){
      System.out.println(b[i]);
    }

  }

  @Override
  public void start(Stage primaryStage) {

  }
}
