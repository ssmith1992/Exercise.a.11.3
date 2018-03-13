package Chapter11;

import java.util.Iterator;
import java.util.LinkedList;

/*
Write a method called removeInRange that accepts four parameters: a LinkedList, an element value, a starting index,
and an ending index. The method’s behavior is to remove all occurrences of the given element that appear in the list
between the starting index (inclusive) and the ending index (exclusive). Other values and occurrences of the
given value that appear outside the given index range are not affected.
For example, for the list (0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16), a call of
removeInRange(list, 0, 5, 13) should produce the list (0, 0, 2, 0, 4, 6, 8, 10, 12, 0, 14, 0, 16).
Notice that the zeros located at indexes between 5 inclusive and 13 exclusive in the original list.
 */
public class Exercise3 {
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(0);
        list.add(2);
        list.add(0);
        list.add(4);
        list.add(0);
        list.add(6);
        list.add(0);
        list.add(8);
        list.add(0);
        list.add(10);
        list.add(0);
        list.add(12);
        list.add(0);
        list.add(14);
        list.add(0);
        list.add(16);

        Exercise3 exercise3 = new Exercise3();
        exercise3.removeInRange(list, 0, 5, 13);

        System.out.println(list);

    }

    public void removeInRange(LinkedList list, int value, int start, int end)
    {
        Iterator<Integer> itr = list.iterator();

        int count = 0;

        while (itr.hasNext())
        {
            int current = itr.next();

            if (count >= start && count <= end-1 && current == value)
            {
                itr.remove();
            }
            count++;
        }
    }
}
