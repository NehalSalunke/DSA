package salunke_nehal;

public class OtpThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		char[] vowels = {'A','E','I','O','U'};
			while(true)
				{
					int pos =(int)(Math.random()*4);
					String otp = String.valueOf(vowels[pos]);
					for(int iTmp=0; iTmp<4; iTmp++)
						otp+= (int)(Math.random()*9);
					System.out.println(otp);
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		
		
	}

}
