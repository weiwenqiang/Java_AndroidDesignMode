package sixteen;

public class CTOVisitor implements Visitor {

	@Override
	public void visit(Engineer engineer) {
		System.out.println("����ʦ��"+engineer.name +",����������"+engineer.getCodeLines());
	}

	@Override
	public void visit(Manager mgr) {
		System.out.println("����"+mgr.name+",��Ʒ������"+mgr.getProducts());
	}

}
