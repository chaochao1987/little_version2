package cn.seleniumcn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
@author Bruce Gu
**/
public class AddProduct {
public static final String SELENIUMCN_LINK = "//div[@class='panel-header panel-header-noborder window-header']//a[contains(@class,'panel-tool-close')]";
public static void main(String args[]) throws Exception {
WebDriver driver = new FirefoxDriver();//调用firefox浏览器
driver.get("http://www.littleboss.com");//打开url
driver.findElement(By.name("username_login")).clear();
driver.findElement(By.name("username_login")).sendKeys("test@163.com");
driver.findElement(By.name("password_login")).clear();
driver.findElement(By.name("password_login")).sendKeys("1685");
driver.findElement(By.id("guanwang-index-login")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//div[@class='panel-header panel-header-noborder window-header']//a[contains(@class,'panel-tool-close')]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[contains(text(),'商品管理')]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div/span[contains(text(),'商品列表')]")).click();
Thread.sleep(6000);
driver.findElement(By.xpath("//span[contains(text(),'添加产品')]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@type='radio' and @data-title='普通']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//span[contains(text(),'选择并继续下一步')]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='Product_name']")).click();
driver.findElement(By.xpath("//input[@id='Product_name']")).sendKeys("seleniumtest1");
driver.findElement(By.xpath("//input[@id='Product_prod_name_ch']")).sendKeys("seleniumtest1");
driver.findElement(By.xpath("//input[@id='Product_prod_name_en']")).sendKeys("seleniumtest1");
driver.findElement(By.xpath("//input[@id='Product_sku']")).sendKeys("seleniumtest1_03");
driver.findElement(By.xpath("//input[@id='Product_declaration_ch']")).sendKeys("seleniumtest1");
driver.findElement(By.xpath("//input[@id='Product_declaration_en']")).sendKeys("seleniumtest1");
driver.findElement(By.xpath("//font[contains(text(),'留空 或者 选择末级分类')]/preceding-sibling::span//span[@class='combo-arrow']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@class='tree-node' and @node-id='114']/span[contains(text(),'运动服饰')]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//label[contains(text(),'标签')]//following-sibling::span//span[@class='combo-arrow']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@value='分期付款']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//label[starts-with(text(),'品牌:')]/following-sibling::span/span/span[@class='combo-arrow']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@value='1']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@class='tabs-wrap']//li[2]/a")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//label[contains(text(),'首选供应商:')]/following-sibling::span/span/span")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@id='index-northlayout-topmenu132']/following-sibling::div[15]//div[@value='2']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@id='catalog-product-index-createproduct-dialog']/div[@class='dialog-button']/a[1]/span/span")).click();
}
}