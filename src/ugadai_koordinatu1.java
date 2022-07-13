import java.util.Scanner;

public class ugadai_koordinatu1
{
    public static void main(String[] args)
    {
        var sc = new Scanner(System.in);
        int[] computer_number = new int[]{random(0 , 100), random(0 , 100)};
        int money = 50;

        while (true)
        {
            if (money >= 5)
            {
                System.out.println("Твое количество деняг:" + money);
                System.out.println("Введите две координаты ЧЕРЕЗ ПРОБЕЛ!!!!!");
                String[] line = sc.nextLine().split(" ");
                int[] koordinata = new int[]{Integer.parseInt(line[0]), Integer.parseInt(line[1])};
                if (koordinata[0] < computer_number[0] && koordinata[1] < computer_number[1])
                {
                    money -= 5;
                    System.out.println("Правее бери! \n Выше бери!");
                }
                if (koordinata[0] > computer_number[0] && koordinata[1] > computer_number[1])
                {
                    money -= 5;
                    System.out.println("Левее бери! \n Ниже бери!");
                }
                if (koordinata[0] < computer_number[0] && koordinata[1] > computer_number[1])
                {
                    money -= 5;
                    System.out.println("Правее бери! \n Ниже бери!");
                }
                if (koordinata[0] > computer_number[0] && koordinata[1] < computer_number[1])
                {
                    money -= 5;
                    System.out.println("Левее бери! \n Выше бери!");
                }
                if (koordinata[0] == computer_number[0] && koordinata[1] == computer_number[1])
                {
                    money += 500;
                    System.out.println("УЛЬТРАМЕГАХОРОШ!");
                }
                if (koordinata[0] < computer_number[0] && koordinata[1] == computer_number[1])
                {
                    money -= 5;
                    System.out.println("Правее бери! \n Чел харош!");
                }
                if (koordinata[0] > computer_number[0] && koordinata[1] == computer_number[1])
                {
                    money -= 5;
                    System.out.println("Левее бери! \n Чел харош!");
                }
                if (koordinata[0] == computer_number[0] && koordinata[1] < computer_number[1])
                {
                    money -= 5;
                    System.out.println("Чел харош! \n Выше бери!");
                }
                if (koordinata[0] == computer_number[0] && koordinata[1] > computer_number[1])
                {
                    money -= 5;
                    System.out.println("Чел харош \n Ниже бери");
                }
            }
            else
            {
                System.out.println("Сасай лалка");
                System.out.println(computer_number[0] + " " + computer_number[1]);
                break;
            }
        }
    }

    public static int random (int left , int right)
    {
        int result = (int)((Math.random() + 0.0001) * (right - left) + left);
        return result;
    }
}