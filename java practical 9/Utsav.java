class Utsav{	
		public static void main(String args[]){
		
		long startTime=0;
		long endTime=0;
		String s = new String("Utsav");
		StringBuilder a = new StringBuilder("Utsav");
		StringBuffer b = new StringBuffer("Utsav");
			startTime = System.nanoTime();
		for(int i=1;i<=2026;i++){
			s= s +"_"+ i;
			}
			endTime = System.nanoTime();
			long stringTime =endTime - startTime;

			startTime = System.nanoTime();
		for(int i=1;i<=2026;i++){
			a= a.append("_").append(i);			
		}
			endTime = System.nanoTime();
			long sBuilderTime =endTime - startTime;
			
			startTime = System.nanoTime();
		for(int i=1;i<=2026;i++){
			b= b.append("_").append(i);			
		}
			endTime = System.nanoTime();
			long sBufferTime =endTime - startTime;


			System.out.println("Time for string: "+stringTime+" ns");
			System.out.println("Time for StringBuilder: "+sBuilderTime+" ns");
			System.out.println("Time for StringBuffer: "+sBufferTime+" ns");

	}
		
}