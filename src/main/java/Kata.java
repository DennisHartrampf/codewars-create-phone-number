public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder phoneNumber = new StringBuilder("(");
        for (int i = 0; i < numbers.length; i++) {
            switch (i) {
                case 2:
                    phoneNumber.append(numbers[i]);
                    phoneNumber.append(") ");
                    break;
                case 5:
                    phoneNumber.append(numbers[i]);
                    phoneNumber.append("-");
                    break;
                default:
                    phoneNumber.append(numbers[i]);
            }
        }
        return phoneNumber.toString();
    }
}
