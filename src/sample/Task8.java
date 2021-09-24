package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javafx.application.Application;
import javafx.stage.Stage;
//Найти максимум, сумму и количество положительных элементов, сумму четных и среднее арифметическое отрицательных элементов
public class Task8 extends Application {

  public static void main(String[] args) {
    launch(args);
  }{

    int[] a= new int[] {1, -10, 5, 6, 45, 23, 45, -34, 0, 32, 56, -1, 2, -2};
    int max=-10000000;
    int sum=0;
    int sumch=0;
    int kol=0;
    double sumotr=0;
    int kolotr=0;
    for(int i=0; i<a.length; i++){
      if (a[i]>max){
        max=a[i];
      }
      if(a[i]>0){
        sum=sum+a[i];
        kol=kol+1;
      }
      if(a[i]<0){
        if(a[i]%2==0){
          sumch=sumch+a[i];
        }
        sumotr=sumotr+a[i];
        kolotr=kolotr+1;
      }
    }
    double arif=sumotr/kolotr;
    String r1="Максимум "+String.valueOf(max);
    String r2="Сумма и количество положительных элементов "+String.valueOf(sum)+" "+String.valueOf(kol);
    String r3="Сумма четных отрицательных элементов "+String.valueOf(sumch);
    String r4="Среднее арифметическое отрицательных элементов "+String.valueOf(arif);
    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);
    System.out.println(r4);
  }

  @Override
  public void start(Stage primaryStage) {

  }
}
