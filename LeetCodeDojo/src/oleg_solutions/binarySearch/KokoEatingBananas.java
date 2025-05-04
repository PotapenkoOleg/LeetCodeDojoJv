package oleg_solutions.binarySearch;

public class KokoEatingBananas {
    private int limit;
    private int[] piles;

    public int minEatingSpeed(int[] piles, int h) {
        limit = h;
        this.piles = piles;
        var left = 1;
        var right = 0;
        for (var pile : piles) {
            right = Math.max(right, pile);
        }
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

    private boolean check(int mid) {
        var hours = 0;
        for (double pile : piles) {
            hours += Math.ceil(pile / mid);
        }
        return hours <= limit;
    }
}
