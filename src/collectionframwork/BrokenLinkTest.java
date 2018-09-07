package src.collectionframwork;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

//<<<<<<< HEAD
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*=======
>>>>>>> eab87807215fd472400c8ce41025c28283a3518f*/
public class BrokenLinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" hooooooo");

	}

	public static String isLinkBroken(URL url) throws Exception

	{

		// url = new URL("http://yahoo.com");

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		try

		{

			connection.connect();

			String response = connection.getResponseMessage();

			connection.disconnect();

			return response;

		}

		catch (Exception exp)

		{

			return exp.getMessage();

		}

	}

//<<<<<<< HEAD
	public static List findAllLinks(WebDriver driver)

	{

		List<WebElement> elementList = new ArrayList<WebElement>();

		elementList = driver.findElements(By.tagName("a"));

		elementList.addAll(driver.findElements(By.tagName("img")));

		List finalList = new ArrayList();

		for (WebElement element : elementList)

		{

			if (element.getAttribute("href") != null)

			{

				finalList.add(element);

			}

		}

		return finalList;

	}
//=======
//	public static List findAllLinks(WebDriver driver)
//
//	{
//
//		List elementList = new ArrayList();
//
//		elementList = driver.findElements(By.tagName("a"));
//
//		elementList.addAll(driver.findElements(By.tagName("img")));
//
//		List finalList = new ArrayList();
//		;
//
//		for (WebElement element : elementList)
//
//		{
//
//			if (element.getAttribute("href") != null)
//
//			{
//
//				finalList.add(element);
//
//			}
//
//		}
//
//		return finalList;
//
//	}
//>>>>>>> eab87807215fd472400c8ce41025c28283a3518f
}