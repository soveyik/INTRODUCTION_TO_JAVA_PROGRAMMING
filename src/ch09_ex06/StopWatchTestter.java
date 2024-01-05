package ch09_ex06;

import java.util.Random;

public class StopWatchTestter {
    public static void main(String[] args) {
        int[] testnum = new int[100000];
        Random random = new Random();

        for(int i = 0; i < 100000; i++){
            testnum[i] = random.nextInt(100000);
        }
        StopWatch o = new StopWatch();
        o.start();
        System.out.println("startTime is " + o.getStartTime());

        selectionSort(testnum);
        System.out.println("end of time is " + o.getEndtime() );
        System.out.println("Elapsed Time is " + o.getElapsedTime());
    }
    public static void selectionSort(int[] nums){
        for(int i =0; i < nums.length - 1; i++){
            int min = nums[i];
            int minIdx;
        }
    }
}

