import java.util.Scanner;

public class Daire12 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		double borcmiktar,faizoran�,ayl�kfaizoran�,sonuc ;
		int kacsene;
		Scanner input=new Scanner(System.in);
		System.out.print ("Bor� Miktar�n� Giriniz:");
		borcmiktar=input.nextDouble();
		System.out.print ("Y�ll�k Faiz Oran�:");
		faizoran�=input.nextDouble();
		System.out.print ("Ka� Sene:");
		kacsene=input.nextInt();
		sonuc=(borcmiktar+(((borcmiktar*faizoran�)/100)*kacsene));
		ayl�kfaizoran�=faizoran�/12;
		System.out.print("Bor�:"+sonuc+",Ayl�k �demeniz:"+
		String.format("%.2f",(sonuc/(kacsene*12)))+".");
		
				
		
		
		
		
		
	}

}
