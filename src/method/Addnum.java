package method;

public class Addnum{

    /* 数字登録 */
    public int[] add(){
        int[] addnum = new int[3];
        for(int i=0 ; i<addnum.length ; i++){                                   //ランダムな数字を入力
            addnum[i] = new java.util.Random().nextInt(10);
            for(int j=0;j<i;j++){                               //数字の重複防止チェック
                if(addnum[j] == addnum[i]){
                    i--;
                    break;
                }
            }

        }
        return addnum;
    }

}