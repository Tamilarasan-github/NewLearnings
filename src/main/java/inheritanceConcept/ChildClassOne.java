package inheritanceConcept;

public class ChildClassOne extends ParentClass {

	public static void main(String[] args) {
		ParentClass parentClass = new ParentClass();
		parentClass.getDiscountPercentage();
	}

	@Override
	public void getDiscountPercentage() {
		System.out.println("Discount Percentage in Child Class One is 15%");
	}

}
