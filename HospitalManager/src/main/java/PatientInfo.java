
public class PatientInfo {


	private String code, dept; //진료코드, 진료부서

	int age, day, num, checkupFee, fee;//나이, 입원일수, 번호,진료비(총합), 진찰비, 입원비(할인율적용), 총입원비
	double afterRatefee, totFee;
	double rate;//할인율

	public PatientInfo(String code, int age, int day, int num) {
		super();
		this.code = code;
		this.age = age;
		this.day = day;
		this.num = num;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getTotFee() {
		return totFee;
	}

	public void setTotFee(double totFee) {
		this.totFee = totFee;
	}

	public int getCheckupFee() {
		return checkupFee;
	}

	public void setCheckupFee(int checkupFee) {
		this.checkupFee = checkupFee;
	}

	public double getAfterRatefee() {
		return afterRatefee;
	}

	public void setAfterRatefee(double afterRatefee) {
		this.afterRatefee = afterRatefee;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}



}
