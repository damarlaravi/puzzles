package com.online.ticket;

import java.util.Arrays;
import java.util.List;

public class BuyingTicket {

	public static void main(String[] args) {
		//System.out.println(calculateTimeOptimized(new int[]{4, 1, 1, 1, 1, 0}, 1));
		
		System.out.println(calculateTimeOptimized(Arrays.asList(5, 2, 6, 3, 4, 5, 2), 3));
	}
	
	public static int calculateTimeOptimized(List<Integer> line, int pos) {
	    // Minimum time I have to wait is the number of tickets I want to buy.
	    int waitingTime = line.get(pos);
	    for (int i = 1; i < line.size() - 1; i++) {
	      if (i == pos) continue;
	      // I will see people -> minimum(how many tickets I need, how many tickets they need).
	      waitingTime += (Math.min(line.get(pos), line.get(i)));
	      // Unless they were behind me, I got my ticket before them so I need to see them 1 time less.
	      if (i > pos) {
	        waitingTime--;
	      }
	    }

	    return waitingTime;
	  }

	/*public static long calculateTimeOptimized(int[] tickets, int p) {
		long times = 0;
		// creating this array to check whether the *person i* buy tickets less
		// than *person p*
		int[] temp = Arrays.copyOf(tickets, tickets.length);
		for (int i = 0; i < tickets.length; i++) {
			temp[i] = tickets[i] - tickets[p];
		}
		for (int i = 0; i < tickets.length; i++) {
			if (temp[i] < 0)
				times += tickets[i];
			else {
				if (i <= p)
					times += tickets[p];
				else
					times += tickets[p] - 1;
			}
		}
		return times;
	}*/
}
