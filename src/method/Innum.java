package method;

import java.util.Scanner;

public class Innum {
    public String innum(String name){
        String num;
        while(true){
            IO.print("プレイヤー【" + name + "】のターン(整数３桁)：");
            Scanner innum = new Scanner(System.in);
            num = innum.next();

            /* ３桁の整数かどうか確認 */
            if(num.length()==3 && num.matches("[0-9]{3}")){
            break;    
            };

            IO.println("３桁数字ではないため、もう一度入力してください。");
        };
        return num;
    }
}