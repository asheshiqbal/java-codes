package binsearch;

public class Find {
	
	Find(){
		
	}
	
	int finder(int[] s, int t) {
		
		int pos=-1;
		int beg = 0, end = (s.length)-1, mid = (beg+end)/2; 

		while(beg<=end)
		{
			if(t==s[mid])
			{
				pos = mid;
				break;
			}
			
			else if(t<s[mid])
				end = mid-1;

			else beg = mid+1;

			mid = (beg+end)/2;
		}
		
		return pos;
	}
}