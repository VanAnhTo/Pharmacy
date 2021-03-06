package domain.detail.material;

public class MaterialDetail {

	private String materialName;
	private String contentMaterial;
	private String unitMaterial;
	private String amountMaterial;
	private String qualityMaterial;
	private String registrationNumber;
	private String contentration;
	private String contentImport;
	private String quyCachDongGoi;

	public MaterialDetail(String materialName, String contentMaterial, String unitMaterial, String amountMaterial,
			String qualityMaterial, String registrationNumber, String contentration, String contentImport, String quyCachDongGoi) {

		this.materialName = materialName;
		this.contentMaterial = contentMaterial;
		this.unitMaterial = unitMaterial;
		this.amountMaterial = amountMaterial;
		this.qualityMaterial = qualityMaterial;
		this.registrationNumber = registrationNumber;
		this.contentration = contentration;
		this.contentImport = contentImport;
		this.quyCachDongGoi = quyCachDongGoi;

	}
	
	public String getQuyCachDongGoi()
	{
		return quyCachDongGoi;
	}

	public String getMaterialName() {
		return materialName;
	}

	public String getContenMaterial() {
		return contentMaterial;
	}

	public String getUnitMaterial() {
		return unitMaterial;
	}

	public String getQualityMateriall() {
		return qualityMaterial;
	}

	public String getAmountMaterial() {
		return amountMaterial;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public String getContentration() {
		return contentration;

	}

	public String getContentImportl() {
		return contentImport;
	}
}
