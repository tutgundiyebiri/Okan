import java.util.Scanner;

public class Daire12 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		double borcmiktar,faizoraný,aylýkfaizoraný,sonuc ;
		int kacsene;
		Scanner input=new Scanner(System.in);
		System.out.print ("Borç Miktarýný Giriniz:");
		borcmiktar=input.nextDouble();
		System.out.print ("Yýllýk Faiz Oraný:");
		faizoraný=input.nextDouble();
		System.out.print ("Kaç Sene:");
		kacsene=input.nextInt();
		sonuc=(borcmiktar+(((borcmiktar*faizoraný)/100)*kacsene));
		aylýkfaizoraný=faizoraný/12;
		System.out.print("Borç:"+sonuc+",Aylýk Ödemeniz:"+
		String.format("%.2f",(sonuc/(kacsene*12)))+".");
		
				
		
		
		
		
		
	}

}
