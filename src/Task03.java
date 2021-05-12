public class Task03 {
    public static void main(String[] args) {
        int [] Mass = {14,21,27,38,64};
        int change = Mass[0];
        Mass[0]=Mass[4];
        Mass[Mass.length-1]=change;
        System.out.println(Mass[0]+Mass[Mass.length/2]);
    }
}