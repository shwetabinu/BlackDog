package blackdog_automation.all_functions;

import java.io.IOException;


/**
 * Sets the page load timeout time and the implicit wait time
 * @author aswinvijayan
 *
 */
public class UtilityClass extends InitClass
{
	public UtilityClass() throws IOException
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public static long PAGE_LOAD_TIMEOUT = 50;
	public static long IMPLCIT_WAIT = 100;
}
