package inheritanceConcept;

public class ChildClassTwo extends ParentClass{
	public static void main(String[] args) {
		ParentClass parentClass = new ParentClass();
		parentClass.getDiscountPercentage();
		
		ParentClass parentClassRef = new ChildClassTwo();
		parentClassRef.getDiscountPercentage();
				
		ChildClassTwo childClassTwo = new ChildClassTwo();
		childClassTwo.getDiscountPercentage();
		childClassTwo.getChildTwoPropertyValue();
	}

	@Override
	public void getDiscountPercentage() {
		System.out.println("Discount Percentage in Child Class Two is 20%");
	}
	
	public void getChildTwoPropertyValue()
	{
		System.out.println("Property value in Child Class Two is 50Cr");

	}
}
