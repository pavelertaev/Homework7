public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Циклы Задание 1
        // С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей.
        //Результат программы должен быть выведен в консоль в формате "Месяц … , сумма накоплений равна … рублей" с тем количеством месяцев,
        // необходимым для накопления данной суммы.
        System.out.println("Задание 1");
        int salary = 100000;
        int total = 0;
        int i = 0;
        while ( total < 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
            i++;
        }
        System.out.println(total);
        System.out.println(i);


        //Циклы Задание 2
        //Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
        // На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
        //Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
        // Не забудьте выполнить переход на новую строку между двумя циклами.
        //В результате программы вывод должен получиться следующий:
        //1 2 3 4 5 6 7 8 9 10
        //10 9 8 7 6 5 4 3 2 1
        System.out.println("Задание 2");
        for (int a = 10; a >= 1; a--) {
            System.out.print(a+ " ");
        }
        System.out.println();
        int b = 1;
        while (b <= 10) {
            System.out.print(b + " ");
            b++;
        }
        System.out.println();
        //Циклы Задание 3
        //В стране Y население равно 12 миллионам человек.
        //Рождаемость составляет 17 человек на 1000 человек, смертность - 8 человек.
        // Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание, что показатели рождаемости и смертности постоянны.
        //В консоль выведите результат операции на каждый год в формате "Год …, численность населения составляет … "
        System.out.println("Задание 3");
        int people = 12_000_000; // Население страны
        double fertility =(double) 17/1000;
        double mortality = (double) 8/1000;
        int c = 0;
        while (c<10) {
            people =(int) (people - (people * mortality) + (people * fertility));
            c++;
            System.out.println("Год " + c + " , численность населения составляет " + people);
        }

        //Циклы Задание 4
        //Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей при условии,
        // что процент банка от накоплений не меняется, а всегда равен 7%.
        //Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
        System.out.println("Задание 4");
        int bank = 15000;
        int total1 = 0;
        for (int d = 0; total1 <= 12_000_000; d++) {
            bank = bank + ((bank / 100) * 7);
            total1 = total1 + bank;
            System.out.println("Месяц " + d + " , сумма накоплений равна " + total1 + " рублей");
        }


        //Циклы задание 5
        //Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а только каждый шестой.
        //Должны быть видны накопления за 6, 12, 18, 24 и далее месяцы.
        System.out.println("Задание 5");
        int bank1 = 15000;
        int total2 = 0;
        for (int d = 0; total2 <= 12_000_000; d++) {
            bank1 = bank1 + ((bank1 / 100) * 7);
            total2 = total2 + bank1;
            if (d % 6 == 0)
                System.out.println("Месяц " + d + " , сумма накоплений равна " + total2 + " рублей");
        }

        //Циклы Задание 6
        //Василий решил, что год копить деньги ближайшие 9 лет. И он хочет знать, какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
        //Исходная сумма всё так же 15 тысяч рублей, проценты банка – 7% ежемесячно.
        //Напишите программу, которая будет выводить Василию сумму его накоплений за следующие каждые полгода в течение 9 лет.
        System.out.println("Задание 6");
        int bank2 = 15000;
        int total3 = 0;
        for (int d = 0; d <= 108; d++) {
            bank2 = bank2 + ((bank2 / 100) * 7);
            total3 = total3 + bank2;
            if (d % 6 == 0)
                System.out.println("Месяц " + d + " , сумма накоплений равна " + total3 + " рублей");
        }

        //Циклы Задание 7
        //В вашей компании пятница является днем отчетным.
        //Нам нужно написать программу, которая считает дни месяца по датам, определяет,
        // какой день пятница, и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
        //Условия задачи:
        //Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
        //Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
        //"Сегодня пятница, ...-е число. Необходимо подготовить отчет."
        //В нашем месяце 31 день. В результате у вас должно вывестись от 4 до 5 сообщений с напоминаниями по разным датам.
        System.out.println("Задание 7");
        int dayMonth = 31;//Дней в месяце
        int firstFriday = 1;// Первая пятница месяца
        while (firstFriday <= dayMonth) {
            if (firstFriday % 7 == 1) {
                System.out.println("Сегодня пятница , " + firstFriday + "-е число. Необходимо подготовить отчет");
            }firstFriday++;
        }

        //Циклы . Задание 8
        //Мы решили написать астрономическое приложение, которое считает, когда над Землей пролетают кометы и их можно будет увидеть.
        // Для начала нам нужно посчитать траекторию движения кометы, которая пролетает рядом с Землей каждый 79-й год, начиная с нулевого.
        //Нам нужно узнать, в каких годах комета пролетала рядом с Землей за последние 200 лет и когда мы увидим ее в следующий раз.
        //Условия задачи:
        //В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления.
        //Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего (из созданной ранее переменной)
        // в качестве старта и 100 лет после в качестве завершения периода расчета.
        //В результате решения задачи в консоль должен вывестись следующий результат:
        //1896
        //1975
        //2054
        System.out.println("Задание 8");
        int year = 1850; // Год начала отсчета периода пролета кометы
        int year1 = 2100; // Год завершения периода отсчета пролета кометы
        int yearComet = 79; //Период когда комета пролетает над землей
        while(year < year1){
            if(year % 79 ==0) {
                System.out.println("Комета будет пролетать над землей в " + year + " году" );
            }year++;
        }

        //Циклы Задание 9
        //Напишите программу, которая выводит в консоль таблицу умножения на 2:
        //2*1=2
        //2*2=4
        //2*3=6
        //2*4=8
        //2*5=10
        //2*6=12
        //2*7=14
        //2*8=16
        //2*9=18
        //2*10=20
        System.out.println("Задание 9");
        int a= 2;
        int k = 0;
        for ( int n =1 ;  n <= 10 ; n++){
            k=a*n;
            System.out.println(a + "*" + n + "=" + k  );
        }



    }
}

