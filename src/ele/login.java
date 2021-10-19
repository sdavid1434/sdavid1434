package ele;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class login {
public static void main(String[] args)
{

System.setProperty("webdriver.chrome.driver","./driver/chromedriver1.exe");



    //opening browserurlcode
WebDriver driver = new ChromeDriver();
System.out.println("test started ");  
 String url="https://www.myntra.com/";
   driver.get(url);
  //WebElement ef = driver.findElement(By.xpath("//a[text()='Men']"));
  driver.navigate().to("https://www.myntra.com/men-tshirts");
 
}
}