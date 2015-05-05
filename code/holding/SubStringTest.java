package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubStringTest {
    private Integer [] aArray = null;
    public static void main(String[] args) {
        SubStringTest tss = new SubStringTest();
        tss.aArray = new Integer[]{1,2,3,4,5,6};
        List<Integer> bbList = Arrays.asList(tss.aArray);
        System.out.println(bbList);
        List<Integer> subBb = bbList.subList(1, 3);
        System.out.println(subBb);
        subBb.set(1, 89);
        System.out.println(subBb);
        System.out.println(bbList);
    }
}
