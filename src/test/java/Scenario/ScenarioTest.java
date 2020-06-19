package Scenario;

import BaseTest.Base;
import org.junit.Test;
import util.Steps;

public class ScenarioTest extends Base {
    Steps steps = new Steps();

    @Test
    public void TestSenaryosu() throws Exception {
        steps.ifElementExistClick("a[class='fancybox-item fancybox-close']");// kadın/erkek pop-up ı çıkarsa kapat
        steps.clickElement("i[class='icon navigation-icon-user']");
        steps.waitSecond(2);
        steps.sendKeysToElementTest("input[id='email']", "testiniumdeneme123@gmail.com");
        steps.sendKeysToElementTest("input[id='password']", "deneme123");
        steps.clickElement("a[id='loginSubmit']");
        steps.getTextControlTest("span[id='logged-in-container']>span", "Hesabım");
        steps.sendKeysToElementTest("input[class='search-box']", "bilgisayar");
        steps.clickElement("i[class='search-icon']");
        steps.randomClick("div[class='p-card-img-wr']");
        steps.waitSecond(2);
        steps.saveText("div[class='pr-cn-in'] span[class='prc-slg']");
        steps.clickElement("div[class='pr-cn-in'] div[class='add-to-bs-tx']");
        steps.clickElement("i[class='icon navigation-icon-basket']");
        steps.waitSecond(2);
        steps.denenme();
        steps.clickElement("button[class='btn-item btn-remove']");
        steps.getTextControlTest("div[class='col-lg-8 col-md-8 col-xs-8'] span", "Sepetinizde ürün bulunmamaktadır.");
    }
}
