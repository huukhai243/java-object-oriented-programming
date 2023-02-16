import org.openqa.selenium.WebDriver;
public class test {
	
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\AD\\Downloads\\chromedriver_win32.zip");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://vi.wikipedia.org/wiki/Vua_Vi%E1%BB%87t_Nam");

        System.out.println(driver.getTitle());
        driver.quit();

    }
}