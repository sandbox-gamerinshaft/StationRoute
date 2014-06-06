import java.io.*;

public class StreamTest
{
    public static void main (String[] args) throws IOException         //（４）
    {
        InputStreamReader is = new InputStreamReader(System.in);       //（１）
        BufferedReader br = new BufferedReader(is);                    //（２）

        System.out.println("何か入力してください.");

        String str = br.readLine();                                    //（３）

        System.out.println(str + "が入力されました.");
    }
}