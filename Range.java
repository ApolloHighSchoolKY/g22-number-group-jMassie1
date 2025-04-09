public class Range implements NumberGroup {

    private int mint = 0;
    private int maxed = 0;
    

    public TwoInt(minNum , maxNum){
        mint = minNum;
        maxed = maxNum;
    }

    public void theRange(){
        int[] array = new int[Math.abs(mint) + maxed];

        for(int i : array){
            for(int j = mint; j < maxed; j++)
                i = j;
        }

    }
}
