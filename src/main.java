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

    /* 数字入力 ＋ HBチェック */
    method.Innum innum = new method.Innum();
    method.CheckHB checkHB = new method.CheckHB();
    String num1,num2;
    int[] HB1 = new int[2];     // HB1[] = {ヒット数 , ブロー数}
    int[] HB2 = new int[2];     // HB2[] = {ヒット数 , ブロー数}
    String Winner;
    while(true){
        /* プレイヤー１のターン */
        /* HB判定 */
        num1 = innum.innum(1,name1);
        HB1 = checkHB.checkHB(num1,ansnum);
        IO.println(HB1[0] + "hit　" + HB1[1] + "blow\n");
        if(HB1[0] == 3){
            Winner = name1;
            break;
        }

        /* プレイヤー２のターン */
        /* HB判定 */
        num2 = innum.innum(2,name2);
        HB2 = checkHB.checkHB(num2,ansnum);
        IO.println(HB2[0] + "hit　" + HB2[1] + "blow\n");
        if(HB2[0] == 3){
            Winner = name2;
            break;
        }
    }

    /* Result */
    IO.println("勝者は　【" + Winner + "】　！！！\n");
}