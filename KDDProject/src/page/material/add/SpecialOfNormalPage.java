package page.material.add;

import org.openqa.selenium.WebDriver;

public class SpecialOfNormalPage extends PageEvent {
	WebDriver driver;

	public SpecialOfNormalPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void enterFileNumberFieldAs(String fileNumber)
	{
		fileNumberField = allTextbox.get(0);
		fileNumberField.clear();
		fileNumberField.sendKeys(fileNumber);
	}
	@Override
	public void enterAmountMaterialFieldAs(String amountMaterial)
    {
    	amountMaterialField = allTextbox.get(3);
    	amountMaterialField.clear();
    	amountMaterialField.sendKeys(amountMaterial);
    }
	@Override
	public  void enterQuyCachDongGoiFieldAs(String quyCachDongGoi)
	{}
	
	@Override
	public void enterQualityMaterialFieldAs(String qualityMaterial)
    {
    	qualityMaterialField = allTextbox.get(4);
    	qualityMaterialField.clear();
    	qualityMaterialField.sendKeys(qualityMaterial);
    }
	
	//cong ty cung cap
	@Override
	public void focusOnProviderMaterialField()
	{
		providerMaterialField = allChosenbox.get(0);
		providerMaterialField.click();
	}
	@Override
	public void chooseProviderMaterialCombobox() {
		providerMaterialCombobox = allChosenComboboxChild1.get(2);
		providerMaterialCombobox.click();
	}

	// ct san xuat
	@Override
		public void focusManufacturalMaterialField() {
			manufacturalMaterialField = allChosenbox.get(1);
			manufacturalMaterialField.click();
		}
	@Override
	public void choosemanufacturalMaterialCombobox() 
	{
		manufacturalMaterialCombobox = allChosenComboboxChild2.get(2);
		manufacturalMaterialCombobox.click();
	}
	@Override
	public void enterRegistrationNumberFeildAs(String registrationNumner) {
		registrationNumberFeild = allTextbox.get(5);
		registrationNumberFeild.clear();
		registrationNumberFeild.sendKeys(registrationNumner);
	}
}
