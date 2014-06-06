import java.io.*;
import java.util.regex.*;
public class SearchRoute{
  int data[][]; //格子状の距離データ
  String station[]; //駅名
  public SearchRoute(String args[]){
    BufferedReader br;
    FileReader fr;
    int n;
    int row = 0;
    n = Integer.parseInt(args[1]); //文字列args[1]を整数に変換
    data = new int[n][n]; // n × n の距離を格納する二次元配列を作成
    station = new String[n]; // n個の駅名を格納する文字列配列を作成
    try{
      //0.59s br = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
       fr = new FileReader(args[0]); //0.57s
       br = new BufferedReader(fr);
      //0.63s while (br.readLine() != null) {

      while (br.read() != -1 ) { //0.59s
        String str = br.readLine(); //1行読込み
        if(row < n){
          station[row] = str;
        }
        System.out.println(str); //とりあえず確認の為の出力
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