package sixteen;

public class CEOVisitor implements Visitor{

	@Override
	public void visit(Engineer engineer) {
		System.out.println("����ʦ��"+engineer.name +",KPI��"+engineer.kpi);
	}

	@Override
	public void visit(Manager mgr) {
		System.out.println("����"+mgr.name+",KPI��"+mgr.kpi+",�²�Ʒ������"+mgr.getProducts());
	}

}
