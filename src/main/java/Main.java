package momoang;

public class bibijj {
	
	public static boolean seriesNom(int number) {
		if (number<10)
			return false;
		int num=number;
		int count=0;
		double sum=0;
		while (num>0) {
			num=num/10;
			count++;
		}
		double num1 = number/Math.pow(10, count-1);
		double num2 = number/Math.pow(10, count-2);
		num2=num2%10;
		num1=Math.floor(num1);
		num2=Math.floor(num2);
		count--;
		if (num1>num2) {
			num2=num2+10;
		}
		sum=num2-num1;
		for (int i=0;i<count;count--) {
			double num11 = number/Math.pow(10, count);
			double num21 = number/Math.pow(10, count-1);
			num21=num21%10;
			num11=num11%10;
			num11=Math.floor(num11);
			num21=Math.floor(num21);
			if (num11>num21) {
				num21=num21+10;
			}
				if (sum!=num21-num11)
					return false;
			}
		return true;
		}
	
	public static String findExpPremium(DigitalGadget[]a) {
		int max=0;
		String name=null;
		for (int i=0;i<a.length;i++) {
			if (a[i].isPremium()) {
				if (a[i].getPrice()>=max) {
					max=a[i].getPrice();
					name=a[i].getModelName();
			}
			}
		}
		return name;
	}
	
	public static DigitalGadget[] build(DigitalGadget[]a) {
		DigitalGadget[] p=new DigitalGadget[a.length];
		int count=0;
		for (int i=0;i<a.length;i++) {
			if (a[i].isPremium()) {
				p[count]=a[i];
			}
		}
		for (int i=0;i<a.length;i++) {
			if (a[i].isPremium()==false) {
				p[count]=a[i];
			}
	}
		return p;
	}

	public static void main(String[] args) {
	}
	
}
