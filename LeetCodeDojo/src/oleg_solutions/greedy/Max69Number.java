package oleg_solutions.greedy;

public class Max69Number {
    public int maximum69Number(int num) {
        var number = new StringBuilder();
        number.append(num);
        var index = number.indexOf("6");
        if (index != -1) {
            number.setCharAt(index, '9');
        }
        return Integer.parseInt(number.toString());
    }
}
