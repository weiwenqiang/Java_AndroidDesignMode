package nineteen;
/**
 * ���ģʽ
 */
public class Client2 {
	public static void main(String[] args) {
		//����һ��Ŀ¼�����ʾC�̸�Ŀ¼
		Dir diskC = new Folder("C");
		//C�̸�Ŀ¼����һ���ļ�ImbaMallLog.txt
		diskC.addDir(new File("ImbaMallLog.txt"));
		//C�̸�Ŀ¼�»���3����Ŀ¼
		Dir dirWin = new Folder("Windows");
		//windowsĿ¼�����ļ�explorer.exe
		dirWin.addDir(new File("explorer.exe"));
		diskC.addDir(dirWin);
		//perflogs Ŀ¼
		Dir dirPer = new Folder("PerfLogs");
		//perflogs Ŀ¼�����ļ�null.txt
		dirPer.addDir(new File("null.txt"));
		diskC.addDir(dirPer);
		//Program File Ŀ¼
		Dir dirPro = new Folder("Program File");
		//Program File Ŀ¼�����ļ�ftp.txt
		dirPro.addDir(new File("ftp.txt"));
		diskC.addDir(dirPro);
		//��ӡ���ļ��ṹ
		diskC.print();
	}
}
