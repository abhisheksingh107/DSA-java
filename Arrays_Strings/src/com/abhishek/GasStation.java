package com.abhishek;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas, cost));
    }
    static int canCompleteCircuit(int[] gas, int[] cost){
        int totalGas = 0;
        int totalCost = 0;
        int startStation = 0;
        int currentGas = 0;
        int n = gas.length;
        for (int i = 0; i < n; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                startStation = i + 1;
                currentGas = 0;
            }
        }
        return startStation;
    }
}


/*


Initialize Variables:

totalGas: This keeps track of the total gas available across all stations.
totalCost: This keeps track of the total cost to travel to the next station across all stations.
currentGas: This keeps track of the gas in the car as we travel from one station to another.
startStation: This is the station where we will try to start the journey.
First Pass - Calculate Total Gas and Total Cost: We need to calculate if it is possible to complete the entire circuit by checking if the total gas is enough to cover the total cost.

totalGas = 0
totalCost = 0
currentGas = 0
startStation = 0
Now, we loop through all the stations and update these values.

For station 0 (i=0):

gas[0] = 1, cost[0] = 3
totalGas += 1 → totalGas = 1
totalCost += 3 → totalCost = 3
currentGas += 1 - 3 = -2 → We don’t have enough gas to go from station 0 to station 1.
Since currentGas < 0, we reset the starting point: startStation = 1 and currentGas = 0.
For station 1 (i=1):

gas[1] = 2, cost[1] = 4
totalGas += 2 → totalGas = 3
totalCost += 4 → totalCost = 7
currentGas += 2 - 4 = -2 → We don’t have enough gas to go from station 1 to station 2.
Since currentGas < 0, we reset the starting point: startStation = 2 and currentGas = 0.
For station 2 (i=2):

gas[2] = 3, cost[2] = 5
totalGas += 3 → totalGas = 6
totalCost += 5 → totalCost = 12
currentGas += 3 - 5 = -2 → We don’t have enough gas to go from station 2 to station 3.
Since currentGas < 0, we reset the starting point: startStation = 3 and currentGas = 0.
For station 3 (i=3):

gas[3] = 4, cost[3] = 1
totalGas += 4 → totalGas = 10
totalCost += 1 → totalCost = 13
currentGas += 4 - 1 = 3 → We have enough gas to go from station 3 to station 4.
For station 4 (i=4):

gas[4] = 5, cost[4] = 2
totalGas += 5 → totalGas = 15
totalCost += 2 → totalCost = 15
currentGas += 5 - 2 = 6 → We have enough gas to go from station 4 to station 0.
Final Check:

After the loop, we see that totalGas = 15 and totalCost = 15. Since totalGas >= totalCost, it is possible to complete the journey.
The last startStation we set was 3. So, we can start the journey from station 3.







 */