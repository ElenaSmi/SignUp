package core.SignUp;

//BEGIN
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sign_Up_Selenium {
	public static void main(String[] args) {

		// WebDriver driver = new HtmlUnitDriver();
		WebDriver driver = new FirefoxDriver();
		String text_case_id_01 = "TC-001.01";
		String text_case_id_02 = "TC-001.02";
		String text_case_id_03 = "TC-001.03";
		String text_case_id_04 = "TC-001.04";
		String text_case_id_05 = "TC-001.05";
		String text_case_id_06 = "TC-001.06";
		String text_case_id_07 = "TC-001.07";
		String text_case_id_08 = "TC-001.08";
		String text_case_id_09 = "TC-001.09";
		String text_case_id_10 = "TC-001.10";
		String text_case_id_11 = "TC-001.11";
		String text_case_id_12 = "TC-001.12";
		String text_case_id_13 = "TC-001.13";
		String text_case_id_14 = "TC-001.14";
		String text_case_id_15 = "TC-001.15";
		String text_case_id_16 = "TC-001.16";
		String text_case_id_17 = "TC-001.17";
		String text_case_id_18 = "TC-001.18";
		String text_case_id_19 = "TC-001.19";
		String text_case_id_20 = "TC-001.20";
		
		String url = "http://learn2test.net/qa/apps/sign_up/v1/";
		String url_location = "http://www.geoplugin.net/json.gp?";
		String title_sign_up_expected = "Welcome to Sign Up";
		String text_title_sign_up_expected = "Sign Up";
		String title_facebook_expected = "Welcome to Facebook - Log In, Sign Up or Learn More";
		String title_twitter_expected = "Twitter";
		String title_flickr_expected = "Welcome to Flickr - Photo Sharing";
		String title_youtube_expected = "YouTube";
		String copyright_text_expected = "© 2014 learn2test.net";
		String error_fname_empty_expected = "Please enter First Name";
		String error_lname_empty_expected = "Please enter Last Name";
		String error_email_empty_expected ="Please enter Email Address";
		String first_name_field_expected = "First Name";
		String system_text_expected = "Windows 7 & Firefox 30";
		String fname = "Alex";
		String lname = "Moore";
		String email = "alexmoore@gmail.com";
		String phone = "415 555-1212";
		

		// TC-001.01
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String first_quote = driver.findElement(By.id("id_quotes")).getText();
		driver.navigate().refresh();
		String second_quote = driver.findElement(By.id("id_quotes")).getText();

		if (first_quote.equals(second_quote)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_01
					+ " - FAILED");
			System.out.println("Initila quote/Quote after refreshing: \t"
					+ first_quote + "/" + second_quote);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_01
					+ " - PASSED");
			System.out.println("Initila quote/Quote after refreshing: \t"
					+ first_quote + "/" + second_quote);
			System.out.println("=======================================");
		}
		
		//TC-001.02
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String title_sign_up_actual = driver.getTitle();

		if (title_sign_up_expected.equals(title_sign_up_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_02
					+ " - PASSED");
			System.out.println("Title Expected/Actual: \t"
					+ title_sign_up_expected + "/" + title_sign_up_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_02
					+ " - FAILED");
			System.out.println("Title Expected/Actual: \t"
					+ title_sign_up_expected + "/" + title_sign_up_actual);
			System.out.println("=======================================");
		}

		// TC-001.03
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String text_title_sign_up_actual = driver.findElement(By.id("id_f_title")).getText();

		if (text_title_sign_up_expected.equals(text_title_sign_up_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_03
					+ " - PASSED");
			System.out.println("Title Expected/Actual: \t"
					+ text_title_sign_up_expected + "/" + text_title_sign_up_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_03
					+ " - FAILED");
			System.out.println("Title Expected/Actual: \t"
					+ text_title_sign_up_expected + "/" + text_title_sign_up_actual);
			System.out.println("=======================================");
		}

		
		// TC-001.04
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String first_name_field_actual = driver.findElement(By.id("id_f_label_fn")).getText();

		if (first_name_field_expected.equals(first_name_field_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_04
							+ " - PASSED");
			System.out.println("There is field First Name. \t");
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_04
							+ " - FAILED");
			System.out.println("There is not text field First Name. \t");
							
			System.out.println("=======================================");
		}

		// TC-001.05
				
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				

		if (driver.findElement(By.id("id_g_radio_01")).isDisplayed()) {
			System.out.println("Test Case ID: \t\t" + text_case_id_05
							+ " - PASSED");
			System.out.println("There is radio button Male. \t");
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_05
							+ " - FAILED");
			System.out.println("There is not radio button Male. \t");
							
			System.out.println("=======================================");
		}

        // TC-001.06
			
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				

		if (driver.findElement(By.id("id_state")).isDisplayed()) {
			System.out.println("Test Case ID: \t\t" + text_case_id_06
							+ " - PASSED");
			System.out.println("There is dropdown list State. \t");
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_06
							+ " - FAILED");
			System.out.println("There is not dropdown list State. \t");
							
			System.out.println("=======================================");
		}

		// TC-001.07
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
						

		if (driver.findElement(By.id("id_checkbox")).isDisplayed()) {
			System.out.println("Test Case ID: \t\t" + text_case_id_07
							+ " - PASSED");
			System.out.println("There is check box \"I agree to the Terms\". \t");
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_07
							+ " - FAILED");
			System.out.println("There is not check box \"I agree to the Terms\". \t");
									
			System.out.println("=======================================");
		}

								
		//TC-001.08
				
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id("id_img_facebook")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ArrayList<String> allTabs = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(allTabs.get(1));
		String title_facebook_actual = driver.getTitle();
		driver.close();
		driver.switchTo().window(allTabs.get(0));

		if (title_facebook_expected.equals(title_facebook_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_08
					+ " - PASSED");
			System.out.println("Title Expected/Actual: \t"
					+ title_facebook_expected + "/" + title_facebook_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_08
					+ " - FAILED");
			System.out.println("Title Expected/Actual: \t"
					+ title_facebook_expected + "/" + title_facebook_actual);
			System.out.println("=======================================");
		}
		
		//TC-001.09
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id("id_img_twitter")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ArrayList<String> allTabsTwitter = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(allTabsTwitter.get(1));
		String title_twitter_actual = driver.getTitle();
		driver.close();
		driver.switchTo().window(allTabsTwitter.get(0));

		if (title_twitter_expected.equals(title_twitter_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_09
					+ " - PASSED");
			System.out.println("Title Expected/Actual: \t"
					+ title_twitter_expected + "/" + title_twitter_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_09
					+ " - FAILED");
			System.out.println("Title Expected/Actual: \t"
					+ title_twitter_expected + "/" + title_twitter_actual);
			System.out.println("=======================================");
		}
		
		//TC-001.10
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id("id_img_flickr")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ArrayList<String> allTabsFlickr = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(allTabsFlickr.get(1));
		String title_flickr_actual = driver.getTitle();
		driver.close();
		driver.switchTo().window(allTabsFlickr.get(0));

		if (title_flickr_expected.equals(title_flickr_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_10
					+ " - PASSED");
			System.out.println("Title Expected/Actual: \t"
					+ title_flickr_expected + "/" + title_flickr_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_09
					+ " - FAILED");
			System.out.println("Title Expected/Actual: \t"
					+ title_flickr_expected + "/" + title_flickr_actual);
			System.out.println("=======================================");
		}
		
		//TC-001.11
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id("id_img_youtube")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ArrayList<String> allTabsYoutube = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(allTabsYoutube.get(1));
		String title_youtube_actual = driver.getTitle();
		driver.close();
		driver.switchTo().window(allTabsYoutube.get(0));

		if (title_youtube_expected.equals(title_youtube_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_11
					+ " - PASSED");
			System.out.println("Title Expected/Actual: \t"
					+ title_youtube_expected + "/" + title_youtube_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_11
					+ " - FAILED");
			System.out.println("Title Expected/Actual: \t"
					+ title_youtube_expected + "/" + title_youtube_actual);
			System.out.println("=======================================");
		}
		
		//TC-001.12
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		DateFormat dateFormat = new SimpleDateFormat("MMMMM dd, YYYY ");
		Calendar cal = Calendar.getInstance();
		String current_date = dateFormat.format(cal.getTime());
		String app_current_date = driver.findElement(By.id("timestamp")).getText();
		
		if (app_current_date.equalsIgnoreCase(current_date)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_12
							+ " - PASSED");
			System.out.println("Current system date/ app current date:" + current_date
					+ "/" + app_current_date);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_12
							+ " - FAILED");
			System.out.println("Current system date/ app current date:" + current_date
					+ "/" + app_current_date+"|");
							
			System.out.println("=======================================");
		}

		//TC-001.13
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String copyright_text_actual = driver.findElement(By.id("copyright")).getText();
		

		if (copyright_text_actual.equals(copyright_text_expected)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_13
					+ " - PASSED");
			System.out.println("Text Expected/Actual: \t"
					+ copyright_text_expected + "/" + copyright_text_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_13
					+ " - FAILED");
			System.out.println("Text Expected/Actual: \t"
					+ copyright_text_expected + "/" + copyright_text_actual);
			System.out.println("=======================================");
		}
		
		//TC-001.14
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String system_text_actual = driver.findElement(By.id("os_browser")).getText();
		
		if (system_text_actual.equals(system_text_expected)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_14
					+ " - PASSED");
			System.out.println("Text Expected/Actual: \t"
					+ system_text_expected + "/" + system_text_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_14
					+ " - FAILED");
			System.out.println("Text Expected/Actual: \t"
					+ system_text_expected + "/" + system_text_actual);
			System.out.println("=======================================");
		}
		
		//TC-001.15
		
		//TC-001.16
		

		//TC-001.17

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id("id_quotes")).getText();
		String quote = driver.findElement(By.id("id_quotes")).getText();
		if (quote != null && quote.length() <= 103 && quote.length() >= 36) {
			System.out.println("Test Case ID: \t\t" + text_case_id_17
					+ " - PASSED");
			System.out.println("Quote length: " + quote.length());
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_17
					+ " - FAILED");
			System.out.println("Quote length: " + quote.length());
			System.out.println("=======================================");
		}

		// TC-001.18

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id("id_submit_button")).click();
		String error_fname_empty_actual = driver
				.findElement(By.id("ErrorLine")).getText();

		if (error_fname_empty_expected.equals(error_fname_empty_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_18
					+ " - PASSED");
			System.out.println("Error Expected/Actual: \t"
					+ error_fname_empty_expected + "/"
					+ error_fname_empty_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_18
					+ " - FAILED");
			System.out.println("Error Expected/Actual: \t"
					+ error_fname_empty_expected + "/"
					+ error_fname_empty_actual);
			System.out.println("=======================================");
		}

		//TC-001.19
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id("id_fname")).sendKeys(fname);
				
		driver.findElement(By.id("id_submit_button")).click();
		String error_lname_empty_actual = driver
				.findElement(By.id("ErrorLine")).getText();

		if (error_lname_empty_expected.equals(error_lname_empty_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_19
					+ " - PASSED");
			System.out.println("Error Expected/Actual: \t"
					+ error_lname_empty_expected + "/"
					+ error_lname_empty_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_19
					+ " - FAILED");
			System.out.println("Error Expected/Actual: \t"
					+ error_lname_empty_expected + "/"
					+ error_lname_empty_actual);
			System.out.println("=======================================");
		}

		
		//TC-001.20
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id("id_fname")).sendKeys(fname);
		driver.findElement(By.id("id_lname")).sendKeys(lname);
				
		driver.findElement(By.id("id_submit_button")).click();
		String error_email_empty_actual = driver
				.findElement(By.id("ErrorLine")).getText();

		if (error_email_empty_expected.equals(error_email_empty_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_20
					+ " - PASSED");
			System.out.println("Error Expected/Actual: \t"
					+ error_email_empty_expected + "/"
					+ error_email_empty_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_20
					+ " - FAILED");
			System.out.println("Error Expected/Actual: \t"
					+ error_email_empty_expected + "/"
					+ error_email_empty_actual);
			System.out.println("=======================================");
		}
		driver.quit();
	}
}
//END