package MyEntity;

public class Commercial {
	public class Commercial extends Connection {

		public Commercial(int currentReading, int previousReading, float[] slabs) {
			super(currentReading, previousReading, slabs);
			// TODO Auto-generated constructor stub
		}
	    double Bill;
		@Override
		public float computeBill() {
			// TODO Auto-generated method stub
			if(currentReading>=0 && currentReading<=50)
			{
				Bill=currentReading*5.2;
			}
			else if(currentReading>50 && currentReading <= 100)
			{
				Bill=(50*2.3)+((currentReading-50)*6.8);
			}
			else
			{
				Bill=(50*2.3)+(50*4.2)+((currentReading-100)*8.3);
			}

			return (float) Bill;
		}

	}

}
