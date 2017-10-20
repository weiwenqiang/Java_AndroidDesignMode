package seven;

public class PriceCalculator {
	//����������
	private static final int BUS =1;
	//��������
	private static final int SUBWAY = 2;
	//���⳵����
	private static final int TAXI = 3;
	
	public static void main (String[] args){
		PriceCalculator calculator = new PriceCalculator();
		System.out.println("��16����Ĺ�����Ʊ��Ϊ��"+calculator.calculatePrice(16, BUS));
		System.out.println("��16����ĵ�����Ʊ��Ϊ��"+calculator.calculatePrice(16, SUBWAY));
	}
	/**
	 * ������������10����֮��һ��Ǯ������10����֮��ÿ��һԪǮ���Գ�5����
	 */
	private int busPrice(int km){
		//����10������ܾ���
		int extraTotal = km -10;
		//�����ľ�����5����ı���
		int extraFactor = extraTotal /5;
		//�����ľ����5����ȡ��
		int fraction = extraTotal % 5;
		//����۸�
		int price = 1+extraFactor * 1;
		return fraction >0? ++price : price;
	}
	
	/**
	 * 
	 */
	private int subwayPrice(int km){
		if(km<=6){
			return 3;
		}else if(km>6 && km<12){
			return 4;
		}else if(km >12 && km <22){
			return 5;
		}else if(km >22 && km<32){
			return 6;
		}else {
			return 7;
		}
	}
/**
 * �򵥼���Ϊÿ����2ԪǮ
 */
	private int taxiPrice(int km){
		return km * 2;
	}
	
	int calculatePrice(int km, int type){
		if(type == BUS){
			return busPrice(km);
		}else if(type == SUBWAY){
			return subwayPrice(km);
		}else if(type == TAXI){
			return taxiPrice(km);
		}
		return 0;
	}
}
