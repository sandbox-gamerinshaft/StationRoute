import java.io.*;
import java.util.regex.*;
public class SearchRoute{
  int data[][]; //格子状の距離データ
  String station[]; //駅名
  String goal,start;
  public SearchRoute(String args[]){
    BufferedReader br, input;
    FileReader fr;
    int n;
    int row = 0;
    n = Integer.parseInt(args[1]); //文字列args[1]を整数に変換
    data = new int[n][n]; // n × n の距離を格納する二次元配列を作成
    station = new String[n]; // n個の駅名を格納する文字列配列を作成
    try{
      System.out.println("To?");
      input = new BufferedReader (new InputStreamReader (System.in));
      start = input.readLine( );
      System.out.println("入力された駅名は「" + start + "」です。");
      System.out.println("From?");
      input = new BufferedReader (new InputStreamReader (System.in));
      goal = input.readLine( );
      System.out.println("入力された駅名は「" + goal + "」です。");
      //0.59s br = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
      fr = new FileReader(args[0]); //0.57s
      br = new BufferedReader(fr);
      while (br.ready()) {
        String str = br.readLine(); //1行読込み
        if(row < n){
          station[row] = str;
          System.out.println(station[row]);
        }else{
          String[]tmp = str.split(" ");
          for(int i=0; i<n; i++){
            data[row-n][i] = Integer.parseInt(tmp[i]);
            System.out.println(data[row-n][i]);
           }
        }
        row++;
      }
    }catch(IOException e){
      e.printStackTrace();
    }
  }

  void station(){
    //ここにかく
  }

  public static void main(String args[]){
    new SearchRoute(args);
  }
}