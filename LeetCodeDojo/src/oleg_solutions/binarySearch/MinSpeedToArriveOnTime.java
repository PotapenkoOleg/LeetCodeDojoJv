package oleg_solutions.binarySearch;

public class MinSpeedToArriveOnTime {
    private double limit;
    private int[] trains;

    public int minSpeedOnTime(int[] dist, double hour) {
        if (dist.length > Math.ceil(hour)) {
            return -1;
        }
        limit = hour;
        trains = dist;
        var left = 0;
        var right = (int) Math.pow(10, 7);
        while (left <= right) {
            var mid = left + (right - left) / 2;
            if (check(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean check(int trainSpeed) {
        var travelTime = 0.0;
        for (var i = 0; i < trains.length; i++) {
            travelTime = Math.ceil(travelTime);
            travelTime += (double)trains[i] / trainSpeed;
        }
        return travelTime <= limit;
    }
}
