package three;
//自由扩展你的项目-Builder模式
public class Test {
	public static void main(String[] args) {
		//构建器
		Builder builder = new MacbookBuilder();
		
		Director pcDirector = new Director(builder);
		//封装构建过程
		pcDirector.construct("英特尔主板", "Retina显示器");
		//构建计算机，输出相关信息
		System.out.println("Computer Info : " + builder.create().toString());
		
	}
}
