package sixteen;
/**
 * 设计模式-访问者
 */
public class Client {
	public static void main(String[] args) {
		BusinessReport report = new BusinessReport();
		System.out.println("=========给CEO看的报表=========");
		report.showReport(new CEOVisitor());
		System.out.println("=========给CTO看的报表=========");
		report.showReport(new CTOVisitor());
	}
}
