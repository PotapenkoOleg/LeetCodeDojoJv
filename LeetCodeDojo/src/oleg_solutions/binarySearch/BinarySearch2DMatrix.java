package oleg_solutions.binarySearch;

public class BinarySearch2DMatrix {
    public boolean solution(int[][] matrix, int target) {
        var m = matrix.length;
        var n = matrix[0].length;
        var left = 0;
        var right = n * m - 1;
        while (left <= right) {
            var mid = left + (right - left) / 2;
            var row = mid / n;
            var col = mid % n;
            var cur = matrix[row][col];
            if (cur == target) {
                return true;
            }
            if (cur < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
