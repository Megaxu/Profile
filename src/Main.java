import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String fio = scan.nextLine();

        /*
        String surname = .substring(0,fio.indexOf(' '));
        String name = fio.substring(fio.indexOf(' '),fio.lastIndexOf(' ')).trim();
        String patronymic = fio.substring(fio.lastIndexOf(' ')).trim();
        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + patronymic);
        */

        String[] fioR = fio.split("\\s+");

        if(fioR.length != 3)
        {
            System.out.println("Данные указаны не верно.");
        }

        else
        {
            System.out.println("Фамилия: " + fioR[0]);
            System.out.println("Имя: " + fioR[1]);
            System.out.println("Отчество: " + fioR[2]);
        }



    }
}
