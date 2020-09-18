import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Option {
	BufferedReader in;
	 PrintStream out;
	 public void TerminalUtil() {
	   in = new BufferedReader(new InputStreamReader(System.in));
	   out = System.out;
	 }

	public int readInt(String message) {
	    while(true){
	      //メッセージを出力
	      System.out.print(message + ">");
	      //入力を取得する
	      String str;
	      try{
	        str = in.readLine();
	      }catch(IOException e){
	        //例外発生時にはメッセージを出力してやり直す
	        System.out.println(e.getMessage());
	        continue;
	      }
	      int value;
	      try{
	        //intに変換する
	        value = Integer.parseInt(str);
	      }catch(NumberFormatException e){
	        //変換に失敗した場合は警告してやり直し
	        out.println("数字ではありません。");
	        continue;
	      }
	      //変換した値を返す
	      return value;
	    }
	  }
	public String readOption(String message, String[] options){
	    //メッセージを出力
	    out.println(message);
	    for(int i = 0;i < options.length;i++){
	      out.println(i + ":" + options[i]);
	    }
	    int index = readInt("数字を入力してください。");
	    return options[index];

	  }
}
