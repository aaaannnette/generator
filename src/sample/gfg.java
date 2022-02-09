package sample;

public class gfg {
    //Функция генирирует рандомное число для seed
    public static int[] lcm(int seed, int mod, int multiplier,
                    int inc,
                    int noOfRandomNum)
    {

        int[] randomNums = new int[noOfRandomNum];

        //Инициализируем seed
        randomNums[0] = seed;

        //Переход для создания необходимого номера случайных чисел
        for (int i = 1; i < noOfRandomNum; i++) {

            //Следуем линейному конгруэнтному методу
            randomNums[i] = ((randomNums[i - 1] * multiplier) + inc) % mod;
        }

        return randomNums;
    }
}


