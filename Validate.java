public class Validate {
    public static boolean validateName(String name)
    {
        return name.matches("[A-Z][a-zA-Z]*");
        //Первые скобки проверяет каждый символ на буквы с вверхним регистром
        //Вторые же все буквы с маленьким,высоким регистром
        //Знак "*" сравнивает любые номера, даже нулевые.
    }

    public static boolean validateAddress(String address)
    {
        return address.matches("\\d+\\s+([a-zA-Z]+[a-zA-Z]+\\s[a-zA-Z])");
        /*
          \d - вычисляет любые введенные нам числа
          \s - вычисляет введенные пробельные символы
          [a-zA-Z]+[a-zA-Z] - обрабатываем буквы начинающие с низкими и высокими регистрами
         */
    }

    public static boolean validateCity(String city)
    {
        return city.matches("([a-zA-Z]+[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    public static boolean validatePhone(String phone)
    {
        return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
        //[1-9]-любые символы от 1-9
        //{2} - ищет две цифры из ранжировки [1-9];
        //{4} - ищет четыре цифры
    }
}
