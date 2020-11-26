package ru.netology.stats;

public class StatsService {



    public int sum(int[] purchases) {
        int result = 0;
        for (int purchase : purchases) {
            result += purchase;
        }
        return result;
    }

    public int average(int[] purhases) {
        return sum(purhases) / purhases.length;
    }

    public int monthWithMax(int[] purchases) {
        int max = getMax(purchases);
        int mountNumber = 0;
        int mountWithMax = 0;
        for (int purchase : purchases) {
            mountNumber++;
            if (purchase == max) {
                mountWithMax = mountNumber;
            }
        }

        return mountWithMax;

    }
    public int getMax(int[] purchases) {
        int max = purchases[0];
        for (int purchase : purchases) {
            if (purchase > max) {
                max = purchase;



            }
        }
        return max;
    }


    public int monthWithMin(int[] purchases) {
        int min = getMin(purchases);
        int mountNumber = 0;
        int mountWithMin = 0;
        for (int purchase : purchases) {
            mountNumber++;
            if (purchase == min) {
                mountWithMin = mountNumber;
            }
        }

        return mountWithMin;
    }

    public int getMin(int[] purchases) {
        int min = purchases[0];
        for (int purchase : purchases) {
            if (purchase < min) {
                min = purchase;
            }
        }
        return min;
    }

    public int calcMonthsBelowAverage(int[] purchases) {
     int average = average(purchases);
     int count = 0;
        for (int purchase : purchases) {
            if (purchase > average) {
                count ++;
            }

        }
        return count;
    }

    public int calcMonthsAboveAverage(int[] purchases) {
        int average = average(purchases);
        int count = 0;
        for (int purchase : purchases) {
            if (purchase < average) {
                count ++;
            }

        }

        return count;
    }

}