package LabaratoryThree.LaboratoryTwo;

public class CustomException {
    public CustomException(int i) {
    }

    public static void vExpNoValid(int val) throws Exception {
        switch (val) {
            case (0) -> {
                throw new Exception("Строки не равны без учета регистра");
            }
            case (1) -> {
                throw new Exception("Строки не равны c учета регистра");
            }
            case (2) -> {
                throw new Exception("Строка не является перевертышем");
            }
            case (3) -> {
                throw new Exception("Проверку не прошел  Это не похоже на адрес электронной почты  \n");
            }
            case (4) -> {
                throw new Exception("Проверку не прошел  Это не похоже на номера телефона  \n");
            }
            case (5) -> {
                throw new Exception("Проверку не прошел  Это не похоже на ip address(ipv4)  \n");
            }
        }

    }

}
