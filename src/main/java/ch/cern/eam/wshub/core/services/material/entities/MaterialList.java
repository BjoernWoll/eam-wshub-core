package ch.cern.eam.wshub.core.services.material.entities;

public class MaterialList {

	private String materialListCode;
	private String partCode;
	private String lineNumber;
	private String quantity;
	private String reserve;
	private String equipmentCode;
	
	public String getMaterialListCode() {
		return materialListCode;
	}
	public void setMaterialListCode(String materialListCode) {
		this.materialListCode = materialListCode;
	}
	public String getPartCode() {
		return partCode;
	}
	public void setPartCode(String partCode) {
		this.partCode = partCode;
	}
	public String getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getReserve() {
		return reserve;
	}
	public void setReserve(String reserve) {
		this.reserve = reserve;
	}
	
	@Override
	public String toString() {
		return "MaterialList ["
				+ (materialListCode != null ? "materialListCode="
						+ materialListCode + ", " : "")
				+ (partCode != null ? "partCode=" + partCode + ", " : "")
				+ (lineNumber != null ? "lineNumber=" + lineNumber + ", " : "")
				+ (quantity != null ? "quantity=" + quantity + ", " : "")
				+ (reserve != null ? "reserve=" + reserve + ", " : "")
				+ (equipmentCode != null ? "equipmentCode=" + equipmentCode
						: "") + "]";
	}
	public String getEquipmentCode() {
		return equipmentCode;
	}
	public void setEquipmentCode(String equipmentCode) {
		this.equipmentCode = equipmentCode;
	}
	

}
