package page.material.add;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AttachmentFilePage {
	
	WebDriver driver;
	public AttachmentFilePage(WebDriver driver) {
        this.driver = driver;
    }
    
	protected WebElement tabTepDinhKem;

	protected WebElement buttonThemTep;

	@FindBy(css = ".z-tabs-header .z-tab-hm span")
	protected List<WebElement> allTabLable;
	
	@FindBy(css = "input[type=file]")
	protected WebElement buttonChonTep;

	@FindBy(css = ".z-groupbox-cnt .button.z-button-os")
	protected List<WebElement> allButton;

	@FindBy(css = ".z-groupbox-cnt .z-select .z-option:nth-child(1)")
	protected WebElement fileTypeGCNKinhDoanh;

	@FindBy(css = ".z-groupbox-cnt .z-select .z-option:nth-child(2)")
	protected WebElement fileTypeTCCL;

	@FindBy(css = ".z-groupbox-cnt .z-select .z-option:nth-child(3)")
	protected WebElement fileTypePhuongPhapKiemNghiem;

	@FindBy(css = ".z-groupbox-cnt .z-select .z-option:nth-child(4)")
	protected WebElement fileTypeOther;

	public void chonTabTepDinhKem() {
		tabTepDinhKem = allTabLable.get(1);
		tabTepDinhKem.click();
	}
	
	public void clickButtonChonTep() throws Exception{
		buttonChonTep.sendKeys("C:\\Users\\Admin\\Downloads\\645b96400b048d49937824ef3862f005.jpg");
		waitForUploadFileComplete();
		clickButtonThemTep();
		
	}
	public void clickButtonThemTep(){

		buttonThemTep = allButton.get(5);	
		buttonThemTep.click();
		//waitForSaveFileUploadFileCoplete() ;
	}
	
	public void chonLoaiTepDangKyKinhDoanh() throws Exception
	{
		fileTypeGCNKinhDoanh.click();
	}
	
	public void chonLoaiTepTieuChuanChatLuong() throws Exception
	{
		fileTypeTCCL.click();
	}
	public void chonLoaiTepPPKiemNghiem() throws Exception
	{
		fileTypePhuongPhapKiemNghiem.click();	
	}
	public void chonLoaiTepKhac() throws Exception
	{
		fileTypeOther.click();		
	}
	int i=1;
	public void saveAllAttachFiles() throws Exception
	{
		chonTabTepDinhKem();
		
		chonLoaiTepDangKyKinhDoanh();
		clickButtonChonTep();
		waitForSaveFileUploadFileCoplete(i);
		i++;
		chonLoaiTepTieuChuanChatLuong();		
		clickButtonChonTep();
		waitForSaveFileUploadFileCoplete(i);
		i++;
		chonLoaiTepPPKiemNghiem();		
		clickButtonChonTep();
		waitForSaveFileUploadFileCoplete(i);
		i++;
		chonLoaiTepKhac();
		clickButtonChonTep();
		waitForSaveFileUploadFileCoplete(i);
		i++;
	}
	
	private void waitForUploadFileComplete() {
		Wait<WebDriver> wait = new WebDriverWait(driver, 30);
		wait.until(visibilityOfElementLocated(By.cssSelector(".newFile.z-hlayout .z-hlayout-inner .z-label")));
	}
	private void waitForSaveFileUploadFileCoplete(int i) {
		Wait<WebDriver> wait = new WebDriverWait(driver, 30);
		wait.until(visibilityOfElementLocated(By.cssSelector(".z-groupbox-cnt .z-listbox-body table tbody:nth-child(2) tr:nth-child(" + i + ")")));
	}

    private ExpectedCondition<WebElement> visibilityOfElementLocated(final By locator) {
		return new ExpectedCondition<WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement toReturn = driver.findElement(locator);
				if (toReturn.isDisplayed()) {
					return toReturn;
				}
				return null;
			}
		};
	}

}
