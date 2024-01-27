public class ArithmeticMeanCalculator {

    public static void main(String[] args) {

        double[] Ricxvebi = {22.5, 16.5, 50.0, 4.0};
        double Mnishnveloba = calculateArithmeticMean(Ricxvebi);
        System.out.println("ამ რიცხვების საშუალო არითმეტიკული არის : " + Mnishnveloba);

        String str1 = "გამარჯობა მე ვარ ცოტნე";
        String str2 = "იმედი მაქვს კოდი მოგეწონება :)";
        String str3 = "შეხვედრამდე";

        int SigrdzisJami = calculateSumOfStringLengths(str1, str2, str3);
        System.out.println("ამ სტრინგების ჯამი არის : " + SigrdzisJami);
    }

    public static double calculateArithmeticMean(double[] Ricxvebi) {
        if (Ricxvebi == null || Ricxvebi.length == 0) {
            throw new IllegalArgumentException("სამწუხაროდ მასივი არის ცარიელი :/ .");
        }

        double Jami = 0.0;
        for (double num : Ricxvebi) {
            Jami += num;
        }

        double Mnishnveloba = Jami / Ricxvebi.length;

        return Mnishnveloba;
    }

    public static int calculateSumOfStringLengths(String... strings) {
        for (String str : strings) {
            if (str == null) {
                throw new IllegalArgumentException("შეყვანილი სტრინგი არის ნული.");
            }
        }

        int SingrdzisJami = 0;

        for (String str : strings) {
            SingrdzisJami += str.length();
        }

        return SingrdzisJami;

    }
}
