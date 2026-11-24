package method;

public class Addname{
    private String check_name;
    private String name,str;

    /*名前入力*/
    public String add(int player,String name1){
        do{
            IO.print("プレイヤー"+player+"の名前を入力してください　＞　");
            name = IO.readln();
            check_name = check(player);
            if(player==2){
                check_name=check_same(name1,name);
            }
        }while(!check_name.equals("1"));
        return name;
    }

    /*名前入力の確認*/
    private String check(int player){
        IO.print("プレイヤー"+player+"の名前は"+name+"でよろしいでしょうか？（１：YES、２：NO）　＞　");
        str = IO.readln();
        return str;
    }

    /*プレイヤー１と２の名前が同じでないか確認*/
    public String check_same(String name1,String name2){
        if(name1.equals(name2)){
            IO.println("プレイヤー名が同じになっています。");
            check_name = "0";
        };
        return check_name;
    }
}