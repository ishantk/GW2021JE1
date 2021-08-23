
public class MultiValueContainer {

	public static void main(String[] args) {

		int confirmedCountry = 23422;
		int activeCountry = 30400;
		int recoveredCountry = 645151;
		int deceasedCountry = 3000;
		
		int confirmedState1 = 23422;
		int activeState1 = 30400;
		int recoveredState1 = 645151;
		int deceasedState1 = 3000;
		
		int confirmedState2 = 23422;
		int activeState2 = 30400;
		int recoveredState2 = 645151;
		int deceasedState2 = 3000;
		
		int confirmedState3 = 23422;
		int activeState3 = 30400;
		int recoveredState3 = 645151;
		int deceasedState3 = 3000;
		
		// Multi Value Container
		// 1. Array -> Homogenous and Fixed in Size
		// 2. Object -> Homogenous or Hetrogeneous and Dynamic Size
		// 3. DataStructures known as Collections in Java :) Homogenous or Hetrogeneous and Dynamic Size
		
		//					       0       1		2      3
		int countryCaseStatus[] = {23422, 30400, 645151, 3000};
		
		int state1CaseSatus[] = {23422, 30400, 645151, 3000};
		int state2CaseSatus[] = {23422, 30400, 645151, 3000};
		int state3CaseSatus[] = {23422, 30400, 645151, 3000};
		
		System.out.println("confirmedCountry is: "+confirmedCountry);	// 23422
		System.out.println("countryCaseStatus is: "+countryCaseStatus); // HashCode

		// confirmedCountry -> is a Primitive
		// countryCaseStatus is a Reference Variable :)
		// Reference Variable will hold the HashCode of Multi Value Container
		
		System.out.println(countryCaseStatus[0]);
		System.out.println(countryCaseStatus[1]);
		System.out.println(countryCaseStatus[2]);
		System.out.println(countryCaseStatus[3]);
		
		
	}

}
