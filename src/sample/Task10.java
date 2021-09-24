package sample;

import javafx.application.Application;
import javafx.stage.Stage;

public class Task10 extends Application {

  public static void main(String[] args) {
    launch(args);
  }{
    int[] a= new int[] {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 34, 52};
    int kol=0;
    for (int i=0; i<a.length; i++){
      if (a[i]==0) {
        kol=kol+1;
      }
    }
    int pl=1;
    for(int i=0; i<a.length-kol; i++){
      if ((a[i]==0)&(a[a.length-pl]!=0)){
        a[i]=a[a.length-pl];
        a[a.length-pl]=0;
        pl=pl+1;
      } else if (a[a.length-pl]==0){
        pl=pl+1;
      }
    }
    for (int i=0; i<a.length; i++){
      System.out.println(a[i]);
    }

  }

  @Override
  public void start(Stage primaryStage) {

  }
}
