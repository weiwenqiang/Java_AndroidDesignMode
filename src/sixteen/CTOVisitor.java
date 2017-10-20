package sixteen;

public class CTOVisitor implements Visitor {

	@Override
	public void visit(Engineer engineer) {
		System.out.println("工程师："+engineer.name +",代码行数："+engineer.getCodeLines());
	}

	@Override
	public void visit(Manager mgr) {
		System.out.println("经理："+mgr.name+",产品数量："+mgr.getProducts());
	}

}
