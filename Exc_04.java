package Exc_4;

import java.util.ArrayList;
import java.util.List;

public class Exc_04
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            list.add((int) (Math.random() * 15) + 1);
        }
        System.out.println(list);
        list = partition(list,9);
        System.out.println(list);
    }


    public static List<Integer> partition(List<Integer>list,int value)
    {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i: list)
        {
            if(i<value)
            {
                list1.add(i);
            } else
            {
                list2.add(i);
            }
        }
        list1.addAll(list2);
        return list1;
    }


}
