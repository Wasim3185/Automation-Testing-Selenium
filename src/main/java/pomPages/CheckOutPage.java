package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
@FindBy(xpath="//button[text()='Checkout']")
private WebElement checkout;

@FindBy(xpath="//img[@src='https://www.skillrary.com/assets/skillrary/images/app-android.png']")
private WebElement appstore;

@FindBy(name="user")
private WebElement textbox;

public CheckOutPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void checkoutbtn() {
	checkout.click();
}

public void appstorebtn() {
	appstore.click();
}

public void textboxs(String value) {
	textbox.sendKeys(value);
}

}
