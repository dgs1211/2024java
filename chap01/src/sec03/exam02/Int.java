package sec03.exam02;

public class Int {
	public static void main(String[] args) {
		int hour = 4;
		int minute = 8;
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + "분");		
	}

}
