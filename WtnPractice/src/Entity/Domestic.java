package Entity;

public class Domestic extends Connection{

	public Domestic(int currentReading, int previousReading, float[] slabs) {
		super(currentReading, previousReading, slabs);
		// TODO Auto-generated constructor stub
	}
   double Bill;
	@Override
	public float computeBill() {
		// TODO Auto-generated method stub
		if(currentReading>=0 && currentReading<=50)
		{
			Bill=currentReading*2.3;
		}
		else if(currentReading>50 && currentReading<=100)
		{
			Bill=(50*2.3)+((currentReading-50)*4.2);
		}
		else
		{
			Bill=(50*2.3)+(50*4.2)+((currentReading-100)*5.5);
		}
		return (float) Bill;
		
	}

}
