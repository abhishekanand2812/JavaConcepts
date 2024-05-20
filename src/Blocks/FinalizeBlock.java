package Blocks;

//final, finally , finalize
public class FinalizeBlock {

	// finalize() coming from Object class
	@Override
	public void finalize() {
		System.out.println("im into FinalizeBlock finalizse method");
	}


	public static void main(String[] args) {

		FinalizeBlock obj = new FinalizeBlock();
		obj = null;
		
		Hello h = new Hello();
		h = null;
		System.gc();// calling gc
		System.out.println("end of program");

	}

}