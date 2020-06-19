package util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Steps extends Methods {


    public void clickElement(String key) {
        WebElement element = findElement(key);
        clictToElement(element);
    }

    public void ifElementExistClick(String key) {
        waitSecond(2);
        List<WebElement> elements = driver.findElements(By.cssSelector(key));
        if (elements.size()>0){
            clictToElement(elements.get(0));
        }

    }
    public void randomClick(String key){
        List<WebElement> elements = findElements(key);
        clictToElement(elements.get(randomInt()));

    }

    public void sendKeysToElementTest(String key, String text) {
        WebElement element = findElement(key);
        sendKeysToElement(element, text);
    }

    public void waitSecond(int second) {
        waitByMilliSeconds(second * 1000);

    }

    public void getTextControlTest(String key, String text) {
        WebElement element = findElement(key);
        getTextControl(element, text);
    }
    public void getAttributeControlTest(String key, String text) {
        WebElement element = findElement(key);
        getAttributeControl(element, text);
    }

    public void textControlTest(String key) {
        WebElement element = findElement(key);
        textControl(element);
    }

    public void saveText(String key) {
        WebElement element = findElement(key);
        saveStaticString(element);

    }

    public void SelectElement(String key, String text) {
            SelectMethod(key, text);
    }



    public void denenme(){
        if (driver.findElements(By.cssSelector("div[class='pb-basket-item-price']")).size()>0){
            textControlTest("div[class='pb-basket-item-price']");
            clickElement("button[class='ty-numeric-counter-button']");
            waitSecond(2);
            getAttributeControlTest("input[class='counter-content']","2");
            clickElement("i[class='i-trash']");


        }else {
            textControlTest("div[class*='priceInfo']");
            SelectElement("select[class*='basketItemQuantity']","2");
            waitSecond(2);
            getTextControlTest("select[class*='basketItemQuantity'] option[selected='selected']","2");
            clickElement("a[class='removeitem']");

        }



    }
}
