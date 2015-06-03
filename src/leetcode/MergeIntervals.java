package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 * Created by 7 
 * @BayArea
 * 3:22:55 PM
 * May 19, 2015
 * Given a collection of intervals, merge all overlapping intervals.

For example,
Given [1,3],[2,6],[8,10],[15,18],
return [1,6],[8,10],[15,18].
 */
public class MergeIntervals {
	public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
     
		ArrayList<Interval> result = new ArrayList<Interval>();
		if(intervals.size()<1)
        	return result;
		
        Collections.sort(intervals,new MyComparator());
        
        Interval current = intervals.get(0);
        for(int i = 1;i<intervals.size(); i++){
        		Interval tmp = intervals.get(i);
        		if(tmp.start<=current.end)
        			current.end = Math.max(tmp.end, current.end);
        		else{
        			result.add(current);
        			current = tmp;
        		}
        }
        result.add(current);
        return result;
    }
}

class MyComparator implements Comparator<Interval>{
	@Override
	public int compare(Interval x, Interval y){
		if(x.start<y.start)
			return -1;
		else if(x.start>y.start)
			return 1;
		return 0;
	}
}
