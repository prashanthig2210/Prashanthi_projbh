package testCases;

import org.junit.Assert;
import org.junit.Test;

import pageclasses.SearchHotelpage;

public class SearchHotelPageTest {
	
	SearchHotelpage SearchHotelpage = new SearchHotelpage();


		// TODO Auto-generated constructor stub
	   @Test
		public void atestlocation()
		{
			SearchHotelpage.setLocation("London");
		    Assert.assertEquals("London", SearchHotelpage.getLocation());
		}
	
       @Test
       public void btestroom()
       {
    	   SearchHotelpage.setroomno("2 - Two");
    	   Assert.assertEquals("2 - Two", SearchHotelpage.getroomno());
       }
}
