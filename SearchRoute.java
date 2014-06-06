import java.io.*;

public class SearchRoute{
  int data[][]; //格子状の距離データ
  String station[]; //駅名

  public SearchRoute(String args[]){
    BufferedReader br;
    FileReader fr;
    int n;

    n = Integer.parseInt(args[1]); //文字列args[1]を整数に変換
    data = new int[n][n]; // n × n の距離を格納する二次元配列を作成
    station = new String[n]; // n個の駅名を格納する文字列配列を作成

    try{
      fr = new FileReader(args[0]);
      br = new BufferedReader(fr);
      String str = br.readLine(); //1行読込み
      System.out.println(str); //とりあえず確認の為の出力
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