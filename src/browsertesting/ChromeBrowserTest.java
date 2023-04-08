package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

    public static void main(String[] args) {

        //  1. Setup Chrome browser
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        WebDriver driver = new ChromeDriver();

        //2. Open URL
        driver.get(baseUrl);

        //Maximise the browser
        driver.manage().window().maximize();

        //3. Print the title of the page
        System.out.println("Title of the page: " + driver.getTitle());

        //4. Print the current url
        System.out.println("Current URL: " + driver.getCurrentUrl());

        //5. Print the page source
        System.out.println("Page Source: " + driver.getPageSource());

        // 6. Enter the email to email field
        driver.findElement(By.id("Email")).sendKeys("XYZ@gmail.com");

        //7. Enter the password to password field
        driver.findElement(By.id("Password")).sendKeys("ABCD1234");

        // 8. Close the browser
        driver.close();
    }

}
