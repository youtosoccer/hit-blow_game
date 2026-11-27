package method;

public class CheckHB {

    /* HBチェック */
    public int[] checkHB(String num,int[] ansnum){
        int[] HB;
        int H=0 , B=0;
        /* hitカウント */
        for(int i=0;i<3;i++){
            if(ansnum[i] == num.charAt(i)-'0'){
                H++;
            }
        }
        /* blowカウント */
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(ansnum[i] == num.charAt(j)-'0' && i!=j){
                    B++;
                };
            };
        };
        /* 戻り値生成 */
        HB = new int[]{H,B};
        return HB;
    }
}