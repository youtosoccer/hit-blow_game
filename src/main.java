void main(){
    
    /*プレイヤー１の名前登録*/
    method.Addname addname = new method.Addname();
    String name1 = addname.add(1,"");
        
    /*プレイヤー２の名前登録*/
    String name2 = addname.add(2,name1);
    
    /*ゲームスタート*/
    IO.println("\n【 "+name1+" VS "+name2+" 】\n");
    
    /* 数字登録 */
    int[] ansnum = new int[3];
    method.Addnum addnum = new method.Addnum();
    ansnum = addnum.add();
    IO.print("""
            ３桁の数字「＊＊＊」を作成しました。
            数字が何か当ててください。
            """);
    IO.print(ansnum[1]);    //テスト

}