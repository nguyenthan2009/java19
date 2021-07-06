import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên");
        String str = sc.nextLine();
        String[] student= {"Nam","Hải","Tiến","MINH"};
        for(int i=0;i< student.length;i++){
            if(student[i].equals(str)){
                System.out.println("Position of the students in the list " + str + " is: " + (i + 1));
                break;
            }else{
                System.out.println("Not found" + str+ " in the list.");

            }
        }
    }

}
