package generic;
//제너릭 클래스. 그리고 <T> 
public class GenericPrinter<T extends Material> {
	
	private T material;
	
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void doPrinting() {
		material.doPrinting();
	}
	
	

}
