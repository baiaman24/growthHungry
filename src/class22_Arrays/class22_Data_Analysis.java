package class22_Arrays;

public class class22_Data_Analysis {
    public static void main(String[] args) {
        double[] dailyRevenue = {55455.5,5684.5,4564.5,546546};
        double sum = 0;
        for(int index = 0; index < dailyRevenue.length; index++){
          sum+=dailyRevenue[index];
        }
        sum/=dailyRevenue.length;
        System.out.println(sum);
    }
}
