import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadLineSample {
  public static void main(String[] args)  {
    try {
      BufferedReader stdReader =
        new BufferedReader(new InputStreamReader(System.in));
      System.out.print("INPUT : ");
      String line;
      while ((line = stdReader.readLine()) != null) { // ユーザの一行入力を待つ
        if (line.equals("")) line = "＜空文字＞";
        System.out.print("OUTPUT: " + line);
        System.out.print("\nINPUT : ");
      }
      stdReader.close();
      System.out.println("\nPROGRAM END");
    } catch (Exception e) {
      e.getStackTrace();
      System.exit(-1); // プログラムを終了
    }
  }
}
