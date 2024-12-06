package Arrays;

public class LeetCode134GasStations {

	public static void main(String[] args) {
		int[] gas = {1,2,3,4,5}, cost = {3,4,5,1,2};
		System.out.println(canCompleteCircuit(gas,cost));

	}
	
	public static int canCompleteCircuit(int[] gas, int[] cost) {

        int totalgas=0;
        int totalcost=0;

        for(int i=0;i<gas.length;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
        }

        if(totalcost>totalgas){
            return -1;
        }
        int remainingGas=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            remainingGas+=gas[i]-cost[i];
            if(remainingGas<0){
                start=i+1;
                remainingGas=0;
            }
        }
        return start;
    }

}
