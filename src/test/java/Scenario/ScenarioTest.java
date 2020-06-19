package Scenario;

import BaseTest.Base;
import org.junit.Test;
import util.Steps;

public class ScenarioTest extends Base {
    Steps steps = new Steps();

    @Test
    public void TestSenaryosu() throws Exception {
        steps.ifElementExistClick("a[class='fancybox-item fancybox-close']");// kadın/erkek pop-up ı çıkarsa kapat
        steps.clickElement("i[class='icon navigation-icon-user']"); //Giriş yap ikonuna tıkla
        steps.waitSecond(3); // 3 saniye bekle
        steps.sendKeysToElementTest("input[id='email']", "testiniumdeneme123@gmail.com"); //email inputuna değeri yaz
        steps.sendKeysToElementTest("input[id='password']", "deneme123"); // parola inputuna değeri yaz
        steps.clickElement("a[id='loginSubmit']"); // giriş yap butonuna tıkla
        steps.getTextControlTest("span[id='logged-in-container']>span", "Hesabım"); //giriş yapılmış mı kontrol et
        steps.sendKeysToElementTest("input[class='search-box']", "bilgisayar"); // arama çubuğuna "bilgisayar" yaz
        steps.clickElement("i[class='search-icon']"); //arama ikonuna bas
        steps.randomClick("div[class='p-card-img-wr']"); // rastgele bir ürün seç
        steps.waitSecond(2); // 2 saniye bekle
        steps.saveText("div[class='pr-cn-in'] span[class='prc-slg']"); //ürünün fiyat bilgisini kaydet
        steps.clickElement("div[class='pr-cn-in'] div[class='add-to-bs-tx']"); //sepete ekle butonuna bas
        steps.clickElement("i[class='icon navigation-icon-basket']"); //sepetim ikonuna bas
        steps.waitSecond(2); // 2 saniye bekle
        steps.changeControl(); // Sepetim sayfasında ürünlere göre div değişikliği olduğu için method yazıldı
        steps.clickElement("button[class='btn-item btn-remove']"); //sil butonuna bas
        steps.getTextControlTest("div[class='col-lg-8 col-md-8 col-xs-8'] span", "Sepetinizde ürün bulunmamaktadır."); // sepet boş mu kontrol et
    }
}
