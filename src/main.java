void main(){
    
    /*プレイヤー１の名前登録*/
    method.Addname addname = new method.Addname();
    String name1 = addname.add(1,"");
        
    /*プレイヤー２の名前登録*/
    String name2 = addname.add(2,name1);
    
    /*ゲームスタート*/
    IO.println("\n【 "+name1+" VS "+name2+" 】");
    
    /* 数字登録 */
    int[] ansnum = new int[3];
    method.Addnum addnum = new method.Addnum();
    ansnum = addnum.add();
    IO.print("""
            \n３桁の数字「＊＊＊」を作成しました。
            数字が何か当ててください。\n
            """);


    method.Innum num = new method.Innum();
    /* プレイヤー１のターン */
    String num1 = num.innum(name1);
    IO.println("プレイヤー１の数字：" + num1);

    /* プレイヤー２のターン */
    String num2 = num.innum(name2);
    IO.println("プレイヤー２の数字：" + num2);
}