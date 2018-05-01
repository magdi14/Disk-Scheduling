import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SSTF {
    public ArrayList<Integer> input = new ArrayList<>();
    public ArrayList<Integer> inpCopy;
    Integer StartHead;

    public SSTF(ArrayList<Integer> input, Integer startHead) {
        this.input = input;
        StartHead = startHead;
        inpCopy = new ArrayList<>(input);
        Collections.copy(inpCopy, input);
        inpCopy.add(0, StartHead);
    }
    public void FindMinSeekTime(Integer curRequest)
    {
        inpCopy.remove(0);
        Integer minSeekTime = Integer.MAX_VALUE;
        for(int i=0; i<inpCopy.size(); i++)
        {
            Integer temp = Math.abs(inpCopy.get(i) - curRequest);
            if(temp < minSeekTime)
            {
                minSeekTime = temp;
                Collections.swap(inpCopy, 0, i);
            }
        }

    }
    public ArrayList<Integer> Allocation()
    {
        ArrayList<Integer> res = new ArrayList<>();
        while (!inpCopy.isEmpty())
        {   Integer i = inpCopy.get(0);
            FindMinSeekTime(i);
            res.add(i);
        }
        return res;
    }
    public Integer CalculatTotalMoves(ArrayList<Integer> res)
    {
        Integer TotalMoves = 0;
        for(int i=0; i<res.size()-1; i++)
        {   Integer temp = Math.abs(res.get(i+1) - res.get(i));
            TotalMoves += temp;
        }
        return TotalMoves;
    }
    public void View(ArrayList<Integer> res)
    {
        for(Integer i = 0; i<res.size(); i++)
        {
            System.out.print(res.get(i)+" -> ");
            if(i+1==res.size()-1)
            {
                System.out.print(res.get(i+1)+"\n");
                break;
            }
        }


    }
}

