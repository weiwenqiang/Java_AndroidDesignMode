package sixteen;
/**
 * ���ģʽ-������
 */
public class Client {
	public static void main(String[] args) {
		BusinessReport report = new BusinessReport();
		System.out.println("=========��CEO���ı���=========");
		report.showReport(new CEOVisitor());
		System.out.println("=========��CTO���ı���=========");
		report.showReport(new CTOVisitor());
	}
}
