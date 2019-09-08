import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.className;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kasia\\Desktop\\kurs\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.booking.com");

        System.out.println(driver.getTitle());
        WebElement element = driver.findElement(className("sb-destination__input"));
        System.out.println(element.getAttribute("placeholder"));
//Mój komentarz
    }
}

