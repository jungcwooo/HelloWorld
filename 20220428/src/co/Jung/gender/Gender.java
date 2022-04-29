package co.Jung.gender;

public class Gender {
	public static void main(String[] args) {
		String[] arr = { "010102-4", "991012-1", "960304-1", "881012-2", "040403-3" };
		int men = 0;
		int women = 0;

		for (int i = 0; i < arr.length; i++) {

			if ((arr[i].charAt(7) - '0') == 1 || (arr[i].charAt(7) - '0') == 3) {
				men++;
			} else if ((arr[i].charAt(7) - '0') == 2 || (arr[i].charAt(7) - '0') == 4) {
				women++;
			}

		}
		System.out.println("남 : " + men + ", 여 : " + women);
	}
}
