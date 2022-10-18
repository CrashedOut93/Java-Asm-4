import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseEle {
    //Reverse Elements in an array list

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(500);
        nums.add(600);
        nums.add(700);

        nums.forEach(x -> System.out.println(x));

        System.out.println("------------------------");

        Collections.reverse(nums);

        nums.forEach(s -> System.out.println(s));
    }


}
