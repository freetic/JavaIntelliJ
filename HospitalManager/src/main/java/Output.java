
public class Output {
private PatientInfo[] ps;
public Output(PatientInfo[] ps) {
	this.ps=ps;
	
}
public void output() {
	printLabel();
	for(int i = 0; i < ps.length; i++){
		System.out.printf("%d\t %s\t %d\t %d\t %d\t ",
				ps[i].getNum(),ps[i].getDept(),ps[i].getCheckupFee(),ps[i].getAfterRatefee(),ps[i
						].getFee());
	}

}
private void printLabel() {
	System.out.println("---�������� ���α׷�---");
	System.out.println("��ȣ  �����μ�  ������  �Կ���  �����");
	System.out.println("------------------------");
}
}
