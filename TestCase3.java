import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestCase3 extends Base {
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		driver.findElementByClassName("android.widget.ImageButton").click();
		driver.findElementByXPath("//android.widget.EditText[@text='NIM']").sendKeys("1908");
		driver.findElementByXPath("//android.widget.EditText[@text='Nama']").sendKeys("Sausan");
		driver.findElementByXPath("//android.widget.EditText[@text='Jurusan']").sendKeys("Informatika");
		driver.findElementByClassName("android.widget.Button").click();
		driver.findElementByAndroidUIAutomator("text(\"Allow\")").click();
		driver.findElementsByXPath("//android.widget.RelativeLayout").get(1).click();
		driver.findElementsByXPath("//android.view.ViewGroup").get(1).click();
		driver.findElementByAndroidUIAutomator("text(\"SUBMIT\")").click();
		
		/**
		 * driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		 * driver.findElementById("android:id/checkbox").click();
		 * driver.findElementByXPath("//android.widget.LinearLayout[2]").click();
		 * driver.findElementByClassName("android.widget.EditText").sendKeys("Password");
		 * driver.findElementsByClassName("android.widget.Button").get(1).click();
		 * driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		
		 */
		
		
	}
}
