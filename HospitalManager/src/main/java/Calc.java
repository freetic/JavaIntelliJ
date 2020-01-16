
//병원

//private String code, dept; //진료코드, 진료부서
//
//int age, day, num, totFee, checkupFee, afterRatefee, Fee;//나이, 입원일수, 번호,진료비(총합), 진찰비, 입원비(할인율적용), 총입원비
//
//double rate;//할인율



//계산해야할 값
//
//
//총입원비 fee -if 3과 작거나 같다면 day *30000, 아니면, day*3 +(day-3)*25000
//
//입원비(할인율적용) Fee *rate인데 rate는 day가 10 일이면 할인 안해줌 10 -15미만면 0.85 15-20미만이면 0.8 20-30미만 0.77 30~100미; 0.72 100이만 0.68
//
//진찰비: 나이에 따라서 있음
//
//진료비(총합)= 진찰비 + 입원비



public class Calc {
	private PatientInfo [] patients;


	public Calc(PatientInfo [] patients) {this.patients = patients;}
	public void calc() {

		for(int i = 0; i < patients.length; i++) {
			int day = patients[i].getDay();
			int age = patients[i].getAge();
			int fee = 0;
			if(day <=3) fee = day *30000;
			else if (day >3) fee = 3*30000 + (day-3)*25000;
			patients[i].setFee(fee);
			if(day < 10) {
				patients[i].setAfterRatefee(fee);
			} else if(day < 15) {
				patients[i].setAfterRatefee(fee*0.85);
			} else if(day < 15) {
				patients[i].setAfterRatefee(fee*0.85);
			} else if(day < 20) {
				patients[i].setAfterRatefee(fee*0.8);
			} else if(day < 30) {
				patients[i].setAfterRatefee(fee*0.77);
			} else if(day < 100) {
				patients[i].setAfterRatefee(fee*0.72);
			} else{
				patients[i].setAfterRatefee(fee*0.68);
			}
			if(age < 10) {
				patients[i].setCheckupFee(7000);
			}else if(age < 20) {
				patients[i].setCheckupFee(5000);
			}else if(age < 30) {
				patients[i].setCheckupFee(8000);
			}else if(age < 40) {
				patients[i].setCheckupFee(7000);
			}else if(age < 50) {
				patients[i].setCheckupFee(4500);
			}else  {
				patients[i].setCheckupFee(2300);
			}
			patients[i].setTotFee(patients[i].getCheckupFee() + patients[i].getAfterRatefee());
		}




		//입원비


	}
}