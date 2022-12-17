package LabaratoryThree.LaboratoryTwo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class CalendarCustom {


    public static void Date() {
        ArrayList<Integer> listOne = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();
        String date = General.sScannerCustom();
        String date1 = General.sScannerCustom();
        String date3 = General.sScannerCustom();
        String date4 = General.sScannerCustom();


        String kok = String.valueOf(date.charAt(0));
        kok = kok.concat(String.valueOf(date.charAt(1)));
        String kok1 = String.valueOf(date.charAt(3));
        kok1 = kok1.concat(String.valueOf(date.charAt(4)));
        String kok2 = String.valueOf(date.charAt(6));
        kok2 = kok2.concat(String.valueOf(date.charAt(7)));

        String bob = String.valueOf(date1.charAt(0));
        bob = bob.concat(String.valueOf(date1.charAt(1)));
        String bob1 = String.valueOf(date1.charAt(3));
        bob1 = bob1.concat(String.valueOf(date1.charAt(4)));
        String bob2 = String.valueOf(date1.charAt(6));
        bob2 = bob2.concat(String.valueOf(date1.charAt(7)));


        String jon = String.valueOf(date3.charAt(0));
        jon = jon.concat(String.valueOf(date3.charAt(1)));
        String jon1 = String.valueOf(date3.charAt(3));
        jon1 = jon1.concat(String.valueOf(date3.charAt(4)));
        String jon2 = String.valueOf(date3.charAt(6));
        jon2 = jon2.concat(String.valueOf(date3.charAt(7)));

        String fox = String.valueOf(date4.charAt(0));
        fox = fox.concat(String.valueOf(date4.charAt(1)));
        String fox1 = String.valueOf(date4.charAt(3));
        fox1 = fox1.concat(String.valueOf(date4.charAt(4)));
        String fox2 = String.valueOf(date4.charAt(6));
        fox2 = fox2.concat(String.valueOf(date4.charAt(7)));


        LocalDate res = LocalDate.of(parseInt("20" + kok2), parseInt(kok1), parseInt(kok));
        LocalDate res1 = LocalDate.of(parseInt("20" + bob2), parseInt(bob1), parseInt(bob));

        LocalDate res2 = LocalDate.of(parseInt("20" + jon2), parseInt(jon1), parseInt(jon));
        LocalDate res3 = LocalDate.of(parseInt("20" + fox2), parseInt(fox1), parseInt(fox));

        long resDate1 = ChronoUnit.DAYS.between(res, res1);
        System.out.print(resDate1);
        long resDate2 = ChronoUnit.DAYS.between(res2, res3);
        System.out.print(resDate2);
        int sum = (int) (parseInt(kok)+resDate1);
        int sum2 = (int) (parseInt(bob)+resDate1);
        int sum3 = (int) (parseInt(jon)+resDate1);
        int sum4 = (int) (parseInt(fox)+resDate2);

        for (int i = parseInt(kok); i < sum2 ; i++) {
            listOne.add(i);
        }
        for (int i =parseInt(jon); i < sum4 ; i++) {
            listTwo.add(i);
        }
        Arrays.sort(new ArrayList[]{listOne});
        Arrays.sort(new ArrayList[]{listTwo});
        ArrayList<Object> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < listOne.size() && j < listTwo.size()) {
            if (listOne.get(i) > listTwo.get(j)) {
                j++;

            } else if (listOne.get(i) < listTwo.get(j)) {
                i++;

            } else {
                result.add(listOne.get(i));
                i++;
                j++;
            }
        }

        int resN = result.size();
        System.out.print(listOne);
        System.out.print(listTwo);
        System.out.print(resN);

    }


}


