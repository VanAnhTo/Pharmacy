package page.material.add;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import domain.detail.material.MaterialDetail;
import domain.detail.material.PageDetail;
import util.PropertiesStore;

public class NormalPage extends PageEvent {

	WebDriver driver;

	public NormalPage(WebDriver driver) throws NumberFormatException, IOException {
		super(driver);
		positionOfFileNumberField = Integer
				.parseInt(PropertiesStore.getProperty("PositionOfFileNumberField_NormalPage"));
		positionOfSignWhereField = Integer
				.parseInt(PropertiesStore.getProperty("PositionOfSignWhereField_NormalPage"));

		positionOfMaterialNameFeild = Integer
				.parseInt(PropertiesStore.getProperty("PositionOfMaterialNameFeild_NormalPage"));
		positionOfContenMaterialField = Integer
				.parseInt(PropertiesStore.getProperty("PositionOfContenMaterialField_NormalPage"));
		positionOfAmountMaterialField = Integer
				.parseInt(PropertiesStore.getProperty("PositionOfAmountMaterialField_NormalPage"));
		positionOfQualityMaterialField = Integer
				.parseInt(PropertiesStore.getProperty("PositionOfQualityMaterialField_NormalPage"));
		positionOfQuyCachDongGoi = Integer
				.parseInt(PropertiesStore.getProperty("PositionOfQuyCachDongGoi_NormalPage"));
		positionOfUnitMaterialFeild = Integer
				.parseInt(PropertiesStore.getProperty("PositionOfUnitMaterialFeild_NormalPage"));

		positionOfProviderMaterialField = Integer
				.parseInt(PropertiesStore.getProperty("PositionOfProviderMaterialField_NormalPage"));
		positionOfProviderMaterialCombobox = Integer
				.parseInt(PropertiesStore.getProperty("PositionOfProviderMaterialCombobox_NormalPage"));

		positionOfManufacturalMaterialField = Integer
				.parseInt(PropertiesStore.getProperty("PositionOfManufacturalMaterialField_NormalPage"));
		positionOfManufacturalMaterialCombobox = Integer
				.parseInt(PropertiesStore.getProperty("PositionOfManufacturalMaterialCombobox_NormalPage"));

		positionOfRegistrationNumberField = Integer
				.parseInt(PropertiesStore.getProperty("PositionOfRegistrationNumberFeild_NormalPage"));

		positionOfAddMaterialButton = Integer
				.parseInt(PropertiesStore.getProperty("PositionOfAddMaterialButton_NormalPage"));
		positionOfaveListMaterialButton = Integer
				.parseInt(PropertiesStore.getProperty("PositionOfaveListMaterialButton_NormalPage"));				

	}
	
	public void saveMaterialWith(PageDetail new2ddDetails) {
		waitForTextboxFeildAppear();
		this.clickCopporateCheckBox();
		this.enterFileNumberFieldAs(new2ddDetails.getFileNumber());
		this.enterSignWhereFieldAs(new2ddDetails.getSignWhere());

		int i = 1;
		for (MaterialDetail materialDetail : new2ddDetails.getMaterialDetailList()) {
			this.enterAmountMaterialFieldAs(materialDetail.getAmountMaterial());
			this.enterContenMaterialFieldAs(materialDetail.getContenMaterial());
			this.enterMaterialNameFieldAs(materialDetail.getMaterialName());
			this.enterUnitMaterialFieldAs(materialDetail.getUnitMaterial());
			this.enterRegistrationNumberFieldAs(materialDetail.getRegistrationNumber());
			this.enterContentImportFeildAs(materialDetail.getContentImportl());
			this.enterContentrationFeildAs(materialDetail.getContentration());
			this.enterQualityMaterialFieldAs(materialDetail.getQualityMateriall());
			this.enterQuyCachDongGoiAs(materialDetail.getQuyCachDongGoi());
			this.clickCommitedCheckbox();
			this.focusOnProviderMaterialField();
			this.chooseProviderMaterialCombobox();
			this.focusManufacturalMaterialField();
			this.chooseManufacturalMaterialCombobox();
			this.clickAddMaterialButton();
			waitForDataFillOnTableComplete(i);
			i++;
		}
		this.clickSaveListMaterialButton();
		waitForAlert();
	}
	
}
