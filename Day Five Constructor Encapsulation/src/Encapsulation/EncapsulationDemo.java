package Encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//object creation

				OopsConceptDemo obj=new OopsConceptDemo();
				
				obj.setAge(34);
				obj.setName("Manoj");
				obj.setSerialNum(12345);
				
				System.out.println(obj.getName());
				System.out.println(obj.getAge());
				System.out.println(obj.getSerialNum());
				
				System.out.println(obj);

	}

}
